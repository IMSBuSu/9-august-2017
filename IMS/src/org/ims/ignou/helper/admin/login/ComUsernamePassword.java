package org.ims.ignou.helper.admin.login;

import org.ims.ignou.dto.admin.AdminDto;
import org.ims.ignou.view.admin.login.Login;
import org.ims.ignou.view.admin.login.Signuup;
import org.ims.ignou.view.admin.welcome.Welcome;

public class ComUsernamePassword {

	
	
	
	
	
	public Boolean compare(String username,String password,AdminDto admindetail,Login frame){
		
		
				
							String user=admindetail.getName().toUpperCase();
							String pass=admindetail.getPassword().toUpperCase();
							if(user.equals(username) && user.equals(password))
							{
									frame.setVisible(false);
									Welcome welcome=new Welcome(admindetail);		
									welcome.setVisible(true);
									return true;
							}
					
					
				
		return false;
	}
}
