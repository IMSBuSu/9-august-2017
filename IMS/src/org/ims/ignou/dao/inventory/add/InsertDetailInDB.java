package org.ims.ignou.dao.inventory.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.inventory.add.GoodsAddDto;

public class InsertDetailInDB extends CreateConnection{
	
	
	private int GoodsID;
	
	public int getGoodsID() {
		return GoodsID;
	}
	
	
	private  Boolean getGoodsId(GoodsAddDto gooddetail,Connection connection){
		PreparedStatement pre=null;
		ResultSet set=null;
								try {
									pre=connection.prepareStatement(SqlStmtinsertGoods.getGoodsId());
									if(pre!=null){
										pre=new FeelSqlStmtGoodsAdd().setDetail(pre, gooddetail);
										set =pre.executeQuery();
										if(set.next()){
											GoodsID=set.getInt("GOODS_ID");
											return true;
										}
								}

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
										if(set!=null){
											set.close();
										}
										
									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									
									
								}
				
				return false;
	
		
		
	}
	
	public Boolean insert(GoodsAddDto gooddetail){
		Connection connection=null;
		PreparedStatement pre=null;
		try {
			connection=createconnection();
					if(connection!=null){
								pre=connection.prepareStatement(SqlStmtinsertGoods.insertGoods());
								if(pre!=null){
										pre=new FeelSqlStmtGoodsAdd().setDetail(pre, gooddetail);
										int isinserted=pre.executeUpdate();
										
										if(isinserted==1){
											getGoodsId(gooddetail,connection);
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
