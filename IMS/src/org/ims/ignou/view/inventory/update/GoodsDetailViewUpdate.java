package org.ims.ignou.view.inventory.update;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.ims.ignou.dto.inventory.add.GoodsAddDto;
import org.ims.ignou.helper.inventory.update.FeelUpdatedGoodsDetailupdate;
import org.ims.ignou.helper.inventory.update.InsertUpdateGoodsDetail;
import org.ims.ignou.helper.inventory.update.ValidationGoodsUpdate;
import org.ims.ignou.view.inventory.find.GoodsDetailShowView;

public class GoodsDetailViewUpdate extends GoodsDetailShowView
{
	
	private ValidationGoodsUpdate checkformValidation=new ValidationGoodsUpdate();
	
	public void validation(){	

			if(checkformValidation.validation(this))
			{
				FeelUpdatedGoodsDetailupdate feelDetail= new FeelUpdatedGoodsDetailupdate();
				GoodsAddDto updateDetail=feelDetail.setDetail(this);
				
				InsertUpdateGoodsDetail insertDetail=new InsertUpdateGoodsDetail();
				Boolean isDetailUpdated=insertDetail.updateGoodsDetail(updateDetail,Integer.parseInt(textGoodsId.getText().toString().trim()));
				if(isDetailUpdated)
				{					
					this.setVisible(false);
					JOptionPane.showMessageDialog(this, "Detail Updated SuccessFully !");
				}
				else{
					this.setVisible(false);
					JOptionPane.showMessageDialog(this, "Failed To Update Detaild !");
				}
				
			}

	}
	
	public GoodsDetailViewUpdate() {
		btnSearchAnother.setLocation(0, 398);
	
	this.textGoodsId.setEditable(false);
	this.remove(btnSearchAnother);
	
	JButton btnUpdateDetail = new JButton("Update Detail");
	btnUpdateDetail.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			validation();
			
		}
	});
	btnUpdateDetail.setBounds(178, 355, 107, 23);
	getContentPane().add(btnUpdateDetail);
		
		
		
		
	}
}
