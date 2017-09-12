package org.ims.ignou.dao.library.find;

public class SqlStmtBookfind {

			public static String findbook(){
				return "select * from books where BOOK_ID=?";
			}
	
	
}
