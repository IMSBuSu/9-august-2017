package org.ims.ignou.dao.student.delete;

public class SqlStmtDeleteStudent {

			public static String studentQufalicationstmt(){
				return "delete from QUALIFICATION_DETAILS_STUDENT where id=?";
			}
			public static String studentdeletsqlstmt(){
				return "delete from student where id=?";
			}
	
}
