package org.ims.ignou.helper.inventory.update;

import javax.swing.JOptionPane;

import org.ims.ignou.view.inventory.update.GoodsDetailViewUpdate;

public class ValidationGoodsUpdate {

	
	public Boolean validation(GoodsDetailViewUpdate goodsDetail){
		if(goodsDetail.getTextGoodsName().getText().toString().trim().equals(""))
		{
			JOptionPane.showMessageDialog(goodsDetail, "Enter Goods Name !");
			return false;
		}
		if(!goodsDetail.getTextWarntyDurtin().getText().toString().trim().equals(""))
		{
			try{
				Integer.parseInt(goodsDetail.getTextWarntyDurtin().getText().toString().trim());
			}catch(NumberFormatException e){
				
				JOptionPane.showMessageDialog(goodsDetail, "Only Number Allowed in Warranty Duration !");
				return false;
			}
			
		}

		if(goodsDetail.getTextShopName().getText().toString().trim().equals(""))
		{
			JOptionPane.showMessageDialog(goodsDetail, "Enter Shop Name !");
			return false;
		}
		if(!goodsDetail.getTextQuantity().getText().toString().trim().equals("")){
			try{
				Integer.parseInt(goodsDetail.getTextQuantity().getText().toString().trim());
			}catch(NumberFormatException e){
				
				JOptionPane.showMessageDialog(goodsDetail, "Only Number Allowed in Quantity !");
				return false;
			}
		}	
		else{
			JOptionPane.showMessageDialog(goodsDetail, "Quantity Can Not Blank!");
			return false;
		}
		
		if(goodsDetail.getTextDescription().getText().toString().trim().equals(""))
		{
			JOptionPane.showMessageDialog(goodsDetail, "Enter Goods Description !");
			return false;
		}		
		return true;	
	}
	
}
