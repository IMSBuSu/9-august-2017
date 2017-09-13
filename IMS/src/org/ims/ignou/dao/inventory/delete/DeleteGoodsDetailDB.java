package org.ims.ignou.dao.inventory.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;

public class DeleteGoodsDetailDB extends CreateConnection{

	
	
	public Boolean deleteGoods(int id){
			Connection connection=null;
			PreparedStatement pre=null;
			
			try {
				connection=createconnection();
					if(connection!=null){
								pre=connection.prepareStatement(SqlstmtDeleteGoods.deleteGoods());
								if(pre!=null){
									pre=new FeelSqlstmtDeleteGoods().setId(pre, id);
									int isdeletesuccess=pre.executeUpdate();
									if(isdeletesuccess==1){
										
										
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
