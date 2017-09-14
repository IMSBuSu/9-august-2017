package org.ims.ignou.dao.finance;

public class SqlStmtgetfinane {

	
	
	
	public static String getCourse(){
		
	return 	"select COURSENAME from student";
	}

	public static String getsalary() {
		// TODO Auto-generated method stub
		return "select SALARY from employee";
	}

	
	public static String getcourseFee(){
		
		return "select COURSE_FEES,COURSE_NAME from course";
	}
}
