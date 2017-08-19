package org.ims.ignou.dao.employee.registration;

import java.sql.Connection;

public class Statement 
{
	
	
		public String qualification10th(){
			return "insert into QUALIFICATION_DETAILS_EMPLOYEE(COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,COURSE_NAME,ID) "
					+ "values(?,?,?,'10th',?)";
		}
		public String qualification12th(){
			return "insert into QUALIFICATION_DETAILS_EMPLOYEE(COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,STREAM,COURSE_NAME,ID) "
					+ "values(?,?,?,?,'12th',?)";
		}
		public String qualificationCertificate(){
			return "insert into QUALIFICATION_DETAILS_EMPLOYEE(COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,GRADE,COURSE_NAME,ID) "
					+ "values(?,?,?,?,'Certificate',?)";
		}
		public String qualificationDiploma(){
			return "insert into QUALIFICATION_DETAILS_EMPLOYEE(COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,GRADE,COURSE_NAME,ID) "
					+ "values(?,?,?,?,'Certificate',?)";
		}
		
			public void statement()
			{				
				String insertemployee="insert into employee(salary,dob,job_timeing,name,position_name,father_name,maritial_status,contact_number,id,email_id,category,gender,residental_address,address,zipcode,state,city,country,image_path) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";							
				String insertqualification="insert into ";
			
			
			}
	
	
	
	
}
