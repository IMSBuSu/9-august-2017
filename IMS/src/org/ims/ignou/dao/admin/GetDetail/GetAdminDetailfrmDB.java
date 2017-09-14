package org.ims.ignou.dao.admin.GetDetail;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.admin.AdminDto;

public class GetAdminDetailfrmDB extends CreateConnection{

	private	AdminDto adminDto=null;
	public AdminDto getAdminDto() {
		return adminDto;
	}

	private void feeladminDetail(ResultSet set){
		
		adminDto=new AdminDto();
		try {
			adminDto.setDob(set.getString("DOB"));
			adminDto.setEmailID(set.getString("EMAIL_ID"));
			adminDto.setName(set.getString("NAME"));
			adminDto.setPassword(set.getString("PASSWORD"));
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Boolean getAdmin(){
		Connection connection=null;
		PreparedStatement pre=null;
		ResultSet set=null;
		try {
			connection=createconnection();
		
			if(connection!=null)
			{
					pre=connection.prepareStatement(SqlStmtAdminFetch.getAdmin());
					if(pre!=null){
						
							set=pre.executeQuery();
							if(set.next())
							{
									feeladminDetail(set);
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
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		return false;
	}





}
