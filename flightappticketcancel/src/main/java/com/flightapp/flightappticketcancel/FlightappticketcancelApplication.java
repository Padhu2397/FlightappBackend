package com.flightapp.flightappticketcancel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient

@SpringBootApplication
public class FlightappticketcancelApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightappticketcancelApplication.class, args);
	}

}
