package org.ims.ignou.dao.inventory.add;

public class SqlStmtinsertGoods {

	public static String getGoodsId(){
		
		
		return "select GOODS_ID from goods where "
				+ "PRODUCT_NAME=? and "
				+ "WARRANTY_DURATION=? and "
				+ "PRODUCT_DESCIPTION=? and "
				+ "PURCHASE_DATE=? and "
				+ "TIN_NUMBER=? and "
				+ "SHOPNAME=? and  "
				+ "WARRANTY_TYPE=? and "
				+ "QUANTITY=?";
	}
	
	
	public static String insertGoods(){
		return "insert into goods(PRODUCT_NAME,WARRANTY_DURATION,PRODUCT_DESCIPTION,PURCHASE_DATE,TIN_NUMBER,GOODS_ID,SHOPNAME,WARRANTY_TYPE,QUANTITY) "
				+ "values(?,?,?,?,?,Goods_Id.nextval,?,?,?)";
	}
	
	
	
	
}
