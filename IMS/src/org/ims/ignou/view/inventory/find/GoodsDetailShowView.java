package org.ims.ignou.view.inventory.find;

import org.ims.ignou.view.inventory.add.AddNewGoods;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GoodsDetailShowView extends AddNewGoods {
	protected JTextField textpurchasingDate;
	private GoodsDetailShowView frame;
	protected JTextField textGoodsId;
	protected JButton btnSearchAnother;
	
	
	public void setTextpurchasingDate(String textpurchasingDate) {
		this.textpurchasingDate.setText(textpurchasingDate);
	}




	public void setTextGoodsId(String textGoodsId) {
		this.textGoodsId.setText(textGoodsId);
	}




	public GoodsDetailShowView() {
		setTitle("Item Detail");
		setBounds(100, 100, 450, 450);
		setLocationRelativeTo(null);
		frame=this;
		btnNewButton.setLocation(43, 392);
		dateChooser.setLocation(188, 388);
		this.remove(dateChooser);
		this.remove(btnNewButton);
		textpurchasingDate = new JTextField();
		textpurchasingDate.setBounds(141, 270, 264, 20);
		getContentPane().add(textpurchasingDate);
		textpurchasingDate.setColumns(10);
		
		
		 btnSearchAnother = new JButton("Search Another");
		btnSearchAnother.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GoodsSearchView goodsSearchView=new GoodsSearchView();
				goodsSearchView.setVisible(true);
				
			}
		});
		btnSearchAnother.setBounds(167, 354, 107, 23);
		getContentPane().add(btnSearchAnother);
		
		JLabel lblGoodsId = new JLabel("Goods Id");
		lblGoodsId.setBounds(35, 304, 46, 14);
		getContentPane().add(lblGoodsId);
		
		textGoodsId = new JTextField();
		textGoodsId.setColumns(10);
		textGoodsId.setBounds(141, 301, 264, 20);
		getContentPane().add(textGoodsId);
		
		
	}
}
