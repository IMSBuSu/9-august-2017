package org.ims.ignou.helper.admin.login;

import javax.swing.JOptionPane;

public class LoginValidation {

	public boolean cannotbeblank(String userid,String password)
	{
		if(userid.trim().equals(""))
		{
			
			JOptionPane.showMessageDialog(null, "User Name can not blank");
			return false;
					
		}

		if(password.equals(""))
		{
			
			JOptionPane.showMessageDialog(null, "Password can not blank");
			return false;
					
		}
		
		
		return true;
	}
	
}
