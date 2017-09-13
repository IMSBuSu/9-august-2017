package org.ims.ignou.view.inventory.delete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.ims.ignou.helper.inventory.delete.ShowItemDetailForDeleteHelper;
import org.ims.ignou.helper.inventory.find.SearchGoodsHelper;
import org.ims.ignou.helper.library.find.BookfindValidation;
import org.ims.ignou.view.inventory.find.GoodsSearchView;

public class GoodsSearchViewForDelete extends GoodsSearchView
{
	
	private BookfindValidation goodsSearchValidation=new BookfindValidation();

	@Override
	public void Validation() {
		
			if(goodsSearchValidation.cannotBlank(this))
			{
				SearchGoodsHelper searchItemDetail = new SearchGoodsHelper();
				Boolean isRecordFound=searchItemDetail.searchGoods(Integer.parseInt(textBookId.getText().toString().trim()));
				if(isRecordFound)
				{
					this.setVisible(false);
					ShowItemDetailForDeleteHelper show = new ShowItemDetailForDeleteHelper();
					 show.showDetail(searchItemDetail.getGoodsDetail());
				}
				else{
					
					JOptionPane.showMessageDialog(this, "Item Detail not found !");
				}
				

					
				
				
				
			}
	}
	public GoodsSearchViewForDelete() {
		this.remove(btnNewButton);
		
		JButton btnNewButton = new JButton("Search Item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Validation();
				
			}
		});
		btnNewButton.setBounds(363, 153, 99, 23);
		getContentPane().add(btnNewButton);
		
		
	}
}
