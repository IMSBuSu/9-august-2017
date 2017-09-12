package org.ims.ignou.dao.library.add;

import java.sql.PreparedStatement;

import org.ims.ignou.dto.library.add.BookAddDto;

public class SqlStmtBookAdd {

	
	public static String insertBook(PreparedStatement pre){
			
			
		return "insert into books(PURCHASING_DATE,BOOK_NAME,BOOK_ID,ISBN,BOOK_CATEGORY,BOOK_LANGUAGE) values"
				+ "(?,?,books_id.nextval,?,?,?)";	
	}
	
	public static String getBookId(PreparedStatement pre){
		
		return "select  BOOK_ID from BOOKS where "
				+ "PURCHASING_DATE=? "
				+ "and "
				+ "BOOK_NAME=? "
				+ "and "
				+ "ISBN=? "
				+ "and "
				+ "BOOK_CATEGORY=? "
				+ "and "
				+ "BOOK_LANGUAGE=?";
		
	}
	
}
