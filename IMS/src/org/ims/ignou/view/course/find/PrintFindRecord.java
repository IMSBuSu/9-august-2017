package org.ims.ignou.view.course.find;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrintFindRecord extends JFrame {

	private JPanel contentPane;
	private JTextField textCourseId;
	private JTextField textCourseName;
	private JTextField textCourseDuration;
	private JTextField textCourseFess;
	private PrintFindRecord  frame;
	
	public void setTextCourseId(Integer textCourseId) {
		this.textCourseId.setText(textCourseId.toString());
	}


	public void setTextCourseName(String textCourseName) {
		this.textCourseName.setText(textCourseName);
	}


	public void setTextCourseDuration(Integer textCourseDuration) {
		this.textCourseDuration.setText(textCourseDuration.toString());
	}


	public void setTextCourseFess(Integer textCourseFess) {
		this.textCourseFess.setText(textCourseFess.toString());
	}


	public PrintFindRecord() {
		frame=this;
		setTitle("       Course Details");
		setResizable(false);
		setBounds(100, 100, 334, 185);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCorseId = new JLabel("Course Id");
		lblCorseId.setBounds(32, 24, 63, 14);
		contentPane.add(lblCorseId);
		
		JLabel lblcourseName = new JLabel("Course Name");
		lblcourseName.setBounds(32, 49, 77, 14);
		contentPane.add(lblcourseName);
		
		JLabel lblCourseDuration = new JLabel("Course Duration");
		lblCourseDuration.setBounds(32, 74, 87, 14);
		contentPane.add(lblCourseDuration);
		
		JLabel labcourseFess = new JLabel("Course Fess");
		labcourseFess.setBounds(32, 99, 63, 14);
		contentPane.add(labcourseFess);
		
		textCourseId = new JTextField();
		textCourseId.setEditable(false);
		textCourseId.setBounds(122, 21, 146, 20);
		contentPane.add(textCourseId);
		textCourseId.setColumns(10);
		
		textCourseName = new JTextField();
		textCourseName.setEditable(false);
		textCourseName.setColumns(10);
		textCourseName.setBounds(122, 46, 146, 20);
		contentPane.add(textCourseName);
		
		textCourseDuration = new JTextField();
		textCourseDuration.setEditable(false);
		textCourseDuration.setColumns(10);
		textCourseDuration.setBounds(122, 71, 146, 20);
		contentPane.add(textCourseDuration);
		
		textCourseFess = new JTextField();
		textCourseFess.setEditable(false);
		textCourseFess.setColumns(10);
		textCourseFess.setBounds(122, 96, 146, 20);
		contentPane.add(textCourseFess);
		
		JButton btnSearchAnotherRecord = new JButton("Search Another Record");
		btnSearchAnotherRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				CourseFindView findView=new CourseFindView();
				findView.setVisible(true);
			}
		});
		btnSearchAnotherRecord.setBounds(77, 124, 146, 23);
		contentPane.add(btnSearchAnotherRecord);
		setLocationRelativeTo(null);
	}
}
