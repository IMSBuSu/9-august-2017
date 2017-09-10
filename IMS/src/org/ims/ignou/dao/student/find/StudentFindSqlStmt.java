package org.ims.ignou.dao.student.find;

public class StudentFindSqlStmt {

			public static String searchstudent(){
					return "select COURSENAME,BATCH_TIMEING,TEACHERNAME,NAME,DOB,EMAIL_ID,FATHER_NAME,IMAGE_PATH,REAMINFEES from student where ID=?";
			}
	
}
