package org.ims.ignou.helper.inventory.delete;

import org.ims.ignou.dto.inventory.add.GoodsAddDto;
import org.ims.ignou.helper.inventory.find.ShowItemDetailGoodshelper;
import org.ims.ignou.view.inventory.delete.GoodsDetailShowViewDelete;

public class ShowItemDetailForDeleteHelper extends ShowItemDetailGoodshelper {

	
	
	
	
	
	
	@Override
	public void showDetail(GoodsAddDto goodsDetail) {

		GoodsDetailShowViewDelete showdet=new GoodsDetailShowViewDelete();

		setGoodsDetail(showdet,goodsDetail);
		showdet.setVisible(true);
		
	
	
	}
	

	
	
	
	
}
