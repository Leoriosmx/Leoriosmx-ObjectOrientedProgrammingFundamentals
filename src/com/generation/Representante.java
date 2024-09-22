package com.generation;

public class Representante extends Employee  {

	private double Representante; 
	
	

	public Representante(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		// TODO Auto-generated constructor stub
	}
	public double getRepresentante() {
		return this.Representante;
	}//getRepresentante
	public void setRepresentante(double representante) {
		Representante = representante;
	}//setRepresentante

	@Override
	public String toString() {
		return "Representante [Representante=" + Representante + Representante + "]";
	}//toString

	public int calculateComission(){
	      // comission = 0.1 * Representante
	  double comission = 0.1 * Representante;
	  return  (int) (0.1 * comission); 
	}//calculateComission	
}//classRepresentante
