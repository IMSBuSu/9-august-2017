package org.ims.ignou.dao.library.add;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.library.add.BookAddDto;

public class FeelDetailsqlStmtAdd {

	
	public PreparedStatement setBookDetail(PreparedStatement pre,BookAddDto bookdetail){
		
		
		try {
			pre.setString(1, bookdetail.getBookpurchasingDate());
			pre.setString(2, bookdetail.getBookName());
			pre.setString(3, bookdetail.getIsbn());
			pre.setString(4, bookdetail.getBookCategory());
			pre.setString(5, bookdetail.getBooklanguage());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return pre;
	}
	
	
	
	
	
	
}
