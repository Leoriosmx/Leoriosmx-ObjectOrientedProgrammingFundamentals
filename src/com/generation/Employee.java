package com.generation;

public class Employee {
	private String firstName;
    private String lastName;
    private int registration;
    private int age;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;
    private int yearsWorked;

    // Constructor
    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;                      
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked; 
    }//Employee 

    //---- Métodos Getters and Setters ---// 
    
    public String getFirstName() {
        return this.firstName;
    }//getFirstName
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//setFirstName

    public String getLastName() {
        return this.lastName;
    }//getLastName
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//setLastName

    public int getRegistration() {
        return this.registration;
    }//getRegistration
    
    public void setRegistration(int registration) {
        this.registration = registration;
    }//setRegistration

    public int getAge() {
        return this.age;
    }//getAge
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }//else
    }//setAge

    public int getDaysWorked() {
        return this.daysWorked;
    }//getDaysWorked

    public void setDaysWorked(int daysWorked) {
        if (daysWorked >= 0) {
            this.daysWorked = daysWorked;
        } else {
            System.out.println("Los días trabajados no pueden ser negativos.");
        }//else
    }//setDaysWorked
    
    public int getVacationDaysTaken() {
        return this.vacationDaysTaken;
    }//getVacationDaysTaken
    
    public void setVacationDaysTaken(int vacationDaysTaken) {
        if (vacationDaysTaken >= 0) {
            this.vacationDaysTaken = vacationDaysTaken;
        } else {
            System.out.println("Los días de vacaciones tomados no pueden ser negativos.");
        }//else
    }//setVacationDaysTaken

    public double getSalary() {
        return this.salary;
    }//getSalary
    
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }//else
    }//setSalary
    
    public int getYearsWorked() {
    	return this.yearsWorked;
    }//getYearsWorked
    public void setYearsWorked (int yearsWorked) {
    	if (yearsWorked >=0) {
    		this.yearsWorked = yearsWorked;
    	}//if
    System.out.println("Los días de trabajo no puden ser negativos");
    }//setYearsWorhed
    
    ////Implement the methods:
  
    //Tiempo de jubilación
    public int timeToRetirement(){
       // time to retirement = min(60 - age, 40 - yearsWorked)
    	int yearsWorked = daysWorked / 360;// suponiendo que se rifo los 360 días del año
    	return Math.min(60 - age, 40 - yearsWorked);
    }//timeToRetirement
    
 // Tiempo de vacaciones
    public int vacationTimeLeft() {
        return (int) ((daysWorked / 360.0) * (30 - vacationDaysTaken));
    }//vacationTimeLeft
 
// Bono
    public double calculateBonus() {
        return 2.2 * salary;
    }//calculateBonus

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	}//toString

 
    
}//Employee


