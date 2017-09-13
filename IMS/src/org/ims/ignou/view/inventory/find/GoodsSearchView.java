package org.ims.ignou.view.inventory.find;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.ims.ignou.helper.inventory.find.SearchGoodsHelper;
import org.ims.ignou.helper.inventory.find.ShowItemDetailGoodshelper;
import org.ims.ignou.helper.library.find.BookfindValidation;
import org.ims.ignou.view.library.find.BookFindView;

public class GoodsSearchView extends BookFindView
{
	protected BookfindValidation goodsSearchValidation=new BookfindValidation();
	protected JButton btnNewButton;
	@Override
	public void Validation() {

		if(goodsSearchValidation.cannotBlank(this)){
			
			SearchGoodsHelper searchItemDetail = new SearchGoodsHelper();
			Boolean isRecordFound=searchItemDetail.searchGoods(Integer.parseInt(textBookId.getText().toString().trim()));
			if(isRecordFound)
			{
				this.setVisible(false);
					ShowItemDetailGoodshelper show = new ShowItemDetailGoodshelper();
				 show.showDetail(searchItemDetail.getGoodsDetail());
			}
			else{
				
				JOptionPane.showMessageDialog(this, "Item Detail not found !");
			}
			
			
		}
	
	}
	
	
	public GoodsSearchView() {
		this.remove(btnBookSearch);
		
		lblBookId.setText("Item No");
		
		setTitle("Find Goods Detail");
		
		 btnNewButton = new JButton("Search Item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Validation();
				
			}
		});
		btnNewButton.setBounds(361, 153, 102, 23);
		getContentPane().add(btnNewButton);
		
		
		
	}
}
