package org.ims.ignou.view.employee.registration;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.ims.ignou.helper.employee.registration.CourseGet;
import org.ims.ignou.view.course.add.CourseAddView;
import org.ims.ignou.view.extendable.Registration;

public class test_employee 
{
	public static void main(String[] args){		
		
		CourseGet arrayList=new CourseGet();
		ArrayList<String> course=arrayList.getCourseFromDb();
		RegistrationeEmployee employee;
		if(course!=null)
		{

					employee=new RegistrationeEmployee(course);
					employee.setVisible(true);
		}
		else{
			
			   try
			    {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
				} 
			    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
			    	try {
						UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
					} 
			    	catch (ClassNotFoundException | InstantiationException | IllegalAccessException
							| UnsupportedLookAndFeelException e) {
								    	//theme not supported	
					}	    
			    	
				}			   
				if(JOptionPane.showConfirmDialog(null, "No Course Found In System. Do you want to Add New Course ?")==0);
				{
					CourseAddView addNewcourse=new CourseAddView();
					addNewcourse.setVisible(true);
				}
		}

		
		
		
	
	}	
	
}