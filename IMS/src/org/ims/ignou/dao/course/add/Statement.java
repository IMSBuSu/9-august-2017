package org.ims.ignou.dao.course.add;

import java.sql.PreparedStatement;

public class Statement {

		public static String insertStatement(){
			return "insert into course(COURSE_DURATION,COURSE_FEES,COURSE_ID,COURSE_NAME) values(?,?,course_id.nextval,?)";
			
		}
			
}
