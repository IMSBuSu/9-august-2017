package org.ims.ignou.helper.student.fees.submit;

import javax.swing.JOptionPane;

import org.ims.ignou.view.student.fees.submit.ShowStudentFeesUpdateView;

public class FeesSubmitViewValidation {

	
	private Boolean checkValidAmount(ShowStudentFeesUpdateView student){
		int submitFeesamount=Integer.parseInt(student.getTextSubmitFees().getText().trim());
		int feesremainAmount=Integer.parseInt(student.getTextremainFees());
					if(submitFeesamount>feesremainAmount || submitFeesamount<=0){
						
							JOptionPane.showMessageDialog(student, "Incorrect Amount");
							return false;
					}
		return true;
	}
	
	
	private Boolean onlyNumberAllowed(ShowStudentFeesUpdateView student){
		String submitFeesAmount=student.getTextSubmitFees().getText().trim();
				try{
						
						Integer.parseInt(submitFeesAmount); //checking only number allowed.
						student.setLblErrorMessage("");
						if(checkValidAmount(student)){
							return true;
						}
				}catch (NumberFormatException e) {
					student.setLblErrorMessage("ONLY NUMBER ALLOWED !");
				}
		
		return false;		
	}
	public Boolean canNotblank(ShowStudentFeesUpdateView student){
			
		String submitFeesAmount=student.getTextSubmitFees().getText();
				
				if(!submitFeesAmount.trim().equals("")){
							
								if(onlyNumberAllowed(student)){
									
											return true;
								}
							
				}
				else{
					
					student.setLblErrorMessage("CAN NOT BE BLANK !");
					
				}
		return false;		
	
	}
}
