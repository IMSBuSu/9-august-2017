package org.ims.ignou.view.library.update;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.ims.ignou.dto.library.add.BookAddDto;
import org.ims.ignou.helper.library.update.FeelValueBookDetailUpdate;
import org.ims.ignou.helper.library.update.UpdateBookDetailHelper;
import org.ims.ignou.helper.library.update.ValidationBookUpdate;
import org.ims.ignou.view.library.find.ShowBookDetail;

public class ShowBookDetailUpdate extends ShowBookDetail
{
	
	
	
	public void validation(){
		 ValidationBookUpdate bookDetailchk = new ValidationBookUpdate();
		Boolean isDetailOk=bookDetailchk.updateVali(this);
		if(isDetailOk){
			if(JOptionPane.showConfirmDialog(this, "Do you really Want To update the Book Detail")==0){

			BookAddDto addDto=new BookAddDto();
			FeelValueBookDetailUpdate setDetailinDTO=new FeelValueBookDetailUpdate();
			setDetailinDTO.setDetail(this,addDto);
				UpdateBookDetailHelper updateDetailHelper=new UpdateBookDetailHelper();
				Boolean isRecordUpdte=updateDetailHelper.updateBook(addDto);
				if(isRecordUpdte){
							this.setVisible(false);
							JOptionPane.showMessageDialog(this, "Success to Update Book Detail");
				}
				else{
					this.setVisible(false);
					JOptionPane.showMessageDialog(this, "Faild to update Record");
				}
			   
				
		}
		}
		
	}
	
	public ShowBookDetailUpdate() {
		textFieldCategorycmbx.setEditable(false);
		textbookpurchasingDate.setEditable(false);
		textbookpurchasingDate.setEnabled(false);
		
		this.remove(btnSearchAnother);
		
		textFieldbookid.setEditable(false);
		btnSearchAnother.setLocation(10, 256);
		
		JButton btnUpdateDetail = new JButton("Update Detail");
		btnUpdateDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validation();
				
			}
		});
		btnUpdateDetail.setBounds(183, 228, 116, 23);
		getContentPane().add(btnUpdateDetail);
	
	}
	
	
}



