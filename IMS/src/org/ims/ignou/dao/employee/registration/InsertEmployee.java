package org.ims.ignou.dao.employee.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;
import org.ims.ignou.dao.course.add.InsertCourse;
import org.ims.ignou.dto.employee.registration.Employeedto;
import org.ims.ignou.helper.employee.registration.CopyEmployeeImage;

public class InsertEmployee extends CreateConnection
{

	
		@SuppressWarnings("finally")
		public Boolean insertEmployeeDetail(Employeedto employeedto){
			String imgPath=employeedto.getImagesPath();
			employeedto.setImagesPath(employeedto.getEmailId()+".JPG");
			Connection connection=null;
			PreparedStatement ps=null;
			try {
				connection=createconnection();
				if(connection!=null){
								ps=connection.prepareStatement(RegistrationStatement.getEmployee());
								if(ps!=null)									
								{
									EmpDetailFeelSQLSTMT detailFeelSQLSTMT=new EmpDetailFeelSQLSTMT();
									ps=detailFeelSQLSTMT.employee(ps, employeedto);
									int isSuccess=ps.executeUpdate();
									if(isSuccess==1)
									{
																
																new CopyEmployeeImage().writeImage(imgPath, LoadBundelImageLocation.getImagepath("imgPath")+employeedto.getImagesPath());																									
																return true;
									}
									ps.close();
								}					
				}				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if(connection!=null){
					try {
						connection.close();
					} catch (final SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(ps!=null){
					try {
						ps.close();
					} catch (final SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			
			}
			return false;

}
	
	
	
	
	
	
}
