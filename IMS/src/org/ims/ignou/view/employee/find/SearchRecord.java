package org.ims.ignou.view.employee.find;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.ims.ignou.view.extendable.search;

public class SearchRecord extends search {
	
		
	public SearchRecord() {
		 btnsearch.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent arg0) {
			 		if(txtIdentificationNumber.getText().equals("")  || txtIdentificationNumber.getText().equals("Identification Number"))
					{
						txtIdentificationNumber.setText("Identification Number");
				    	JOptionPane.showMessageDialog(contentPane, "Please Input Identification Number");				    	
					}
			 		{
			 			ShowRecord showRecord=new ShowRecord();

			 		
			 		}
			 	}
			 });
	}
	
}
