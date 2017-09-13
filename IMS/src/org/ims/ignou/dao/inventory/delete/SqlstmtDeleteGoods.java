package org.ims.ignou.dao.inventory.delete;

public class SqlstmtDeleteGoods {

	
	public static String deleteGoods(){
		
		return "delete from goods where goods_id=?";
	}
	
}
