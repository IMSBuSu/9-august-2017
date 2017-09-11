package org.ims.ignou.view.student.find;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.helper.student.find.SearchStudent;
import org.ims.ignou.helper.student.find.ShowStu;
import org.ims.ignou.helper.student.find.StuFindValidation;

public class StudentSearchView extends JFrame {

	private JPanel contentPane;
	
	protected JTextField txtStudentIFld;
	protected JLabel lblErrorMessage;
	protected JButton btnSearch;
	
	

	public JLabel getLblErrorMessage() {
		return lblErrorMessage;
	}



	public void setLblErrorMessage(String Message) {
		
		lblErrorMessage.setText(Message);
	}



	
	public JTextField getTxtStudentIFld() {
		return txtStudentIFld;
	}



	public void validation(){
				
		StuFindValidation deleteValidation=new StuFindValidation();
					if(deleteValidation.canNotblank(this)){
									int id=Integer.parseInt(txtStudentIFld.getText());
									SearchStudent student=new SearchStudent();
									Boolean found=student.chkIdDb(id);
									if(!found){
												JOptionPane.showMessageDialog(this, "Student Not Found");
									}
									else{
										this.setVisible(false);
													new ShowStu().showEmpDetail(student.getstudentFinddto(), txtStudentIFld.getText());;
													
									}
					}
		
	}

	public StudentSearchView() {
		
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
		setTitle("Search Student");
		setResizable(false);
		setBounds(100, 100, 555, 287);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Student Id");
		lblEmployeeId.setBounds(321, 85, 59, 14);
		contentPane.add(lblEmployeeId);
		
		 btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

						validation();
				
			}
		});
		btnSearch.setBounds(365, 151, 120, 23);
		contentPane.add(btnSearch);
		
		txtStudentIFld = new JTextField();
		txtStudentIFld.setBounds(413, 82, 109, 20);
		contentPane.add(txtStudentIFld);
		txtStudentIFld.setColumns(10);
		
		 lblErrorMessage = new JLabel("");
		 lblErrorMessage.setForeground(Color.ORANGE);
		 lblErrorMessage.setBackground(Color.ORANGE);
		lblErrorMessage.setBounds(339, 126, 173, 14);
		contentPane.add(lblErrorMessage);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(StudentSearchView.class.getResource("/org/ims/ignou/view/employee/find/Search.jpg")));
		lblNewLabel.setBounds(0, 0, 282, 258);
		contentPane.add(lblNewLabel);
		setLocationRelativeTo(null);
	}
}
