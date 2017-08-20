package org.ims.ignou.dao.employee.registration;

public class Statement 
{
	
			private static 	String employee="insert into employee(salary,dob,job_timeing,name,position_name,father_name,maritial_status,contact_number,id,email_id,category,gender,residental_address,address,zipcode,state,city,country,image_path) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";							
			private static 	String qualification10th=qualification10th();
			private static	String qualification12th=qualification12th();
			private static	String qualificationCertificate=qualificationCertificate();
			private static	String qualificationDiploma=qualificationCertificate();
			private static	String qualificationPostGraduation=qualificationCertificate();
			private static	String qualificationUnderGraduation=qualificationCertificate();
			private static	String qualificationOther=qualificationCertificate();				

	

			public void insertstatement()
			{				
					
			}
	
		private static String qualification10th(){
			return "insert into QUALIFICATION_DETAILS_EMPLOYEE(COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,COURSE_NAME,ID) "
					+ "values(?,?,?,'10th',?)";
		}
		private static String qualification12th(){
			return "insert into QUALIFICATION_DETAILS_EMPLOYEE(COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,STREAM,COURSE_NAME,ID) "
					+ "values(?,?,?,?,'12th',?)";
		}
		private static String qualificationCertificate(){			
			return "insert into QUALIFICATION_DETAILS_EMPLOYEE(COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,GRADE,COURSE_NAME,ID) "
					+ "values(?,?,?,?,'Certificate',?)";
		}
		
	
	
	
}
