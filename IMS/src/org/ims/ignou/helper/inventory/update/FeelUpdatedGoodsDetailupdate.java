package org.ims.ignou.helper.inventory.update;

import org.ims.ignou.dto.inventory.add.GoodsAddDto;
import org.ims.ignou.view.inventory.update.GoodsDetailViewUpdate;

public class FeelUpdatedGoodsDetailupdate {

	
	public GoodsAddDto setDetail(GoodsDetailViewUpdate goodsView){
		GoodsAddDto goodsDetail=new GoodsAddDto();
	
		goodsDetail.setPRODUCT_DESCIPTION(goodsView.getTextDescription().getText().toString().trim().toUpperCase());
		goodsDetail.setPRODUCTNAME(goodsView.getTextGoodsName().getText().toString().trim().toUpperCase());
		goodsDetail.setQUANTITY(Integer.parseInt(goodsView.getTextQuantity().getText().toString().trim()));
		goodsDetail.setSHOPNAME(goodsView.getTextShopName().getText().toString().trim().toUpperCase());
		goodsDetail.setTIN_NUMBER(goodsView.getTextTinNo().getText().toString().trim().toUpperCase());
		goodsDetail.setWARRANTY_DURATION(Integer.parseInt(goodsView.getTextWarntyDurtin().getText().toString().trim()));
		goodsDetail.setWARRANTY_TYPE(goodsView.getTextFieldWarantyType().getText().toString().trim());

		return goodsDetail;
	
}

}
