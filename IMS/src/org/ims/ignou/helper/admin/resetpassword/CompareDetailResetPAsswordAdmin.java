package org.ims.ignou.helper.admin.resetpassword;

import javax.swing.JOptionPane;

import org.ims.ignou.dto.admin.AdminDto;
import org.ims.ignou.view.admin.resetpassword.Reset_paswd;

public class CompareDetailResetPAsswordAdmin {

	
	
	public Boolean compare(Reset_paswd resetpassword,AdminDto adminDetail)
	{

		System.out.println(adminDetail.getName());
		System.out.println(adminDetail.getEmailID());
		if((!resetpassword.getTextemailid().getText().trim().equals(adminDetail.getEmailID())) || 
				(!resetpassword.getTextFieldusername().getText().trim().equals(adminDetail.getName())))
		{

			JOptionPane.showMessageDialog(resetpassword, "Admin Not Found !");
			return false;
		}
		return true;
	}
	
	
	
	
}
