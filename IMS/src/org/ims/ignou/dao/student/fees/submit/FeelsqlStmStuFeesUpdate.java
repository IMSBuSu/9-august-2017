package org.ims.ignou.dao.student.fees.submit;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.student.fees.submit.StudentFeesSubmitDto;

public class FeelsqlStmStuFeesUpdate {




	public PreparedStatement  setId(PreparedStatement pre,StudentFeesSubmitDto feesSubmitDto){
		
		
		try {
			pre.setInt(1, feesSubmitDto.getRemainfees());
			pre.setInt(2, feesSubmitDto.getStudentid());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pre;
	}


}
