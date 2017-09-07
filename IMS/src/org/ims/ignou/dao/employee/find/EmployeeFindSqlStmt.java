package org.ims.ignou.dao.employee.find;

public class EmployeeFindSqlStmt {

			public static String searchEmployee(){
					return "select NAME,DOB,EMAIL_ID,ID,FATHER_NAME,IMAGE_PATH from employee where ID=?";
			}
	
}
