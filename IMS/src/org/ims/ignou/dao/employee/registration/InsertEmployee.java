package org.ims.ignou.dao.employee.registration;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sound.midi.Synthesizer;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;
import org.ims.ignou.dto.employee.registration.EmployeeRegsdto;
import org.ims.ignou.helper.employee.registration.CopyEmployeeImage;
import org.ims.ignou.view.employee.registration.RegistrationeEmployee;
import org.ims.ignou.view.extendable.Registration;

public class InsertEmployee extends CreateConnection
{

	private int emloyeeId;
	
		public int getEmloyeeId() {
		return emloyeeId;
	}

		private Boolean insertQualification10th(EmployeeRegsdto employeeDetail,Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT){
			PreparedStatement psQufliaction=null;
			try {
							psQufliaction=connection.prepareStatement(RegistrationStatement.getQualification10th());
							if(psQufliaction!=null){
											psQufliaction=detailFeelSQLSTMT.setQuflication10th(psQufliaction, employeeDetail,emloyeeId);
											
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
		private Boolean insertQualification12th(EmployeeRegsdto employeeDetail,Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT){

			PreparedStatement psQufliaction=null;
			try {
							psQufliaction=connection.prepareStatement(RegistrationStatement.getQualification12th());
							if(psQufliaction!=null){
											psQufliaction=detailFeelSQLSTMT.setQuflication12th(psQufliaction, employeeDetail,emloyeeId);
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
		private Boolean insertQualificationcertification(EmployeeRegsdto employeeDetail,Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT,Registration regFrame){

			PreparedStatement psQufliaction=null;
			try {
							psQufliaction=connection.prepareStatement(RegistrationStatement.getQualificationCertificate());
							if(psQufliaction!=null){
											psQufliaction=detailFeelSQLSTMT.setQuflicationCertification(regFrame,psQufliaction, employeeDetail,emloyeeId);
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
		private Boolean insertQualificationdiploma(EmployeeRegsdto employeeDetail,Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT,Registration regFrame){
			
			PreparedStatement psQufliaction=null;
			try {
							psQufliaction=connection.prepareStatement(RegistrationStatement.getQualificationDiploma());
							if(psQufliaction!=null){
											psQufliaction=detailFeelSQLSTMT.setQuflicationDiploma(regFrame,psQufliaction, employeeDetail,emloyeeId);
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
		private Boolean insertQualificationUnderGraduate(EmployeeRegsdto employeeDetail,Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT,Registration regFrame){
			PreparedStatement psQufliaction=null;
			try {
							psQufliaction=connection.prepareStatement(RegistrationStatement.getQualificationUnderGraduation());
							if(psQufliaction!=null){
											psQufliaction=detailFeelSQLSTMT.setQuflicationUnderGraduate(regFrame,psQufliaction, employeeDetail,emloyeeId);
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
		private Boolean insertQualificationPostGraduate(EmployeeRegsdto employeeDetail,Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT,Registration regFrame){
			
			PreparedStatement psQufliaction=null;
			try {
							psQufliaction=connection.prepareStatement(RegistrationStatement.getQualificationPostGraduation());
							if(psQufliaction!=null){
											psQufliaction=detailFeelSQLSTMT.setQuflicationPostGraduate(regFrame,psQufliaction, employeeDetail,emloyeeId);
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
		private Boolean insertQualificationOther(EmployeeRegsdto employeeDetail,Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT,Registration regFrame){
			
			
			PreparedStatement psQufliaction=null;
			try {
							psQufliaction=connection.prepareStatement(RegistrationStatement.getQualificationOther());
							if(psQufliaction!=null){
											psQufliaction=detailFeelSQLSTMT.setQuflicationOther(regFrame,psQufliaction, employeeDetail,emloyeeId);
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
		private Boolean insertQaliifcationDetail(EmployeeRegsdto employeeDetail,Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT,Registration frameReg){
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
		private Boolean insertBatchDetails(Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT,String courseName,String batchTimeing){	
			PreparedStatement psQufliaction=null;
			try {
							psQufliaction=connection.prepareStatement(RegistrationStatement.getBatch_Detail());
							if(psQufliaction!=null){
											psQufliaction=detailFeelSQLSTMT.setBatch_Details(psQufliaction,courseName,emloyeeId,batchTimeing);
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

		
		
		private Boolean insertCourseDetail(Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT,EmployeeRegsdto empDetail){
					String courseName[]=empDetail.getSubjectName();
					String batchTimeing[]=empDetail.getBatchTiming();
					for(int i=0;i<=7;i++){
							if(courseName[i]!=null){
										if(!insertBatchDetails(connection, detailFeelSQLSTMT, courseName[i], batchTimeing[i])){
													return false;
										}
										
							}		
						
					}
					return true;
		}

		public Boolean insertEmployeeDetail(EmployeeRegsdto employeedto,RegistrationeEmployee frame){
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
																copyImage(imgPath,employeedto.getImagesPath());
																 emloyeeId=getEmployeeId(employeedto.getEmailId(),connection,detailFeelSQLSTMT);
																if(emloyeeId!=(-1)){
																					if(insertQaliifcationDetail(employeedto, connection, detailFeelSQLSTMT,frame))
																					{		
																							if(insertCourseDetail(connection,detailFeelSQLSTMT,employeedto)){	
																									
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
		
		private int getEmployeeId(String emailId,Connection connection,EmpDetailFeelSQLSTMT detailFeelSQLSTMT){
			PreparedStatement psGetEmployeeid=null;
			ResultSet rs=null;
						try {
							psGetEmployeeid=connection.prepareStatement(RegistrationStatement.getEmployeeID());
									if(psGetEmployeeid!=null){
													psGetEmployeeid=detailFeelSQLSTMT.employeeId(psGetEmployeeid, emailId);
													 rs=psGetEmployeeid.executeQuery();
													if(rs.next()){
										
															return Integer.parseInt(rs.getString("ID"));
													}
									}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						finally {
							
							if(psGetEmployeeid!=null){
								try {
									psGetEmployeeid.close();
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
	
		public void copyImage(String imgPath,String ImagePath){
					new CopyEmployeeImage().writeImage(imgPath, LoadBundelImageLocation.getImagepath("imgPath")+ImagePath);																									
		}
		
	
	
	
	
	
	
}
