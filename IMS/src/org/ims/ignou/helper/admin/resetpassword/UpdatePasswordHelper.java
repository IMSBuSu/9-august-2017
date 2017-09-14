package org.ims.ignou.helper.admin.resetpassword;

import org.ims.ignou.dao.admin.UpdatePassword.UpdatePasswordInDBDAO;
import org.ims.ignou.dto.admin.AdminDto;

public class UpdatePasswordHelper {

	
	
	public Boolean resetPassword(AdminDto adminDetail){
		UpdatePasswordInDBDAO dbdao=new UpdatePasswordInDBDAO();
		Boolean isUpdated=dbdao.updatePassword(adminDetail);
		
		if(isUpdated){
			return true;
		}
		
		return false;
		
	}
}
