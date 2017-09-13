package org.ims.ignou.dao.inventory.update;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.inventory.add.GoodsAddDto;

public class FeelSqlStmtUpdateDEtail {

	
	public PreparedStatement setDtail(PreparedStatement pre,int goodsid,GoodsAddDto updateDetail){
		try {
			pre.setString(1, updateDetail.getPRODUCTNAME());
			pre.setInt(2, updateDetail.getWARRANTY_DURATION());
			pre.setString(3, updateDetail.getPRODUCT_DESCIPTION());
			pre.setString(4, updateDetail.getTIN_NUMBER());
			pre.setString(5,updateDetail.getSHOPNAME());
			pre.setString(6, updateDetail.getWARRANTY_TYPE());
			pre.setInt(7, updateDetail.getQUANTITY());
			pre.setInt(8, goodsid);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pre;
	}
	
	
}
