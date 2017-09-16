package org.ims.ignou.dao.library.issueBook;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import oracle.sql.DATE;

public class SqlstmtIssueBookFeelDetail {

	
	public PreparedStatement setDetail(int book_id,int  reciver_id,PreparedStatement pre)
	{
		
		String issuedate = (Integer.toString(new Date().getDate())+"/"+Integer.toString(new Date().getMonth())+"/"+Integer.toString(new Date().getYear()));
		try {
			pre.setInt(1,book_id);
			pre.setString(2, issuedate);
			pre.setInt(3, reciver_id);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return pre;
	}
	
	
}
