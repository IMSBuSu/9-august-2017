package org.ims.ignou.view.inventory.delete;

import org.ims.ignou.helper.inventory.delete.DeleteItemDetailhelper;
import org.ims.ignou.view.inventory.find.GoodsDetailShowView;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GoodsDetailShowViewDelete extends GoodsDetailShowView {
	
	
	
	
	
	private void deleteRecord(){
				if(JOptionPane.showConfirmDialog(this, "Do you want to Delete Item Detail")==0){
					
							DeleteItemDetailhelper delet=new DeleteItemDetailhelper();
						Boolean isSuccess=delet.delete(Integer.parseInt(textGoodsId.getText().toString().trim()));
						if(isSuccess)
						{
							this.setVisible(false);
							JOptionPane.showMessageDialog(this, "Success To Delete Item Detail !");
						}
						else{
							this.setVisible(false);
							JOptionPane.showMessageDialog(this, "Failed to Delete Item Detail !");
						}
						
				}
		
	}
	
	public GoodsDetailShowViewDelete() {
		btnSearchAnother.setLocation(-13, 398);
		
		setTitle("Delete Item Detail");
		this.remove(btnSearchAnother);
		
		JButton btnNewButton = new JButton("Delete Detail");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				deleteRecord();
				
			}
		});
		btnNewButton.setBounds(178, 354, 107, 23);
		getContentPane().add(btnNewButton);
		
		
		
	}
	
	
			

}
