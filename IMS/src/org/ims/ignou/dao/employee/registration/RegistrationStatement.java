package org.ims.ignou.dao.employee.registration;

public class RegistrationStatement 
{
	
			private static 	String employee="insert into employee(SALARY,DOB,JOB_TIMEING,NAME,POSITION_NAME,FATHER_NAME,MARITIAL_STATUS,CONTACT_NUMBER,ID,EMAIL_ID,CATEGORY,GENDER,ADDRESS,ZIPCODE,STATE,CITY,COUNTRY,IMAGE_PATH) values(?,?,?,?,?,?,?,?,employee_id.nextval,?,?,?,?,?,?,?,?,?)";							
			private static 	String qualification10th=qualification10th();
			private static	String qualification12th=qualification12th();
			private static	String qualificationCertificate=qualification();
			private static	String qualificationDiploma=qualification();
			private static	String qualificationPostGraduation=qualification();
			private static	String qualificationUnderGraduation=qualification();
			private static	String qualificationOther=qualification();			
	
			private static String emailId="select EMAIL_ID from employee";
	
			
			public   String getGetEmailId() {
				return emailId;
			}
			
		private static String qualification10th(){
			return "insert into QUALIFICATION_DETAILS_EMPLOYEE(COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,COURSE_NAME,ID) "
					+ "values(?,?,?,'10th',?)";
		}

		private static String qualification12th(){
			return "insert into QUALIFICATION_DETAILS_EMPLOYEE(COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,STREAM,COURSE_NAME,ID) "
					+ "values(?,?,?,?,'12th',?)";
		}
		
		private static String qualification(){			
			return "insert into QUALIFICATION_DETAILS_EMPLOYEE(COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,GRADE,COURSE_NAME,ID) "
					+ "values(?,?,?,?,?,?)";
		}

		public static String getEmployee() {
			return employee;
		}

		public static String getQualification10th() {
			return qualification10th;
		}

		public static String getQualification12th() {
			return qualification12th;
		}

		public static String getQualificationCertificate() {
			return qualificationCertificate;
		}

		public static String getQualificationDiploma() {
			return qualificationDiploma;
		}

		public static String getQualificationPostGraduation() {
			return qualificationPostGraduation;
		}

		public static String getQualificationUnderGraduation() {
			return qualificationUnderGraduation;
		}

		public static String getQualificationOther() {
			return qualificationOther;
		}
		
	
	
	
}
