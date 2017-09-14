package org.ims.ignou.helper.admin.signup;

import javax.swing.JOptionPane;

import org.ims.ignou.view.admin.signup.Signup;

public class SignupValidation {
	
	public Boolean cannotblank(Signup frame){
		if(frame.getTextFieldUsername().getText().trim().equals(""))
		{
			
			JOptionPane.showMessageDialog(frame, "User name can not blank");
			return false;
		}
		if(frame.getTextFieldemailid().getText().trim().equals(""))
		{
			JOptionPane.showMessageDialog(frame, "Email Id can not blank");
			return false;
			
		}
		if(frame.getTextField_password().getText().trim().equals(""))
		{
			JOptionPane.showMessageDialog(frame, "Password can not blank");
			return false;			
		}
		try{
			frame.getDateChooser().getDate().equals("null");
		}
		catch (NullPointerException e) {
			JOptionPane.showMessageDialog(frame, "Enter DOB  !");
			return false;
		}
			
		
		return true;			
	}
	
	

}
