import "../css/Home.css";
import { useNavigate } from "react-router-dom";

function Home() {
  const navigate = useNavigate();

  return (
    <div className="home-empty">
      <h2>Main page coming s00n</h2>
      <button className="go-to-flights" onClick={() => navigate("/flights")}>
        Click me to see flights
      </button>
    </div>
  );
}

export default Home;
