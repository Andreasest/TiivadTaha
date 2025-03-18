package com.andreas.TiivadTaha;

import com.andreas.TiivadTaha.lend.Flight;
import com.andreas.TiivadTaha.lend.Airline;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {

	private static final Logger log= LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	/*
	@Bean
	CommandLineRunner runner(){
		return args -> {
			Airline airBaltic = new Airline("Air Baltic");
			Flight flight = new Flight(1,"Air Baltic", LocalDateTime.now(),LocalDateTime.now().plus(15, ChronoUnit.HOURS),"TLL","LAX",0);
			log.info("Lend: "+ flight);
		};
	}*/

}
