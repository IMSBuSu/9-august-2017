package org.ims.ignou.dao.student.registration;

public class SqlstmtStudentReg {

	
	
	
	private static 	String qualification10th=qualification10th();
	private static	String qualification12th=qualification12th();
	private static	String qualificationCertificate=qualification();
	private static	String qualificationDiploma=qualification();
	private static	String qualificationPostGraduation=qualification();
	private static	String qualificationUnderGraduation=qualification();
	private static	String qualificationOther=qualification();		
	

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
		public static String student(){
			return "insert into student"
					+ "(TOTALFEES,REAMINFEES,DOB,NAME,FATHER_NAME,"
					+ "MARITIAL_STATUS,CONTACT_NUMBER,ID,EMAIL_ID,CATEGORY,"
					+ "GENDER,ADDRESS,ZIPCODE,STATE,CITY,"
					+ "COUNTRY,TEACHERNAME,COURSENAME,BATCH_TIMEING) "
					+ "values("
					+ "?,?,?,?,?,"
					+ "?,?,student_id.nextval,?,?,"
					+ "?,?,?,?,?,"
					+ "?,?,?,?)";
			}
		
			
			public static String updateImagePath(){				
				return "update student set IMAGE_PATH=? where id=?";
			}
			
			
			public static String studentID(){
				return "select ID from student where DOB=?  and NAME=? and FATHER_NAME=? and CONTACT_NUMBER=?";
			}

			
			private static String qualification10th(){
				return "insert into QUALIFICATION_DETAILS_STUDENT(COURSE,COMPLETE_YEAR,INSTITUTION_NAME,PERCENTAGE,ID,GRADE) "
						+ "values('10th',?,?,?,?,?)";
			}

			private static String qualification12th(){
				return "insert into QUALIFICATION_DETAILS_STUDENT(COURSE,COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,STREAM,GRADE,ID) "
						+ "values('12th',?,?,?,?,?,?)";
			}
			
			private static String qualification(){			
				return "insert into QUALIFICATION_DETAILS_STUDENT(COURSE,COMPLETE_YEAR,PERCENTAGE,INSTITUTION_NAME,GRADE,COURSE_NAME,ID) "
						+ "values(?,?,?,?,?,?,?)";
			}

			
	
}
