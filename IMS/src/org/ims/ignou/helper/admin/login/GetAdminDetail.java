package org.ims.ignou.helper.admin.login;

import org.ims.ignou.dao.admin.GetDetail.GetAdminDetailfrmDB;
import org.ims.ignou.dto.admin.AdminDto;

public class GetAdminDetail {

	private AdminDto dto=null;
	public AdminDto getAdmindto() {
		return dto;
	}
	public Boolean get(){
		 GetAdminDetailfrmDB getadmin = new GetAdminDetailfrmDB();
		if(getadmin.getAdmin()){
			dto=getadmin.getAdminDto();
			return true;
		}
		
		return false; 
	
	}
	
}
