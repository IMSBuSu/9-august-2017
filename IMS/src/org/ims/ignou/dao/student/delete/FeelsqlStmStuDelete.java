package org.ims.ignou.dao.student.delete;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeelsqlStmStuDelete {

				public PreparedStatement setId(PreparedStatement pre,int id){
						try {
							pre.setInt(1, id);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return pre;
				}
		
	
				
				
				
}
