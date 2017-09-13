package org.ims.ignou.helper.inventory.add;

import org.ims.ignou.dao.inventory.add.InsertDetailInDB;
import org.ims.ignou.dto.inventory.add.GoodsAddDto;

public class InsertGoodsDetailHelper {

			private int goods_Id;

			public int getGoods_Id() {
				return goods_Id;
			}
			
			
			public Boolean insertDetail(GoodsAddDto goodsDetail){
				
						InsertDetailInDB save=new InsertDetailInDB();
						Boolean isDetailSaved=save.insert(goodsDetail);
						if(isDetailSaved){
							
							goods_Id=save.getGoodsID();
							return true;
						}
						
				
				return false;
			}
	
	
	
}
