package org.ims.ignou.dao.inventory.find;

public class SqlStmtSearchItem {

	
	
	
	public static String searchItem(){
		
		
		return "select * from goods where GOODS_ID=?";
	}
	
	
	
}
