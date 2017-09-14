package org.ims.ignou.helper.admin.resetpassword;

import javax.swing.JOptionPane;

import org.ims.ignou.view.admin.resetpassword.Reset_paswd;

public class PasswordResetValidation {

	public Boolean cannotBlank(Reset_paswd frame)
	{
		if(frame.getTextFieldusername().getText().trim().equals(""))
		{
			JOptionPane.showMessageDialog(frame, "User Name can not be blank");
			return false;
		}
		if(frame.getTextemailid().getText().trim().equals("")){
			JOptionPane.showMessageDialog(frame, "Email Id can not be blank");
			return false;

			
		}
		
		
		
		
		
		
		
		
		
	return true;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
