package org.ims.ignou.helper.admin.login;

import org.ims.ignou.dto.admin.AdminDto;
import org.ims.ignou.view.admin.login.Login;
import org.ims.ignou.view.admin.welcome.Welcome;

public class ComUsernamePassword {

	
	
	
	
	
	public Boolean compare(String username,String password,AdminDto admindetail,Login frame){
							String user=admindetail.getName();
							String pass=admindetail.getPassword();
							if(user.equals(username.toUpperCase()) && pass.equals(password.toUpperCase()))
							{
									frame.setVisible(false);
									Welcome welcome=new Welcome(admindetail);		
									welcome.setVisible(true);
									return true;
							}
					
		return false;
	}
}
