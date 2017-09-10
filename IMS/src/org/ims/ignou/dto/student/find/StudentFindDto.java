package org.ims.ignou.dto.student.find;

public class StudentFindDto {
	
	
	
	private String studentid;
	private String emailId;
	private String dob;
	private String studentName;
	
	private String fatherName;
	private String image;
	private String courseName;
	private String batchTimeing;
	
	private String employeeName;
	private String remainFees;
	
	

	
	
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getBatchTimeing() {
		return batchTimeing;
	}
	public void setBatchTimeing(String batchTimeing) {
		this.batchTimeing = batchTimeing;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getRemainFees() {
		return remainFees;
	}
	public void setRemainFees(String remainFees) {
		this.remainFees = remainFees;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
