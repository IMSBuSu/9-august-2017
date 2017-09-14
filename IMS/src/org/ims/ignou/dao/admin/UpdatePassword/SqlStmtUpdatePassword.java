package org.ims.ignou.dao.admin.UpdatePassword;

public class SqlStmtUpdatePassword {

	
	
	
	
	
	public static String update(){		
		return "update  admin set password=? where EMAIL_ID=?";
	}
	
	
}
