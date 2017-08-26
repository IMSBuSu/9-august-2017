package org.ims.ignou.view.course.find;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.ims.ignou.helper.course.add.CourseAddValidation;
import org.ims.ignou.helper.course.find.FindValidation;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class CourseFindView extends JFrame
{
	private JTextField txtCourseId;
	private JLabel lblEnterCourseId;
	protected JButton btnSearch;
	private JLabel lblCourseName;
	private JLabel lblOr;
	private JTextField textCourseName;
	private JLabel lblerrormessagecourseid;
	private JLabel lblCannotBlank;
	protected CourseFindView findView;
	protected FindValidation findValidation;
	
	public JLabel getLblerrormessagecourseid() {
		return lblerrormessagecourseid;
	}

	public JLabel getLblCannotBlank() {
		return lblCannotBlank;
	}

	public JTextField getTxtCourseId() {
		return txtCourseId;
	}

	public JTextField getTextCourseName() {
		return textCourseName;
	}

	public CourseFindView() {
		findValidation=new FindValidation();
		findView=this;		
		setTitle("                                              Find Course");
		setResizable(false);
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
		
		
		setBounds(100, 100, 464, 166);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setForeground(Color.ORANGE);
		setForeground(Color.ORANGE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		
		lblEnterCourseId = new JLabel("Course Id ");
		lblEnterCourseId.setBounds(59, 67, 58, 14);
		getContentPane().add(lblEnterCourseId);
		
		txtCourseId = new JTextField("");
		txtCourseId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblerrormessagecourseid.setText("");
				lblCannotBlank.setText("");
				textCourseName.setText("");
			}
		});
		txtCourseId.setBounds(159, 64, 129, 20);
		getContentPane().add(txtCourseId);
		txtCourseId.setColumns(10);
		
		 btnSearch = new JButton("Search");
		 btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				findValidation.cannotBlank(findView);
				
			}
		});
		btnSearch.setBounds(166, 103, 89, 23);
		getContentPane().add(btnSearch);
		
		lblCourseName = new JLabel("Course Name");
		lblCourseName.setBounds(56, 12, 73, 14);
		getContentPane().add(lblCourseName);
		
		lblOr = new JLabel("or");
		lblOr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOr.setBounds(176, 39, 18, 14);
		getContentPane().add(lblOr);
		
		textCourseName = new JTextField("");
		textCourseName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblCannotBlank.setText("");
				lblerrormessagecourseid.setText("");
				txtCourseId.setText("");
			}
			
		});
		textCourseName.setBounds(160, 9, 146, 20);
		getContentPane().add(textCourseName);
		textCourseName.setColumns(10);
		
		lblerrormessagecourseid = new JLabel("");
		lblerrormessagecourseid.setForeground(Color.RED);
		lblerrormessagecourseid.setBounds(317, 67, 114, 14);
		getContentPane().add(lblerrormessagecourseid);
		
		
		lblCannotBlank = new JLabel("");
		lblCannotBlank.setForeground(Color.RED);
		lblCannotBlank.setBounds(265, 107, 165, 14);
		getContentPane().add(lblCannotBlank);
		
		
	}
}
