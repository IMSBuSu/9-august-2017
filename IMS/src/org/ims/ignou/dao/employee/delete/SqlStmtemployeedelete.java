package org.ims.ignou.dao.employee.delete;

public class SqlStmtemployeedelete {

	
			public static String deleteEmployee(){
				return "delete  from employee where ID=?";
			}
			public static String deleteemployeeBatchDetails(){
				return "delete from BATCH_DETAILS where ID=?";
			}
			public static String deleteqalfictondtlsemployee(){
				return "delete from qualification_details_EMPLOYEE where ID=?";
			}
			
}
