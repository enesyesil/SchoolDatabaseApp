package SchoolDatabaseApp;
import java.util.HashMap;
import java.util.Scanner;

import studentManagementSystem.Student;

public class Teacher {

 private static int teacherId;
 private String firstName;
 private String lastName; 
 private int senorityLevel; 
 private HashMap <String , Integer > studentbyGradeList;
 private String teachingStatus; 
 private String teachingField; 
 private HashMap <String , Integer > teachingCourses;
 
	
	
	
public Teacher () {
	Scanner put = new Scanner(System.in);
	System.out.println("Please Enter Teacher's first name :" );
	 this.firstName = put.nextLine();
	 
	System.out.println("Please Enter Teacher's last name :" );
	this.lastName = put.nextLine();
	
	System.out.println("Please Enter Teacher's Field of Study :" );
	this.teachingField = put.nextLine();
	
	
	determineLevel();
	
	isStatus();
	
	
	
	
	
	
}


private void determineLevel() {
	Scanner put = new Scanner(System.in);
	System.out.println("Please Enter Teacher's years of experience :" );
	    int exp = put.nextInt();
	    
	    if (exp <=  5) {
	    	this.senorityLevel = 1;
	    }
	    else if (exp <= 10) {
	    	this.senorityLevel = 2;
	    }
	    else if (exp <= 15) {
	    	this.senorityLevel = 3;
	    }
	    else if (exp <= 20) {
	    	this.senorityLevel = 4;
	    	System.out.println("You are a legend!!");
	    }
	    
}

private void getCoursesOfTeaching() {
	String[] stuCourses = Student.getCourseList();
	int gradeOf = Student.getGrade();
	for(int i = 0 ; i <= stuCourses.length ; i++) {
		if (stuCourses[i] == teachingField ) {
			teachingCourses.put(stuCourses[i] , gradeOf); 
		}
	}
    
    
}

private void isStatus() {
	if (teachingCourses.size() > 0) {
		this.teachingStatus = "Active";
		
	
} 
}
	
private void getWorkingType () {
	
	if(teachingCourses.size() >= 3) {
		System.out.println("The Teacher Is Working Full-Time");
	}
	
	else System.out.println("The Teacher Is Working Part-Time");
}




	
}
