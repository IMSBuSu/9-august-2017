package org.ims.ignou.helper.employee.registration;

import java.util.ArrayList;

import org.ims.ignou.dao.employee.registration.CourseGetFromDB;

public class CourseGet {

	
	public ArrayList<String> getCourseFromDb(){
		
		CourseGetFromDB course=new CourseGetFromDB();
				if(course.getcourse()){
					
							return course.getCourseList();									
				}
		
		return null;
	}
	
	
	
	
	
}
