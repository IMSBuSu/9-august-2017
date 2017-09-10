package org.ims.ignou.dao.student.registration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.Extendable.CreateConnection;import org.ims.ignou.dao.course.add.CourseAddsqlSTMT;
import org.ims.ignou.dto.student.registration.CourseBatchDetailsDto;


public class GetCourseFromDb extends CreateConnection
{
					
	
	private ArrayList<CourseBatchDetailsDto> courseList;
	private ArrayList<CourseBatchDetailsDto> batchList;
	private ArrayList<CourseBatchDetailsDto> employeeList;
	public ArrayList<CourseBatchDetailsDto> getCourseList() {
		return courseList;
	}
	public ArrayList<CourseBatchDetailsDto> getBatchList() {
		return batchList;
	}
	public ArrayList<CourseBatchDetailsDto> getEmployeeList() {
		return employeeList;
	}
	
	private void setcourseFeesDuration(){

		 ArrayList<CourseBatchDetailsDto> batchList=new ArrayList<>();
			for(CourseBatchDetailsDto employee:getBatchList()){									

								for(CourseBatchDetailsDto course:getCourseList()){
											if(course.getCourseName().equals(employee.getCourseName())){
													employee.setCourseDuration(course.getCourseDuration());
													employee.setCourseFees(course.getCourseFees());	
													batchList.add(employee);
											}									
								}					
				}
				this.batchList=batchList;
	}
	private void setemployeeName(){
		//Set Employee name
		ArrayList<CourseBatchDetailsDto> batchList=new ArrayList<>();
		for(CourseBatchDetailsDto a:getBatchList()){
				
				for(CourseBatchDetailsDto b:getEmployeeList()){
											
										if(b.getEmployeeId()==a.getEmployeeId())
										{
													a.setEmployeeName(b.getEmployeeName());
													batchList.add(a);
										}
						}
		}
		
		
		
		
		this.batchList=batchList;

	}
	private void setcourseList(ResultSet course){



		courseList=new ArrayList<>();
		CourseBatchDetailsDto courseDetail;
				try {
					while(course.next()){
						 courseDetail=new CourseBatchDetailsDto();
						courseDetail.setCourseDuration(course.getInt("COURSE_DURATION"));
						courseDetail.setCourseFees(course.getInt("COURSE_FEES"));
						courseDetail.setCourseName(course.getString("COURSE_NAME"));
						courseList.add(courseDetail);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	private void setbatchList(ResultSet batch){



				batchList=new ArrayList<>();
				try {
					while(batch.next())
					{
						CourseBatchDetailsDto batchDetail=new CourseBatchDetailsDto();
						batchDetail.setEmployeeId(batch.getInt("ID"));
						batchDetail.setCourseName(batch.getString("COURSE_NAME"));
						batchDetail.setBatchTimeing(batch.getString("BATCH_TIMEING"));
						batchList.add(batchDetail);					
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	private void setemployeeList(ResultSet emp){




		employeeList=new  ArrayList<>();
		CourseBatchDetailsDto employee;
				try {
					while(emp.next()){
						employee=new CourseBatchDetailsDto();
						employee.setEmployeeId(emp.getInt("ID"));
						employee.setEmployeeName(emp.getString("NAME"));
						employeeList.add(employee);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				setemployeeName();
				setcourseFeesDuration();
	}
	public Boolean getemployeeDetail(){




				
				Connection connection=null;
				Statement pre=null;
				ResultSet result=null;
					try {
									connection=createconnection();
									if(connection!=null)	
									{
													pre=connection.createStatement();
													if(pre!=null){
																result=pre.executeQuery(SqlstmtBatchDetailGet.getEmployeeName());
																setemployeeList(result);
																return true;
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
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							if(pre!=null){
								try {
									pre.close();
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							if(result!=null){
									try {
										result.close();
									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								
							}
						
					}
					return false;
				
			}

	public Boolean getBatchDetails(){



				Connection connection=null;
				Statement pre=null;
				ResultSet result=null;
					try {
									connection=createconnection();
									if(connection!=null)	
									{
													pre=connection.createStatement();
													if(pre!=null){
																result=pre.executeQuery(SqlstmtBatchDetailGet.getBatchDetail());
																setbatchList(result);
																return true;
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
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							if(pre!=null){
								try {
									pre.close();
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							if(result!=null){
									try {
										result.close();
									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								
							}
						
					}
					
					
					return false;

						
				
			}

	public Boolean getCourse(){


						Connection connection=null;
						Statement pre=null;
						ResultSet result=null;
							try {
											connection=createconnection();
											if(connection!=null)	
											{
															pre=connection.createStatement();
															if(pre!=null){
																		result=pre.executeQuery(SqlstmtBatchDetailGet.getCourse());
																		setcourseList(result);
																		return true;
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
										} catch (SQLException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
									if(pre!=null){
										try {
											pre.close();
										} catch (SQLException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
									if(result!=null){
											try {
												result.close();
											} catch (SQLException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										
									}
								
							}
							
							
							return false;
					}

	
	
}
