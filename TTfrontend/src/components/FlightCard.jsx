import "../css/FlightCard.css";

function FlightCard({ flight }) {
  function onBookClick() {
    alert("Clicked book flight");
  }

  return (
    <div className="flight-card">
      <div className="flight-header">
        <h2 className="flight-airline">
          {flight.airline || "Airline not available"}
        </h2>
        <span className="flight-number">
          {flight.flightNumber || "Flight number not available"}
        </span>
      </div>
      <div className="flight-details">
        <div className="flight-info">
          <div className="flight-departure">
            <p className="label">Departure</p>
            <p className="location">{flight.origin || "N/A"}</p>
            <p className="time">{flight.departure}</p>
          </div>
          <div className="flight-duration">
            <p className="label">Duration</p>
            <p className="duration">{flight.duration || "N/A"}</p>
          </div>
          <div className="flight-arrival">
            <p className="label">Arrival</p>
            <p className="location">{flight.destination || "N/A"}</p>
            <p className="time">{flight.arrival}</p>
          </div>
        </div>
      </div>
      <div className="flight-price">
        <p className="label">Price</p>
        <p className="price">
          {flight.price ? `$${flight.price}` : "Price not available"}
        </p>
      </div>
      <button className="book-button" onClick={onBookClick}>
        Book Flight
      </button>
    </div>
  );
}

export default FlightCard;
