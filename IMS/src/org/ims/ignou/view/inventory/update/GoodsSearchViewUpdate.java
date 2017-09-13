package org.ims.ignou.view.inventory.update;

import javax.swing.JOptionPane;

import org.ims.ignou.helper.inventory.find.SearchGoodsHelper;
import org.ims.ignou.helper.inventory.update.ShowItemDetailUpdateHelper;
import org.ims.ignou.view.inventory.find.GoodsSearchView;

public class GoodsSearchViewUpdate extends GoodsSearchView
{
	
	
	
	
	@Override
	public void Validation() {

			if(goodsSearchValidation.cannotBlank(this)){
			
			SearchGoodsHelper searchItemDetail = new SearchGoodsHelper();
			Boolean isRecordFound=searchItemDetail.searchGoods(Integer.parseInt(textBookId.getText().toString().trim()));
			if(isRecordFound)
			{
				this.setVisible(false);
				ShowItemDetailUpdateHelper show = new ShowItemDetailUpdateHelper();
					show.showDetail(searchItemDetail.getGoodsDetail());
			}
			else{
				
				JOptionPane.showMessageDialog(this, "Item Detail not found !");
			}
			
			
		}
	
	}
	public GoodsSearchViewUpdate() {
		
		
		
	}
}
