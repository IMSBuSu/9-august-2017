package org.ims.ignou.dao.student.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;
import org.ims.ignou.dto.student.registration.StudentRegistrationDto;
import org.ims.ignou.helper.employee.registration.CopyEmployeeImage;
import org.ims.ignou.view.extendable.Registration;
import org.ims.ignou.view.student.registration.StudentRegistration;

public class InsertStudent extends CreateConnection
{

	
			
	
	private int studentId;
	
	public int getStudentId() {
	return studentId;
}

	private Boolean insertQualification10th(StudentRegistrationDto employeeDetail,Connection connection,StudDetailFeelSQLSTMT detailFeelSQLSTMT){
		PreparedStatement psQufliaction=null;
		try {
						psQufliaction=connection.prepareStatement(SqlstmtStudentReg.getQualification10th());
						if(psQufliaction!=null){
										psQufliaction=detailFeelSQLSTMT.setQuflication10th(psQufliaction, employeeDetail,studentId);
										
										int isSuccees=psQufliaction.executeUpdate();
										if(isSuccees==1){
															return true;
											}
											
										
						}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				psQufliaction.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
return false;

	}
	private Boolean insertQualification12th(StudentRegistrationDto employeeDetail,Connection connection,StudDetailFeelSQLSTMT detailFeelSQLSTMT){

		PreparedStatement psQufliaction=null;
		try {
						psQufliaction=connection.prepareStatement(SqlstmtStudentReg.getQualification12th());
						if(psQufliaction!=null){
										psQufliaction=detailFeelSQLSTMT.setQuflication12th(psQufliaction, employeeDetail,studentId);
										int isSuccees=psQufliaction.executeUpdate();
											if(isSuccees==1){
															return true;
											}
																					
						}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				psQufliaction.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}
	private Boolean insertQualificationcertification(StudentRegistrationDto employeeDetail,Connection connection,StudDetailFeelSQLSTMT detailFeelSQLSTMT,Registration regFrame){

		PreparedStatement psQufliaction=null;
		try {
						psQufliaction=connection.prepareStatement(SqlstmtStudentReg.getQualificationCertificate());
						if(psQufliaction!=null){
										psQufliaction=detailFeelSQLSTMT.setQuflicationCertification(regFrame,psQufliaction, employeeDetail,studentId);
										int isSuccees=psQufliaction.executeUpdate();
											if(isSuccees==1){
															return true;
											}
																					
						}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				psQufliaction.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		
		
		return false;
	}
	private Boolean insertQualificationdiploma(StudentRegistrationDto employeeDetail,Connection connection,StudDetailFeelSQLSTMT detailFeelSQLSTMT,Registration regFrame){
		
		PreparedStatement psQufliaction=null;
		try {
						psQufliaction=connection.prepareStatement(SqlstmtStudentReg.getQualificationDiploma());
						if(psQufliaction!=null){
										psQufliaction=detailFeelSQLSTMT.setQuflicationDiploma(regFrame,psQufliaction, employeeDetail,studentId);
										int isSuccees=psQufliaction.executeUpdate();
											if(isSuccees==1){
															return true;
											}
																					
						}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				psQufliaction.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		return false;
	}
	private Boolean insertQualificationUnderGraduate(StudentRegistrationDto employeeDetail,Connection connection,StudDetailFeelSQLSTMT detailFeelSQLSTMT,Registration regFrame){
		PreparedStatement psQufliaction=null;
		try {
						psQufliaction=connection.prepareStatement(SqlstmtStudentReg.getQualificationUnderGraduation());
						if(psQufliaction!=null){
										psQufliaction=detailFeelSQLSTMT.setQuflicationUnderGraduate(regFrame,psQufliaction, employeeDetail,studentId);
										int isSuccees=psQufliaction.executeUpdate();
											if(isSuccees==1){
															return true;
											}
																					
						}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				psQufliaction.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		

		
		return false;
	}
	private Boolean insertQualificationPostGraduate(StudentRegistrationDto employeeDetail,Connection connection,StudDetailFeelSQLSTMT detailFeelSQLSTMT,Registration regFrame){
		
		PreparedStatement psQufliaction=null;
		try {
						psQufliaction=connection.prepareStatement(SqlstmtStudentReg.getQualificationPostGraduation());
						if(psQufliaction!=null){
										psQufliaction=detailFeelSQLSTMT.setQuflicationPostGraduate(regFrame,psQufliaction, employeeDetail,studentId);
										int isSuccees=psQufliaction.executeUpdate();
											if(isSuccees==1){
															return true;
											}
																					
						}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				psQufliaction.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}
	private Boolean insertQualificationOther(StudentRegistrationDto employeeDetail,Connection connection,StudDetailFeelSQLSTMT detailFeelSQLSTMT,Registration regFrame){
		
		
		PreparedStatement psQufliaction=null;
		try {
						psQufliaction=connection.prepareStatement(SqlstmtStudentReg.getQualificationOther());
						if(psQufliaction!=null){
										psQufliaction=detailFeelSQLSTMT.setQuflicationOther(regFrame,psQufliaction, employeeDetail,studentId);
										int isSuccees=psQufliaction.executeUpdate();
											if(isSuccees==1){
															return true;
											}
																					
						}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				psQufliaction.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		
		return false;
	} 
	private Boolean insertQaliifcationDetail(StudentRegistrationDto employeeDetail,Connection connection,StudDetailFeelSQLSTMT detailFeelSQLSTMT,StudentRegistration frameReg){
				Boolean success=true;
					if(frameReg.getComboBoxQualification10th().getSelectedItem().equals("10th")){
										if(!insertQualification10th(employeeDetail, connection, detailFeelSQLSTMT)){
											return false;
										}
					}
					if(frameReg.getComboBoxQualification12th().getSelectedItem().equals("12th")){							
										if(!insertQualification12th(employeeDetail, connection, detailFeelSQLSTMT)){
											return false;
										}
					}
					if(frameReg.getComboBoxQualificationcertification().getSelectedItem().equals("Certification"))
					{
										if(!insertQualificationcertification(employeeDetail, connection, detailFeelSQLSTMT,frameReg)){
											return false;
										}
					}
					if(frameReg.getComboBoxQualificationdiploma().getSelectedItem().equals("Diploma")){
						
										if(!insertQualificationdiploma(employeeDetail, connection, detailFeelSQLSTMT,frameReg)){
											return false;
										}
					}
					if(frameReg.getComboBoxQualificationUnder_graduate().getSelectedItem().equals("Under Graduation")){
						
						if(!insertQualificationUnderGraduate(employeeDetail, connection, detailFeelSQLSTMT,frameReg)){
							return false;
						}
		
					}

					if(frameReg.getComboBoxQualificationPost_graducation().getSelectedItem().equals("Post Graducation"))
					{
										if(!insertQualificationPostGraduate(employeeDetail, connection, detailFeelSQLSTMT,frameReg)){
											return false;
										}
					}
							if(frameReg.getComboBoxQualificationOther().getSelectedItem().equals("Other")){
						
										if(!insertQualificationOther(employeeDetail, connection, detailFeelSQLSTMT,frameReg)){
											return false;
										}
					}
				return success;
	}

	
	
	public Boolean updateImagePath(Connection connection,StudDetailFeelSQLSTMT detailFeelSQLSTMT){
		PreparedStatement pre=null;
		
					try {
						pre=connection.prepareStatement(SqlstmtStudentReg.updateImagePath());
						pre=detailFeelSQLSTMT.imagePath(pre,studentId);
						if(pre!=null){
											if(pre.executeUpdate()==1)
											{
												return true;
											}
											
						}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					finally {
						if(pre!=null){
							try {
								pre.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
		
		return false;
	}
	public Boolean insertStudentDetail(StudentRegistrationDto studto,StudentRegistration frame){

		Connection connection=null;
		PreparedStatement ps=null;
		try {
			connection=createconnection();
			if(connection!=null){
							ps=connection.prepareStatement(SqlstmtStudentReg.student());
							if(ps!=null)									
							{
								StudDetailFeelSQLSTMT detailFeelSQLSTMT=new StudDetailFeelSQLSTMT();
								ps=detailFeelSQLSTMT.employee(ps, studto);
								int isSuccess=ps.executeUpdate();
								if(isSuccess==1)
								{
														studentId=getStudentId(studto,connection, detailFeelSQLSTMT);
															if(studentId!=(-1)){
																				if(insertQaliifcationDetail(studto,connection,detailFeelSQLSTMT,frame))
																				{		
																										if(updateImagePath(connection,detailFeelSQLSTMT)){
																											copyStudentImage(studto.getStudentimagesPath(),Integer.toString(studentId));
																											return true;
																										}
																						
																				}
															}
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
	
	private int getStudentId(StudentRegistrationDto stuDetail,Connection connection,StudDetailFeelSQLSTMT detailFeelSQLSTMT){
		PreparedStatement psGetStudentid=null;
		ResultSet rs=null;
					try {
						psGetStudentid=connection.prepareStatement(SqlstmtStudentReg.studentID());
								if(psGetStudentid!=null){
									psGetStudentid=detailFeelSQLSTMT.employeeId(psGetStudentid, stuDetail);
												 rs=psGetStudentid.executeQuery();
												if(rs.next()){
														return Integer.parseInt(rs.getString("ID"));
												}
								}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					finally {
						
						if(psGetStudentid!=null){
							try {
								psGetStudentid.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						if(rs!=null){
							try {
								rs.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
		return -1;
	}

	private void copyStudentImage(String imgPath,String ImagePath){

				new CopyEmployeeImage().writeImage(imgPath, LoadBundelImageLocation.getImagepath("imgStud")+ImagePath+".JPG");																									
	}
	







	
			
	
					
	
}
