package org.ims.ignou.dao.admin.UpdatePassword;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.admin.AdminDto;

public class UpdatePasswordInDBDAO extends CreateConnection{

	
	
	public Boolean updatePassword(AdminDto admindetail)
	{
		Connection connection=null;
		PreparedStatement pre=null;
		try {
			connection=createconnection();
			
				if(connection!=null){
							pre=connection.prepareStatement(SqlStmtUpdatePassword.update());	
							if(pre!=null){
								pre=new FeelSqlStmtUpdatePassword().setDetail(pre, admindetail);
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
					if(pre!=null)
					{
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
