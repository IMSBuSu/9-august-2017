package org.ims.ignou.dao.inventory.update;

public class SqlstmtUpdateRecordGoods {

	public static String update(){
		return "update goods set "
				+ "PRODUCT_NAME=?,"
				+ "WARRANTY_DURATION=?,"
				+ "PRODUCT_DESCIPTION=?,"
				+ "TIN_NUMBER=?,"
				+ "SHOPNAME=?,"
				+ "WARRANTY_TYPE=?,"
				+ "QUANTITY=?"
				+ "where GOODS_ID=?";	
	}
	
}
