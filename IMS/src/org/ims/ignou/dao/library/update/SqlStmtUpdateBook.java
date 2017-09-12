package org.ims.ignou.dao.library.update;

public class SqlStmtUpdateBook {

	
	public static String updateRecord(){
		
		return "update books set BOOK_NAME=?,ISBN=?,BOOK_LANGUAGE=? where BOOK_ID=?";
	}
}
