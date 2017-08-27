package org.ims.ignou.view.course.delete;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.dao.course.delete.DeleteCourseFromDB;

public class DeleteFindRecord extends JFrame {

	private JPanel contentPane;
	private JTextField textCourseId;
	private JTextField textCourseName;
	private JTextField textCourseDuration;
	private JTextField textCourseFess;
	private DeleteFindRecord  frame;
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


	public DeleteFindRecord() {
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
		
		JButton btnDelete = new JButton("Delete Course");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int option=JOptionPane.showConfirmDialog(frame ,"Do You Want To Delete Record ? ");
				if(option==0){				
						DeleteCourseFromDB deleteFindRecord=new DeleteCourseFromDB();
						Boolean isdelete=deleteFindRecord.DeleteCourse(Integer.parseInt(textCourseId.getText()));
						if(isdelete){
							JOptionPane.showMessageDialog(frame, "Course  Deleted Successfully ");
							frame.setVisible(false);
						}
						else{
							JOptionPane.showMessageDialog(frame, "Unable to Delete Course !");
							frame.setVisible(false);
						}
				}
		
			}
		});
		btnDelete.setBounds(108, 127, 101, 23);
		contentPane.add(btnDelete);
		setLocationRelativeTo(null);
	}
}
