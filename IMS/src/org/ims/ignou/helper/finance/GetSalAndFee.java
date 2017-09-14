package org.ims.ignou.helper.finance;

import org.ims.ignou.dao.finance.GetSalAndFEEDAO;
import org.ims.ignou.dto.finance.ExpVsprDto;

public class GetSalAndFee {

	private ExpVsprDto dto=new ExpVsprDto();

	public ExpVsprDto getDto() {
		return dto;
	}
	
	
	public Boolean getFinance(){
		
		GetSalAndFEEDAO andFEEDAO=new GetSalAndFEEDAO();
		Boolean isDetailFound=andFEEDAO.getsalfee();
		if(isDetailFound){
			dto=andFEEDAO.getDto();
			return true;
		
		}
		return false;

	}
	
}
