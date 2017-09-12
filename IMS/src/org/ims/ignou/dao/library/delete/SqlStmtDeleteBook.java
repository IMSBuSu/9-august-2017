package org.ims.ignou.dao.library.delete;

public class SqlStmtDeleteBook {

	
	public static String deleteRecord(){
		return "delete from books where BOOK_ID=?";
	}
	
	
	
}
