package org.ims.ignou.helper.student.fees.submit;

import org.ims.ignou.dao.student.fees.submit.UpdateStudentFeesInDB;
import org.ims.ignou.dto.student.fees.submit.StudentFeesSubmitDto;

public class UpdateStudentFees {

	
	public Boolean updateRemainFees(StudentFeesSubmitDto feesSubmitDto){
			
		
		UpdateStudentFeesInDB feesInDB=new UpdateStudentFeesInDB();
					if(feesInDB.insertFees(feesSubmitDto)){
						return true;
					}
				
				return false;
	}
	
}
