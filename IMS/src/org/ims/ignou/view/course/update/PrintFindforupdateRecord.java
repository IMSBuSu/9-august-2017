package org.ims.ignou.view.course.update;

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

import org.ims.ignou.helper.course.update.UpdateValidation;
import org.ims.ignou.view.course.find.CourseFindView;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrintFindforupdateRecord extends JFrame {

	private JPanel contentPane;
	private JTextField textCourseName;
	private JTextField textCourseDuration;
	private JTextField textCourseFess;
	private int textcourseid;
	private PrintFindforupdateRecord  frame;
	private JLabel lblerrorcoursefees;
	private JLabel lblerrorcourseduration;
	private JLabel lblcoursename;
	private JButton btnCancel;
	
	
	
	public int getTextcourseid() {
		return textcourseid;
	}

	public void setTextcourseid(int textcourseid) {
		this.textcourseid = textcourseid;
	}

	public void setLblerrorcourseduration(String errormessage) {
		lblerrorcourseduration.setText(errormessage);
	}

	public void setLblerrorcoursefees(String errormessage) {
		lblerrorcoursefees.setText(errormessage);
	}

	public void setLblcoursename(String errormessage) {
		lblcoursename.setText(errormessage);
	}

	public JTextField getTextCourseName() {
		return textCourseName;
	}


	public JTextField getTextCourseDuration() {
		return textCourseDuration;
	}


	public JTextField getTextCourseFess() {
		return textCourseFess;
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


	public PrintFindforupdateRecord() {
		frame=this;
		setTitle("       Course Details");
		setResizable(false);
		setBounds(100, 100, 480, 159);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcourseName = new JLabel("Course Name");
		lblcourseName.setBounds(20, 15, 77, 14);
		contentPane.add(lblcourseName);
		
		JLabel lblCourseDuration = new JLabel("Course Duration");
		lblCourseDuration.setBounds(20, 40, 87, 14);
		contentPane.add(lblCourseDuration);
		
		JLabel labcourseFess = new JLabel("Course Fess");
		labcourseFess.setBounds(20, 65, 63, 14);
		contentPane.add(labcourseFess);
		
		textCourseName = new JTextField();
		textCourseName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblcoursename.setText("");
				
			}
		});
		textCourseName.setEditable(false);
		textCourseName.setColumns(10);
		textCourseName.setBounds(110, 12, 146, 20);
		contentPane.add(textCourseName);
		
		textCourseDuration = new JTextField();
		textCourseDuration.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblerrorcourseduration.setText("");
			}
		});
		textCourseDuration.setEditable(false);
		textCourseDuration.setColumns(10);
		textCourseDuration.setBounds(110, 37, 146, 20);
		contentPane.add(textCourseDuration);
		
		textCourseFess = new JTextField();
		textCourseFess.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblerrorcoursefees.setText("");
			}
		});
		textCourseFess.setEditable(false);
		textCourseFess.setColumns(10);
		textCourseFess.setBounds(110, 62, 146, 20);
		contentPane.add(textCourseFess);
		
		JButton btnSearchAnotherRecord = new JButton("Update");
		btnSearchAnotherRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					UpdateValidation updateValidation=new UpdateValidation();
					updateValidation.cannotBlank(frame);					
				
				
				
			}
		});
		btnSearchAnotherRecord.setBounds(148, 96, 85, 23);
		contentPane.add(btnSearchAnotherRecord);
		
		JButton btnEditName = new JButton("Edit");
		btnEditName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCourseName.setEditable(true);
			}
		});
		btnEditName.setBounds(266, 11, 56, 23);
		contentPane.add(btnEditName);
		
		JButton btnEditDuration = new JButton("Edit");
		btnEditDuration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textCourseDuration.setEditable(true);
			}
		});
		btnEditDuration.setBounds(266, 36, 56, 23);
		contentPane.add(btnEditDuration);
		
		JButton btnEditFees = new JButton("Edit");
		btnEditFees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCourseFess.setEditable(true);
				
			}
		});
		btnEditFees.setBounds(266, 61, 56, 23);
		contentPane.add(btnEditFees);
		
		
		
		 lblerrorcoursefees = new JLabel("");
		lblerrorcoursefees.setForeground(Color.RED);
		lblerrorcoursefees.setBounds(332, 65, 118, 14);
		contentPane.add(lblerrorcoursefees);
		
		 lblerrorcourseduration = new JLabel("");
		lblerrorcourseduration.setForeground(Color.RED);
		lblerrorcourseduration.setBounds(332, 40, 118, 14);
		contentPane.add(lblerrorcourseduration);
		
		 lblcoursename = new JLabel("");
		lblcoursename.setForeground(Color.RED);
		lblcoursename.setBounds(332, 15, 94, 14);
		contentPane.add(lblcoursename);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnCancel.setBounds(286, 96, 77, 23);
		contentPane.add(btnCancel);
		setLocationRelativeTo(null);
	}
}
