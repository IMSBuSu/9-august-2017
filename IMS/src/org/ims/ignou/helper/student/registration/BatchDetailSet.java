package org.ims.ignou.helper.student.registration;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import org.ims.ignou.dto.student.registration.CourseBatchDetailsDto;
import org.ims.ignou.view.student.registration.StudentRegistration;

public class BatchDetailSet {

	public DefaultComboBoxModel<String> setCourse(ArrayList<CourseBatchDetailsDto> course){
		DefaultComboBoxModel<String> courseModel=new DefaultComboBoxModel<>();
										
									courseModel.addElement("Select Course");
										for(CourseBatchDetailsDto d:course){

											courseModel.addElement(d.getCourseName());	
										
										}
		
		
		
				return  courseModel;
		
	}
	
	
	public void setFaculty(String course,String batchTimeing,ArrayList<CourseBatchDetailsDto> batchlist,StudentRegistration frame){
		DefaultComboBoxModel<String> courseModel=new DefaultComboBoxModel<>();
		courseModel.addElement("Teacher");
										for(CourseBatchDetailsDto d:batchlist){
														if(d.getCourseName().equals(course)  && d.getBatchTimeing().equals(batchTimeing)){
																courseModel.addElement(d.getEmployeeName()+" Emp Id : "+Integer.toString(d.getEmployeeId()));									
														}
										}
	
						frame.setFaculty(courseModel);
	}
	

	public  void setBatchTimeing(String course,ArrayList<CourseBatchDetailsDto> batchlist,StudentRegistration frame){
		
		DefaultComboBoxModel<String> courseModel=new DefaultComboBoxModel<>();
		courseModel.addElement("Batch Timeing");
			for(CourseBatchDetailsDto d:batchlist){
							if(d.getCourseName().equals(course) ){
									courseModel.addElement(d.getBatchTimeing());	
									
							}
			}

		frame.setBatch_timeing(courseModel);
	}
	
	public void setCourseFeesDuration(StudentRegistration frame,String selectedCourse,ArrayList<CourseBatchDetailsDto> courseList){
				
			
						for(CourseBatchDetailsDto list:courseList)
						{
							System.out.println(list.getCourseName());

									if(list.getCourseName().equals(selectedCourse)){
										
												frame.setTextDuration(Integer.toString(list.getCourseDuration()));
												frame.setTextFees(Integer.toString(list.getCourseFees()));
												return;
									}
							
						}
					
		
	}
	
	
	
}

