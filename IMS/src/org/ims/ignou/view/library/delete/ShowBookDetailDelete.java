package org.ims.ignou.view.library.delete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.ims.ignou.helper.library.delete.DeleteBookRecordHelper;
import org.ims.ignou.view.library.find.ShowBookDetail;

public class ShowBookDetailDelete extends ShowBookDetail
{
	
	
	
	
	
	
	
	
	
	public void deleteRecord(){
	 DeleteBookRecordHelper delBookRecord = new DeleteBookRecordHelper();
	 Boolean successtoDelete=delBookRecord.deleteRecord(Integer.parseInt(textFieldbookid.getText().toString().trim()));
	 	if(successtoDelete){
	 		
	 		this.setVisible(false);

	 		JOptionPane.showMessageDialog(this, "Success to Delete Record !");

	 		
	 	}else{
	 		this.setVisible(false);
	 		JOptionPane.showMessageDialog(this, "Failed to delete Record");
	 	}
	
	}
	
	
	
	
	public ShowBookDetailDelete() {
		ShowBookDetailDelete frame=this;
		btnSearchAnother.setLocation(0, 267);
		this.remove(btnSearchAnother);
		
		JButton btndeletebook = new JButton("Delete Book");
		btndeletebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame, "Do you want to Delete Record ?")==0)
				{
					deleteRecord();
				}
			}
		});
		btndeletebook.setBounds(206, 230, 110, 23);
		getContentPane().add(btndeletebook);
		
		
		
		
	}
	
	
}



