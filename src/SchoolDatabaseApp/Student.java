package SchoolDatabaseApp;
//import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Student {

	private String firstName; 
	private String lastName;
	private static int grade;
	private double gpa;
	private HashMap <String , String> gradeList; 
	private String courses;
	private static int  studentId;
	private int accountBalance;
	private int fee = 400;
	private static String[] courseList; 
	
	public Student ( ) { 
		
	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter Student's first name :" );
	this.firstName = input.nextLine();
	
	System.out.println("Please Enter Student's last name :" );
	this.lastName = input.nextLine();
	
	System.out.println("Please Enter student's grade level /n 1 for Freshman /n 2 for Sophmore /n 3 for Junior /n 4 for Senior " );
	 this.grade = input.nextInt();
	 
	 System.out.println(" Student's first name :" + firstName +  "/n" + "Student's last name :" + lastName + "/n" + "Student's Grade :" + grade );
	 
	 setStudentId();
	
	 enroll();
	 
	 courseListGenerate();
		
	}
	
	private void setStudentId() {
		 if (grade == 1) {
		    	Student.studentId = 1000;
		    }
		    else if (grade == 2) {
		    	Student.studentId = 2000;
		    }
		    else if (grade == 3) {
		    	Student.studentId = 3000;
		    }
		    else Student.studentId = 4000;
		    
			 Student.studentId++;
	} 
	public static int getGrade() {
		return grade;
	}
	
	public void enroll() {
		System.out.println("Enter 1 to enroll your prerequisites or Enter 0 to quit enrollment module");
		Scanner input = new Scanner(System.in); 
		String enrollStatus = input.nextLine();
		
		if(enrollStatus == "1") {
			 this.courses = "Active"; 
			 this.accountBalance = accountBalance + fee * 4; 
		}
		else this.courses = "Inactive"; 
		
		
		
	}
	
	public void courseListGenerate () {
		
		if (courses == "Active" && grade == 1) {
		 this.courseList[0] = "Math"; 
		 this.courseList[1] = "Eng";
		 this.courseList[2] = "Science";
		 this.courseList[3] = "Arts"; 
	}
		else if (courses == "Active" && grade == 2) {
			 this.courseList[0] = "Math2"; 
			 this.courseList[1] = "Eng2";
			 this.courseList[2] = "Science2";
			 this.courseList[3] = "Gym"; 
			
		}
		else if (courses == "Active" && grade == 3) {
			 this.courseList[0] = "Math3"; 
			 this.courseList[1] = "Eng3";
			 this.courseList[2] = "Science3";
			 this.courseList[3] = "History"; 
		}
		else if (courses == "Active" && grade == 4) { 
			 this.courseList[0] = "Math4"; 
			 this.courseList[1] = "Eng4";
			 this.courseList[2] = "Science4";
			 this.courseList[3] = "Computer Technology"; 
			
		}
			
			
	}
	
	
	public HashMap<String, String> getGradeList() {
		return gradeList; 
	}
	
	public static String[] getCourseList() {
		return courseList.clone();
	}
	
	public double calculateGpa () {
		double sumOfLetterGrade = 0; 
		 
		for(int i = 0;  i <= gradeList.size() ; i++) {
			String letter = gradeList.get(i);
			
			switch(letter) {
			case "A": 
				sumOfLetterGrade += 4.0;
				break;
			case "A-": 
				sumOfLetterGrade += 3.7;
				break;
			case "B+":
				sumOfLetterGrade += 3.3;
				break;
			case "B":	
				sumOfLetterGrade += 3.0;
				break;
			case "B-":
				sumOfLetterGrade += 2.7;
				break;
			case "C+":
				sumOfLetterGrade += 2.3;
				break;
			case "C":	
				sumOfLetterGrade += 2.0;
				break;
			case "C-":
				sumOfLetterGrade += 1.7;
				break;
			case "D+":
				sumOfLetterGrade += 1.3;
				break;
			case "D": 
				sumOfLetterGrade += 1.0;
				break;
			case "F": 
				sumOfLetterGrade += 0.0; // not really needed, but makes the program clearer
				break;
			default:
				System.out.println("Unknown grade for the" + gradeList.get(letter));
				
		} 
			
			
		}
		double gpa = sumOfLetterGrade / gradeList.size();
		return gpa;
	}
	
	
	
	
	
}
