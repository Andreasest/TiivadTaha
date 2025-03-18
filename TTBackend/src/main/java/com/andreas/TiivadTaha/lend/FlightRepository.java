package com.andreas.TiivadTaha.lend;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class FlightRepository {

    private List<Flight> flights=new ArrayList<>();

    List<Flight> findAll() {
        return flights;
    }
    Optional<Flight> findById(Integer id) {
        return flights.stream()
                    .filter(flight -> flight.getId() == id)
                    .findFirst();
    }


    void create(Flight flight) {
        flights.add(flight);
    }

    void update(Flight flight, Integer id) {
        Optional<Flight> existingFlight = findById(id);
        if (existingFlight.isPresent()) {
            Flight existing = existingFlight.get();

            existing.setAirline(flight.getAirline());
            existing.setDeparture(flight.getDeparture());
            existing.setArrival(flight.getArrival());
            existing.setOrigin(flight.getOrigin());
            existing.setDestination(flight.getDestination());
            existing.setLayovers(flight.getLayovers());
            existing.setPrice(flight.getPrice());
            existing.setDuration(flight.getDuration());
            existing.setFlightNumber(flight.getFlightNumber());

        }
    }

    void delete(Integer id) {
        flights.removeIf(flight -> flight.getId().equals(id));
    }

    @PostConstruct
    private void init() {
        flights.add(new Flight(1,
                    "Air Baltic",
                "AF123",
                    LocalDateTime.now(),
                    LocalDateTime.now().plus(15, ChronoUnit.HOURS),
                    "TLL",
                    "LAX",
                    1,
                900));

        flights.add(new Flight(2,
                "Ryan Air",
                "GS124",
                LocalDateTime.now(),
                LocalDateTime.now().plus(3, ChronoUnit.HOURS),
                "TLL",
                "RIGA",
                0,
                69));
    }
}
