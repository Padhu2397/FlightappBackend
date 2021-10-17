package com.flightapp.flightappticketview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient

@SpringBootApplication
public class FlightappticketviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightappticketviewApplication.class, args);
	}

}
