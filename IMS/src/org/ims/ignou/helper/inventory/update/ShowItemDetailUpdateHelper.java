package org.ims.ignou.helper.inventory.update;

import org.ims.ignou.dto.inventory.add.GoodsAddDto;
import org.ims.ignou.helper.inventory.find.ShowItemDetailGoodshelper;
import org.ims.ignou.view.inventory.update.GoodsDetailViewUpdate;

public class ShowItemDetailUpdateHelper extends ShowItemDetailGoodshelper{
	
	
	
	
	
	@Override
	public void showDetail(GoodsAddDto goodsDetail) {
		GoodsDetailViewUpdate detailShowView=new GoodsDetailViewUpdate();
		setGoodsDetail(detailShowView, goodsDetail);
		detailShowView.setVisible(true);
	}

}
