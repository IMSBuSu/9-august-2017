package org.ims.ignou.dao.admin.add;

public abstract class SqlStmtAddAdmin {

	
	
	
	
	public  static String insert(){
		
		return "insert into admin(NAME,EMAIL_ID,PASSWORD,DOB) values(?,?,?,?)";
	}
	
}
