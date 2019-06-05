package com.yash.book.ticket.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;



@SpringBootApplication
public class TicketBookingManagementAppApplication extends SpringBootServletInitializer{
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	         return application.sources(TicketBookingManagementAppApplication.class);
	    }


	public static void main(String[] args) {
	SpringApplication.run(TicketBookingManagementAppApplication.class, args);
	
	}
}
