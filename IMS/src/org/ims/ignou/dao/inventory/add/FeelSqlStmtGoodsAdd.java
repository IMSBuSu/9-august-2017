package org.ims.ignou.dao.inventory.add;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.inventory.add.GoodsAddDto;

public class FeelSqlStmtGoodsAdd {
	public PreparedStatement setDetail(PreparedStatement pre,GoodsAddDto goodDtail){
		try {
			pre.setString(1, goodDtail.getPRODUCTNAME());
			pre.setInt(2, goodDtail.getWARRANTY_DURATION());
			pre.setString(3, goodDtail.getPRODUCT_DESCIPTION());
			pre.setString(4, goodDtail.getPURCHASE_DATE());
			pre.setString(5, goodDtail.getTIN_NUMBER());
			pre.setString(6, goodDtail.getSHOPNAME());
			pre.setString(7, goodDtail.getWARRANTY_TYPE());
			pre.setInt(8, goodDtail.getQUANTITY());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		return pre;
	}
	
	
}
