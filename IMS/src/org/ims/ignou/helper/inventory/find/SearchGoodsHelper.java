package org.ims.ignou.helper.inventory.find;

import org.ims.ignou.dao.inventory.find.SearchItemInDb;
import org.ims.ignou.dto.inventory.add.GoodsAddDto;
import org.ims.ignou.dto.library.add.BookAddDto;

public class SearchGoodsHelper {
		
			private GoodsAddDto goodsDetail;

			public GoodsAddDto getGoodsDetail() {
				return goodsDetail;
			}
			
			
			public Boolean searchGoods(int itemNo){
				
				SearchItemInDb itemInDb=new SearchItemInDb();
				Boolean isRecordFound=itemInDb.searchItem(itemNo);
				if(isRecordFound){
					goodsDetail=itemInDb.getGodsDetail();	
					return true;
				}
				
				return false;
			}
	
	
	
	
	
}
