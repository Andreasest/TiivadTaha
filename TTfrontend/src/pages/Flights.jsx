import FlightCard from "../components/FlightCard";
import { useState, useEffect } from "react";
import "../css/Flights.css";
import { fetchFlights } from "../services/api";

function Flights() {
  const [flights, setFlights] = useState([]);
  const [searchQuery, setSearchQuery] = useState("");
  //-----------------
  useEffect(() => {
    const getFlights = async () => {
      const flightData = await fetchFlights();
      setFlights(flightData);
    };
    getFlights();
  }, []);
  const filteredFlights = flights.filter((flight) => {
    return (
      flight.airline.toLowerCase().includes(searchQuery.toLowerCase()) ||
      flight.origin.toLowerCase().includes(searchQuery.toLowerCase()) ||
      flight.destination.toLowerCase().includes(searchQuery.toLowerCase())
    );
  });
  //------------------------------
  const handleSearch = (e) => {
    e.preventDefault();
    alert(searchQuery);
  };

  return (
    <div className="flights">
      <form onSubmit={handleSearch} className="search-form">
        <input
          type="text"
          placeholder="Search for flights..."
          className="search-input"
          value={searchQuery}
          onChange={(e) => setSearchQuery(e.target.value)}
        />
        <button type="submit" className="search-button">
          Search
        </button>
      </form>

      <div className="flights-grid">
        {flights.map((flight) => (
          <FlightCard flight={flight} key={flight.id} />
        ))}
      </div>
    </div>
  );
}

export default Flights;
