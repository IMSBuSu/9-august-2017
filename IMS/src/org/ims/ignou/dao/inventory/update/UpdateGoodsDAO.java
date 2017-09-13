package org.ims.ignou.dao.inventory.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.inventory.add.GoodsAddDto;

public class UpdateGoodsDAO extends CreateConnection{

	
	
	
	
	
	public Boolean update(GoodsAddDto gooddetail,int goodsid){
		
		Connection connection=null;
		PreparedStatement pre=null;
		try {
			connection=createconnection();
					if(connection!=null){
								pre=connection.prepareStatement(SqlstmtUpdateRecordGoods.update());
								if(pre!=null){
									pre=new FeelSqlStmtUpdateDEtail().setDtail(pre, goodsid, gooddetail);
							System.out.println("d2");
									int isupdated=pre.executeUpdate();
									if(isupdated==1){
										
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
