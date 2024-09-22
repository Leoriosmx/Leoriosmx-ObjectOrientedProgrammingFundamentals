package com.generation;


public class Main {

	public static void main(String[] args) {
		System.out.println("Imprimo por consola...");
		Employee myEmployee = new Employee("Jean", "Gultier", 2022, 24, 15, 20, 5000, 6000); 
		Employee myEmployee1 = new Employee("Julia", "Murillo", 2020, 26, 15, 20, 5000, 6000); 
		Employee myEmployee2 = new Employee("Adan", "Frank", 2021, 29, 15, 20, 5000, 6000);
		//------------------------------------
		System.out.println(myEmployee.getFirstName());
        System.out.println(myEmployee.getLastName());	
		System.out.println(myEmployee.getRegistration());
		System.out.println(myEmployee.getAge());
		System.out.println(myEmployee.getDaysWorked());
		System.out.println(myEmployee.getVacationDaysTaken());
		System.out.println(myEmployee.getSalary());
		System.out.println(myEmployee.calculateBonus());
		System.out.println(myEmployee.vacationTimeLeft());
		System.out.println(myEmployee.timeToRetirement());
		///------------------------------------------------------	
		System.out.println(myEmployee1.getFirstName());
        System.out.println(myEmployee1.getLastName());	
		System.out.println(myEmployee1.getRegistration());
		System.out.println(myEmployee1.getAge());
		System.out.println(myEmployee1.getDaysWorked());
		System.out.println(myEmployee1.getVacationDaysTaken());
		System.out.println(myEmployee1.getSalary());
		System.out.println(myEmployee1.calculateBonus());
		System.out.println(myEmployee1.vacationTimeLeft());
		System.out.println(myEmployee1.timeToRetirement());
		//-------------------------------------------------------
		System.out.println(myEmployee2.getFirstName());
        System.out.println(myEmployee2.getLastName());	
		System.out.println(myEmployee2.getRegistration());
		System.out.println(myEmployee2.getAge());
		System.out.println(myEmployee2.getDaysWorked());
		System.out.println(myEmployee2.getVacationDaysTaken());
		System.out.println(myEmployee2.getSalary());
		System.out.println(myEmployee2.calculateBonus());
		System.out.println(myEmployee2.vacationTimeLeft());
		System.out.println(myEmployee2.timeToRetirement());
		//----------------------------------------------------
		myEmployee.setFirstName("Julia");
		System.out.println(myEmployee.getFirstName());	
		///============================
		myEmployee.getLastName();
		myEmployee.getRegistration();
		myEmployee.getAge();
		myEmployee.getDaysWorked();
		myEmployee.getVacationDaysTaken();
		myEmployee.getSalary();
 		///===========================
		System.out.println("Ejucutado: " );
		//SalesRep
		
		Representante representante1 = new Representante(" Alex", "Andrade", 2018, 32, 15, 20, 70000, 300 );  
		System.out.println(representante1.calculateComission());
		System.out.println(representante1.calculateComission());
	}//main

}//classMain
