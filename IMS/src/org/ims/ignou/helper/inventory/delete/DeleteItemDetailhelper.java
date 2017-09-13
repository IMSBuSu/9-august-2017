package org.ims.ignou.helper.inventory.delete;

import org.ims.ignou.dao.inventory.delete.DeleteGoodsDetailDB;

public class DeleteItemDetailhelper {

	
	
	
	public Boolean delete(int id){
		
				DeleteGoodsDetailDB db=new DeleteGoodsDetailDB();
				Boolean isSuccees=db.deleteGoods(id);
				if(isSuccees){
					return true;
				}
		
		return false;
	}
	
	
	
	
}
