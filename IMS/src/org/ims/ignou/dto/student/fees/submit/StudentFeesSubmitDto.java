package org.ims.ignou.dto.student.fees.submit;

public class StudentFeesSubmitDto {

			private int remainfees;
			private int studentid;
			public int getRemainfees() {
				return remainfees;
			}
			public void setRemainfees(int remainfees) {
				this.remainfees = remainfees;
			}
			public int getStudentid() {
				return studentid;
			}
			public void setStudentid(int studentid) {
				this.studentid = studentid;
			}
			@Override
			public String toString() {
				return "StudentFeesSubmitDto [remainfees=" + remainfees + ", studentid=" + studentid + "]";
			}
			
			
		
}
