package org.ims.ignou.dao.student.registration;

public class SqlstmtBatchDetailGet {

			
			public static String getBatchDetail(){
				return "select  ID,COURSE_NAME,BATCH_TIMEING from batch_details";
			}
			
			
			public static String getEmployeeName(){
				return "select id,NAME from employee";
			}

			
			public static String getCourse(){
					return "select COURSE_DURATION,COURSE_FEES,COURSE_NAME from course"; 
			}
		
}
