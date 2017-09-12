package org.ims.ignou.dto.employee.find;

public class EmployeeFinddto 
{
		private String employeeid;
		private String emailId;
		private String dob;
		private String employeeName;
		private String fatherName;
		private String image;
		
		public String getEmployeeid() {
			return employeeid;
		}
		public void setEmployeeid(String employeeid) {
			this.employeeid = employeeid;
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
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
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
		@Override
		public String toString() {
			return "EmployeeFinddto [employeeid=" + employeeid + ", emailId=" + emailId + ", dob=" + dob
					+ ", employeeName=" + employeeName + ", fatherName=" + fatherName + ", image=" + image + "]";
		}
		
}
