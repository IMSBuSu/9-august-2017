package org.ims.ignou.helper.inventory.find;

import org.ims.ignou.dto.inventory.add.GoodsAddDto;
import org.ims.ignou.dto.library.add.BookAddDto;
import org.ims.ignou.view.inventory.add.AddNewGoods;
import org.ims.ignou.view.inventory.find.GoodsDetailShowView;

public class ShowItemDetailGoodshelper {

	protected void setGoodsDetail(GoodsDetailShowView goodsview,GoodsAddDto  goodsDetail){
		goodsview.setTextGoodsName(goodsDetail.getPRODUCTNAME());
		goodsview.setTextWarntyDurtin(Integer.toString(goodsDetail.getWARRANTY_DURATION()));
		goodsview.setTextTinNo(goodsDetail.getTIN_NUMBER());
		goodsview.setTextShopName(goodsDetail.getSHOPNAME());
		goodsview.setTextFieldWarantyType(goodsDetail.getWARRANTY_TYPE());
		goodsview.setTextQuantity(Integer.toString(goodsDetail.getQUANTITY()));
		goodsview.setTextDescription(goodsDetail.getPRODUCT_DESCIPTION());
		goodsview.setTextpurchasingDate(goodsDetail.getPURCHASE_DATE());
	goodsview.setTextGoodsId(Integer.toString(goodsDetail.getGOODS_ID()));
	
	}
	public void showDetail(GoodsAddDto goodsDetail){
		
		GoodsDetailShowView detailShowView=new GoodsDetailShowView();
		setGoodsDetail(detailShowView, goodsDetail);
		detailShowView.setVisible(true);
		
		
		
	}
	
	
	
}
