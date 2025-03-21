package com.andreas.TiivadTaha.lend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FlightNotFoundException extends RuntimeException {
    public FlightNotFoundException() {
        super("Flight not found");
    }
}
