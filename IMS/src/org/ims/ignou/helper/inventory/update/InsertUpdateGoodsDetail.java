package org.ims.ignou.helper.inventory.update;

import org.ims.ignou.dao.inventory.update.UpdateGoodsDAO;
import org.ims.ignou.dto.inventory.add.GoodsAddDto;

public class InsertUpdateGoodsDetail {

	
	
	
	
	
	public Boolean updateGoodsDetail(GoodsAddDto updatedDetail,int goodsId)
	{ 
		System.out.println("d");
		UpdateGoodsDAO insert=new UpdateGoodsDAO();
		Boolean isrecordUpdate=insert.update(updatedDetail, goodsId);
		if(isrecordUpdate){
			
			return true;
		}
		
		
		return false;
	}
	
	
	
	
}
