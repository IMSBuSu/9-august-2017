package org.ims.ignou.dao.student.fees.submit;

public abstract class SqlStmtUpdateStudentFees {

	
	
		public static String updateStudentFees(){
			
			return "update student set  REAMINFEES=? where id=?";
			
		}
	
}
