package org.ims.ignou.view.course.update;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.ims.ignou.helper.course.delete.DeleteValidation;
import org.ims.ignou.helper.course.update.SearchValidation;
import org.ims.ignou.view.course.find.CourseFindView;

public class CourseUpdateView extends CourseFindView {

	
	
	private CourseUpdateView Updatefindview;
			public CourseUpdateView() {
			
					this.remove(btnSearch);
					btnSearch=new JButton("Search");
					Updatefindview=this;

					btnSearch.setForeground(Color.BLACK);
					btnSearch.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {

							SearchValidation courseValidation=new SearchValidation();
							courseValidation.cannotBlank(Updatefindview);
						}
					});
					btnSearch.setBounds(166, 103, 89, 23);
					getContentPane().add(btnSearch);

			}	
}


