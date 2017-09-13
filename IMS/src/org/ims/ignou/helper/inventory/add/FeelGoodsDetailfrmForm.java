package org.ims.ignou.helper.inventory.add;

import org.ims.ignou.dto.inventory.add.GoodsAddDto;
import org.ims.ignou.view.inventory.add.AddNewGoods;

public class FeelGoodsDetailfrmForm {

	
	
	
	
	public GoodsAddDto setDetail(AddNewGoods goodsView){
			GoodsAddDto goodsDetail=new GoodsAddDto();
		
			goodsDetail.setPRODUCT_DESCIPTION(goodsView.getTextDescription().getText().toString().trim().toUpperCase());
			goodsDetail.setPRODUCTNAME(goodsView.getTextGoodsName().getText().toString().trim().toUpperCase());
			goodsDetail.setPURCHASE_DATE(goodsView.getDateChooser().getDate().toString().toUpperCase());
			goodsDetail.setQUANTITY(Integer.parseInt(goodsView.getTextQuantity().getText().toString().trim()));
			goodsDetail.setSHOPNAME(goodsView.getTextShopName().getText().toString().trim().toUpperCase());
			goodsDetail.setTIN_NUMBER(goodsView.getTextTinNo().getText().toString().trim().toUpperCase());
			goodsDetail.setWARRANTY_DURATION(Integer.parseInt(goodsView.getTextWarntyDurtin().getText().toString().trim()));
			goodsDetail.setWARRANTY_TYPE(goodsView.getTextFieldWarantyType().getText().toString().trim());

			return goodsDetail;
		
	}
	
	
}
