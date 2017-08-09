package org.ims.ignou.view.student.registration;

import java.util.ArrayList;

public class test_student 
{
	public static void main(String[] args)
	{				
		FacultyCourseDetails Ds=new FacultyCourseDetails("Amit Shrivastav","Java","6:00 AM","7:00 AM");
		ArrayList<FacultyCourseDetails> arrayList=new ArrayList<>();
		arrayList.add(Ds);
		Ds=new FacultyCourseDetails("Vivek Sir","c++","8:00 AM","9:00 AM");
		arrayList.add(Ds);
		Ds=new FacultyCourseDetails("Anjit Sir","Oracle Dba","4:00 AM","5:00 AM");
		arrayList.add(Ds);
		Ds=new FacultyCourseDetails("Bunty goswami","UI","10:00 AM","10:30 AM");
		arrayList.add(Ds);
		Ds=new FacultyCourseDetails("Rohit goswami","UI","10:00 AM","10:30 AM");
		arrayList.add(Ds);
		Student student=new Student(arrayList);
		student.setVisible(true);		
	}
}
