
package org.ims.ignou.view.admin.login;

import org.ims.ignou.dto.admin.AdminDto;
import org.ims.ignou.helper.admin.login.GetAdminDetail;

public class Test_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetAdminDetail adminDetail=new GetAdminDetail();
		if(adminDetail.get()){
			Login login=new Login(adminDetail.getAdmindto());
			login.setVisible(true);			
		}
		else{
			Signuup signuup=new Signuup();
			signuup.setVisible(true);
		}
		
	
	
	
	
	
	
	}
}
