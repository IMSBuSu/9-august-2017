package org.ims.ignou.dao.student.find;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeelFindsqlStmtStudent {

				public PreparedStatement setId(int id,PreparedStatement pre){
					
								try {
									pre.setInt(1, id);
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
					
								return pre;
				}
	
}
