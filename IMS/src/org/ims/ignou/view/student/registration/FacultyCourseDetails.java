package org.ims.ignou.view.student.registration;

public class FacultyCourseDetails {
	private String FacultyName;
	private String Course;
	private String BatchStartTiming;
	private String BatchEndTiming;
	public FacultyCourseDetails(String facultyName, String course, String batchStartTiming, String batchEndTiming){
		FacultyName = facultyName;
		Course = course;
		BatchStartTiming = batchStartTiming;
		BatchEndTiming = batchEndTiming;
	}
	public String getFacultyName() {
		return FacultyName;
	}
	public String getCourse() {
		return Course;
	}
	public String getBatchStartTiming() {
		return BatchStartTiming;
	}
	public String getBatchEndTiming() {
		return BatchEndTiming;
	}	
}
