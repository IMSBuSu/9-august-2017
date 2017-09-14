package org.ims.ignou.helper.admin.signup;

import org.ims.ignou.dao.admin.add.AddAdminDao;
import org.ims.ignou.dto.admin.AdminDto;

public class AddAdminhelper {

	
	public Boolean add(AdminDto admindetail){
		
		AddAdminDao addAdminDao=new AddAdminDao();
		
		if(addAdminDao.add(admindetail))
		{
			
			return true;
		}
		
		return false;
	}
	
}
