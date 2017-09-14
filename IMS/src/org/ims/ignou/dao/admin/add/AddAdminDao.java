package org.ims.ignou.dao.admin.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.admin.AdminDto;

public class AddAdminDao extends CreateConnection{
	
	
	
	public Boolean add(AdminDto adminDetail){
		Connection connection=null;
		PreparedStatement pre=null;
		try {
			connection=createconnection();
						if(connection!=null)
						{
								pre=connection.prepareStatement(SqlStmtAddAdmin.insert());
								if(pre!=null){
										pre=new SqlStmtFeelAdminDetail().setDetail(pre, adminDetail);
										if(pre.executeUpdate()==1)
										{
											return true;
										}
									
									
									
								}
							
						}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				if(connection!=null){
				connection.close();
				}
				if(pre!=null){
					pre.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return false;
	}

}
