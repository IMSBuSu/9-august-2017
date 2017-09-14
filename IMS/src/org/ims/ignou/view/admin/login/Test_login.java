
package org.ims.ignou.view.admin.login;

import org.ims.ignou.helper.admin.login.GetAdminDetail;
import org.ims.ignou.view.admin.signup.Signup;

public class Test_login{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetAdminDetail adminDetail=new GetAdminDetail();
		if(adminDetail.get()){
			Login login=new Login(adminDetail.getAdmindto());
			login.setVisible(true);			
		}
		else{
			Signup signuup=new Signup();
			signuup.setVisible(true);
		}
	}
}
