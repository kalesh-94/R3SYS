package ai.day5.Inheritance;

import java.util.Scanner;

class Company {
	String companyName="Deloitt";
	String employeeId;
	String employeeName;
	Scanner sc = new Scanner(System.in);
	
	void getCommonDetails(){
		System.out.println("Enter Employee Name: ");
		employeeName = sc.nextLine();
		System.out.println("Enter Employee ID: ");
		employeeId = sc.next();
	}
	
	void displayCommonDetails(){
		System.out.println(companyName+"\n"+employeeName+"\n"+employeeId);
	}
	
	
}



class PermanentEmployee extends Company{
	double basicPay;
	double hra;
	double da;
	double total_salary;
	
	void getDetails(){
		System.out.println("basicPay:");
		basicPay = sc.nextDouble();
		System.out.println("hra: ");
		hra = sc.nextDouble();
		System.out.println("da: ");
		da = sc.nextDouble();
	}
	void calculateSalary(){
		total_salary= basicPay+hra+da;
		System.out.println("Total salary is: ");
	}
	
	void displayPayslip(){
		System.out.println("basicPay:"+basicPay);
		System.out.println("hra:"+hra);
		System.out.println("da:"+da);
		System.out.println("total_salary:"+total_salary);
	}
}



class TemporaryEmployee extends Company{
	int hoursWorked;
	double ratePerHour;
	double totalWage;
	
	void getDetails(){
		System.out.println("hoursWorked");
		hoursWorked = sc.nextInt();
		System.out.println("ratePerHour: ");
		ratePerHour  = sc.nextDouble();
		
	}
	
	void calculateWage(){
		totalWage = hoursWorked* ratePerHour;
		System.out.println("Total: "+totalWage);
	}
	
	void displayPayslip(){
		System.out.print(hoursWorked +"<--hoursWorked ");
		System.out.print(ratePerHour +"<---ratePerHour ");
		System.out.print(totalWage +"<---totalWage ");
	}
	
}




















public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee pe = new PermanentEmployee();
		pe.getCommonDetails();
		pe.displayCommonDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choise: 1: Permanent Emp \n 2: Temporary Emp");
		int choise= sc.nextInt();
		switch(choise){
		case 1:
			pe.getDetails();
			pe.calculateSalary();
			pe.displayPayslip();
			break;
		case 2:
			TemporaryEmployee te = new TemporaryEmployee();
			te.getDetails();
			te.calculateWage();
			te.displayPayslip();
			break;
			
		default:
			System.out.println("Enter valid choise");
			break;
		}
		
		
		

	}

}
