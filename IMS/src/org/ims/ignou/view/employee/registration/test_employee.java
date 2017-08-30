package org.ims.ignou.view.employee.registration;

import java.util.ArrayList;

import org.ims.ignou.helper.employee.registration.CourseGet;
import org.ims.ignou.view.extendable.Registration;

public class test_employee 
{
	public static void main(String[] args){		
		
		CourseGet arrayList=new CourseGet();
		ArrayList<String> course=arrayList.getCourseFromDb();
		RegistrationeEmployee employee;
		if(course!=null)
		{

					employee=new RegistrationeEmployee(course);
					employee.setVisible(true);
		}
		else{
			employee=new RegistrationeEmployee(new ArrayList<String>());
			employee.setVisible(true);			
		}

	}	
	
}