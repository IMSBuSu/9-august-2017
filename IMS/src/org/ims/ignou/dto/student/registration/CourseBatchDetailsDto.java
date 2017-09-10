package org.ims.ignou.dto.student.registration;

public class CourseBatchDetailsDto {
	
	
			private String courseName;
			private String employeeName;
			private int courseDuration;
			private int courseFees;
			private String batchTimeing;
			private int employeeId;
			public String getCourseName() {
				return courseName;
			}
			public void setCourseName(String courseName) {
				this.courseName = courseName;
			}
			public String getEmployeeName() {
				return employeeName;
			}
			public void setEmployeeName(String employeeName) {
				this.employeeName = employeeName;
			}
			public int getCourseDuration() {
				return courseDuration;
			}
			public void setCourseDuration(int courseDuration) {
				this.courseDuration = courseDuration;
			}
			public int getCourseFees() {
				return courseFees;
			}
			public void setCourseFees(int courseFees) {
				this.courseFees = courseFees;
			}
			public String getBatchTimeing() {
				return batchTimeing;
			}
			public void setBatchTimeing(String batchTimeing) {
				this.batchTimeing = batchTimeing;
			}
			public int getEmployeeId() {
				return employeeId;
			}
			public void setEmployeeId(int employeeId) {
				this.employeeId = employeeId;
			}
			@Override
			public String toString() {
				return "CourseBatchDetailsDto [courseName=" + courseName + ", employeeName=" + employeeName
						+ ", courseDuration=" + courseDuration + ", courseFees=" + courseFees + ", batchTimeing="
						+ batchTimeing + ", employeeId=" + employeeId + "]";
			}
			
	

	
	
	
}
