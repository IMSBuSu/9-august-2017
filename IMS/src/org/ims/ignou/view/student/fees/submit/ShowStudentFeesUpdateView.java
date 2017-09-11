package org.ims.ignou.view.student.fees.submit;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.ims.ignou.dto.student.fees.submit.StudentFeesSubmitDto;
import org.ims.ignou.helper.student.fees.submit.FeesSubmitViewValidation;
import org.ims.ignou.helper.student.fees.submit.UpdateStudentFees;
import org.ims.ignou.view.student.find.ShowStudentDetailView;

public class ShowStudentFeesUpdateView extends ShowStudentDetailView
{
	private JTextField textSubmitFees;
	private JLabel lblErrorMessage;
	
	
	public JTextField getTextSubmitFees() {
		return textSubmitFees;
	}

	public JLabel getLblErrorMessage() {
		return lblErrorMessage;
	}

	 
	public void setLblErrorMessage(String lblErrorMessage) {
		this.lblErrorMessage.setText(lblErrorMessage);
	}
	private StudentFeesSubmitDto getFeesDetail(){
		
		StudentFeesSubmitDto feesSubmitDto=new StudentFeesSubmitDto();
		feesSubmitDto.setRemainfees((Integer.parseInt(getTextremainFees().toString().trim()))
				-
				(Integer.parseInt(textSubmitFees.getText().toString().trim()))
				);
		feesSubmitDto.setStudentid(Integer.parseInt(textstudenid.getText().toString().trim()));
		return feesSubmitDto;
	}
	private void validation(FeesSubmitViewValidation feesSubmitViewValidation){
				
					if(feesSubmitViewValidation.canNotblank(this)){
						
							if(new UpdateStudentFees().updateRemainFees(getFeesDetail()))
							{
								JOptionPane.showMessageDialog(this, "Fees Submit SuccessFully!");
							}
							else{
								
								JOptionPane.showMessageDialog(this, "Failed To Submit Fees!");

							}
							
					}
					
	}
	
	public ShowStudentFeesUpdateView() {
		
		FeesSubmitViewValidation feesSubmitViewValidation=new FeesSubmitViewValidation();
		btnSearchAnother.setLocation(25, 366);
		setBounds(100, 100, 607, 440);
		setLocationRelativeTo(null);
			this.remove(btnSearchAnother);			
			JLabel lblSubmitAmount = new JLabel("Submit Amount");
			lblSubmitAmount.setBounds(40, 291, 88, 14);
			getContentPane().add(lblSubmitAmount);
			
			textSubmitFees = new JTextField();
			textSubmitFees.setColumns(10);
			textSubmitFees.setBounds(138, 288, 263, 20);
			getContentPane().add(textSubmitFees);
			
			JButton btnUpdateFees = new JButton("Update Fees");
			btnUpdateFees.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
							validation(feesSubmitViewValidation);
					
				}
			});
			btnUpdateFees.setBounds(243, 338, 113, 23);
			getContentPane().add(btnUpdateFees);
			
			 lblErrorMessage = new JLabel("");
			lblErrorMessage.setForeground(Color.BLACK);
			lblErrorMessage.setBackground(Color.BLACK);
			lblErrorMessage.setBounds(138, 319, 167, 14);
			getContentPane().add(lblErrorMessage);
			
			
			
	}
}
