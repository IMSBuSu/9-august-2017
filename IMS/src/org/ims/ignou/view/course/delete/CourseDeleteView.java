package org.ims.ignou.view.course.delete;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.view.course.find.CourseFindView;

public class CourseDeleteView extends CourseFindView {

		public CourseDeleteView() {
				
				btnSearch.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						findValidation.cannotBlank(findView);
						
					}
				});
		
		
		}

}
