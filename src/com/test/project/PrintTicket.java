package com.test.project;

import java.time.LocalDate;
import java.time.LocalTime;

public class PrintTicket {

	public static void main(String[] args) {
		
		int ticketNumber = 0;
		

		System.out.println("Enter from location: ");
		
		System.out.println("TICKET NO			: "+ ticketNumber++);
		
		System.out.println("Date & Time			: "+  LocalDate.now() +" "+ LocalTime.now());
		
		System.out.println("FROM				: ");
		
		System.out.println("TO					: ");
		
		System.out.println("No. of Passengers	: ");

	}

}
