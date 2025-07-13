package ai.day5.Inheritance;

import java.util.Scanner;

class University{
	String universityName="Dr. Babasaheb University, Lonere";
	
	void displayUniversityInfo(){
		System.out.println("Your University is: "+universityName);
		
	}
}



class College extends University {
	String collegeName= "R.C.Patel Institute of Tech. Shirpur";
	
	void displayCollegeInfo(){
		System.out.println(collegeName);
		 
	}
}


class Student extends College{
	Scanner sc = new Scanner(System.in);
	String studentName;
	String rollNumber;
	int marks1,marks2,marks3;
	float avg;
	
	void getStudentInfo(){
		System.out.println("Enter Student Name: ");
		studentName = sc.nextLine();
		System.out.println("Enter Roll: ");
		rollNumber = sc.next();
		System.out.println("Enter marks1: ");
		marks1= sc.nextInt();
		System.out.println("Enter marks2: ");
		marks2= sc.nextInt();
		System.out.println("Enter marks3: ");
		marks3= sc.nextInt();
		System.out.println(studentName+"\n"+rollNumber+"\n"+marks1+"\n"+marks2+"\n"+marks3);
		
	}
	
	void calculatePercentage(){
		 avg = (marks1+marks2+marks3)/3;
		 
	}
	
	
	void displayStudentInfo(){
		System.out.println("\n This is your whole information");
		System.out.println(universityName);
		System.out.println(collegeName);
		System.out.println(studentName+"\n"+rollNumber+"\n"+marks1+"\n"+marks2+"\n"+marks3);
		System.out.println("and Your Precentage is "+avg);
	}
}
















public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std = new Student();
		std.getStudentInfo();
		std.calculatePercentage();
		std.displayStudentInfo();

	}

}
