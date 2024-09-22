package com.generation;

import java.util.HashMap;
import java.util.Map;

public class Manager extends Employee {

	private Map<Integer, Representante>salesTeam; 
	

	public Manager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
	
	}//Manager

	//-----seañadio eel representante al team 
	public void addRepresentante (int registration, Representante Representante) {
		salesTeam.put(registration, Representante); 
	}//addRepresentante

   //Commision de Manager en ventas de team
	 public double calculateComission() {
		 double totalSales = 0.0;
		
		 for (Map.Entry<Integer, Representante> entry: salesTeam.entrySet()) {
			 totalSales += entry.getValue().getRepresentante();		
			 }//
		return 0;
		
	 }//
	
	 
	
}//class Manager
