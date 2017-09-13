package org.ims.ignou.dao.inventory.find;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.inventory.add.GoodsAddDto;

public class SearchItemInDb extends CreateConnection{

private GoodsAddDto godsDetail;
	
	public GoodsAddDto getGodsDetail() {
	return godsDetail;
}

	private void setDetail(ResultSet setDtl)
	{
		godsDetail=new GoodsAddDto();
		try {
			godsDetail.setGOODS_ID(setDtl.getInt("GOODS_ID"));
			godsDetail.setPRODUCT_DESCIPTION(setDtl.getString("PRODUCT_DESCIPTION"));
			godsDetail.setPRODUCTNAME(setDtl.getString("PRODUCT_NAME"));
			godsDetail.setPURCHASE_DATE(setDtl.getString("PURCHASE_DATE"));
			godsDetail.setQUANTITY(setDtl.getInt("QUANTITY"));
			godsDetail.setSHOPNAME(setDtl.getString("SHOPNAME"));
			godsDetail.setTIN_NUMBER(setDtl.getString("TIN_NUMBER"));
			godsDetail.setWARRANTY_DURATION(setDtl.getInt("WARRANTY_DURATION"));
			godsDetail.setWARRANTY_TYPE(setDtl.getString("WARRANTY_TYPE"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Boolean searchItem(int id){
		Connection connection=null;
		PreparedStatement pre=null;
		ResultSet goodsset;
		try {
			connection=createconnection();
						if(connection!=null){
									pre=connection.prepareStatement(SqlStmtSearchItem.searchItem());
									if(pre!=null){
										SqlStmtSetId setId=new SqlStmtSetId();
											pre=setId.setId(pre, id);
											goodsset=pre.executeQuery();
											if(goodsset.next())
											{
													setDetail(goodsset);
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
