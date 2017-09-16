package org.ims.ignou.dao.library.issueBook;

public class SqlstmtIssueBook {

	
	public static String insert(){
		
		return "insert into ISSUE_BOOKS(BOOK_ID,ISSUE_DATE,RECIVER_ID) values(?,?,?)";
	}
	
}
