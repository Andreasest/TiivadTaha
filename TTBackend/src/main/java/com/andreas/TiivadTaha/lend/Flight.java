package com.andreas.TiivadTaha.lend;

import jakarta.validation.constraints.NotEmpty;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Flight {
    private Integer id;
    @NotEmpty
    private String airline;
    private String flightNumber;
    private String departure;
    private String arrival;
    @NotEmpty
    private String origin;
    private String destination;
    private int layovers;
    private int price;
    private String duration;


    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yy HH:mm");

    public Flight(Integer id, String airline, String flightNumber, LocalDateTime departure, LocalDateTime arrival, String origin, String destination, int layovers, int price) {
        this.id = id;
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.departure = departure.format(dateFormatter);
        this.arrival = arrival.format(dateFormatter);
        this.origin = origin;
        this.destination = destination;
        this.layovers = layovers;
        this.price = price;

        Duration flightDuration = Duration.between(departure, arrival);
        long hours = flightDuration.toHours();
        long minutes = flightDuration.toMinutes() % 60;
        this.duration = hours + "h " + minutes + "m";
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getLayovers() {
        return layovers;
    }

    public void setLayovers(int layovers) {
        this.layovers = layovers;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
