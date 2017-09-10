package org.ims.ignou.helper.student.registration;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.employee.registration.CourseGetFromDB;
import org.ims.ignou.dao.student.registration.GetCourseFromDb;
import org.ims.ignou.dto.student.registration.CourseBatchDetailsDto;

public class BatchDetails {

	ArrayList<CourseBatchDetailsDto> courselist;
	ArrayList<CourseBatchDetailsDto> batchList;
	
	
	public ArrayList<CourseBatchDetailsDto> getCourselist() {
		return courselist;
	}


	private void setCourselist(ArrayList<CourseBatchDetailsDto> courselist) {
		this.courselist = courselist;
	}


	public ArrayList<CourseBatchDetailsDto> getBatchList() {
		return batchList;
	}


	private void setBatchList(ArrayList<CourseBatchDetailsDto> batchList) {
		this.batchList = batchList;
	}


	public Boolean  getCourseAndBatch(){
		GetCourseFromDb courseFromDb=new GetCourseFromDb();
		courseFromDb.getCourse();
			
			if(courseFromDb.getCourseList().size()>0){
							courseFromDb.getBatchDetails();
							if(courseFromDb.getBatchList().size()>0){
										courseFromDb.getemployeeDetail();		
										setBatchList(courseFromDb.getBatchList());
										setCourselist(courseFromDb.getCourseList());
										return true;
							}
							else{
								JOptionPane.showMessageDialog(null, "No Faculty Found For Student Teaching");
								return false;
							}
			}
			else{
				
				JOptionPane.showConfirmDialog(null, "No Teacher Found Do you want to Register New Teacher ? ");
				return false;
			}
	
	}

			
	

}


