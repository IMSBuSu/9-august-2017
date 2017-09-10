package org.ims.ignou.dao.student.find;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dao.employee.find.EmployeeFindSqlStmt;
import org.ims.ignou.dao.employee.find.FeelFindsqlStmt;
import org.ims.ignou.dto.employee.find.EmployeeFinddto;
import org.ims.ignou.dto.student.find.StudentFindDto;

public class SearchStudentInDb extends CreateConnection{

	private StudentFindDto studentFinddto;
	
	public StudentFindDto getstudentFinddto() {
		return studentFinddto;
	}
	
	private void setFoundstudentDetail(ResultSet set){
		 studentFinddto=new StudentFindDto();
			try {
				
				studentFinddto.setCourseName(set.getString("COURSENAME"));
				studentFinddto.setBatchTimeing(set.getString("BATCH_TIMEING"));
				studentFinddto.setEmployeeName(set.getString("TEACHERNAME"));
				studentFinddto.setStudentName(set.getString("NAME"));
				studentFinddto.setDob(set.getString("DOB"));
				studentFinddto.setEmailId(set.getString("EMAIL_ID"));
				studentFinddto.setFatherName(set.getString("FATHER_NAME"));
				studentFinddto.setImage(set.getString("IMAGE_PATH"));
				studentFinddto.setRemainFees(set.getString("REAMINFEES"));
			} catch (SQLException e) {
				e.printStackTrace();
			}					 
}

	
	public Boolean search(int id){
		Connection connection=null;
		PreparedStatement pre=null;
		ResultSet resultSet=null;
					try {
							 connection=createconnection();
							 if(connection!=null)
							 {	
									FeelFindsqlStmtStudent feelFindsqlStmt=new FeelFindsqlStmtStudent();
								 		pre=connection.prepareStatement(StudentFindSqlStmt.searchstudent());													
		 								pre=feelFindsqlStmt.setId(id, pre);	
								 					if(pre!=null){
								 								resultSet=pre.executeQuery();
								 								if(resultSet.next()){
								 											setFoundstudentDetail(resultSet);
								 											return true;
								 								}
								 								
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
							try {
									if(connection!=null)
										{
												connection.close();
										}
									if(pre!=null){													
										pre.close();
									}
								
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
	
						return false;
	}
	
}
