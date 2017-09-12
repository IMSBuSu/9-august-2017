package org.ims.ignou.dao.library.update;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.library.add.BookAddDto;

public class FeelSqlStmtUpdateBook {

	
	public PreparedStatement setDDetail(PreparedStatement pre,BookAddDto newbookDetail){
	
		try {
			pre.setString(1, newbookDetail.getBookName());
			pre.setString(2, newbookDetail.getIsbn());
			pre.setString(3, newbookDetail.getBooklanguage());
			pre.setInt(4, newbookDetail.getBookid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return pre;
	}
	
	
}
