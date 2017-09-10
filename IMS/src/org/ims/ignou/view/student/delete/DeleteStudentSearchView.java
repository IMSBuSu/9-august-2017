package org.ims.ignou.view.student.delete;

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

import org.ims.ignou.helper.student.delete.StuDeleteViewValidation;
import org.ims.ignou.helper.student.delete.setDeleteStudetail;
import org.ims.ignou.helper.student.find.SearchStudent;

public class DeleteStudentSearchView extends JFrame {


private JPanel contentPane;
	
	private JTextField txtEmployeeIFld;
	private JLabel lblErrorMessage;
	private JLabel lblNewLabel;
	
	

	public JLabel getLblErrorMessage() {
		return lblErrorMessage;
	}



	public void setLblErrorMessage(String Message) {
		
		lblErrorMessage.setText(Message);
	}



	public JTextField getTxtEmployeeIFld() {
		return txtEmployeeIFld;
	}

	public void validation(){
				
					StuDeleteViewValidation deleteValidation=new StuDeleteViewValidation();
					if(deleteValidation.canNotblank(this)){
									int id=Integer.parseInt(txtEmployeeIFld.getText());
									SearchStudent student=new SearchStudent();
									Boolean found=student.chkIdDb(id);
									if(!found){
												JOptionPane.showMessageDialog(this, "Student Not Found");
									}
									else{
										this.setVisible(false);
											
													new setDeleteStudetail().showEmpDetail(student.getstudentFinddto(), txtEmployeeIFld.getText());
									}
					}
					
	}

	public DeleteStudentSearchView() {
		
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
		setBounds(100, 100, 541, 293);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setBounds(298, 100, 59, 14);
		contentPane.add(lblEmployeeId);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
						validation();
				
			}
		});
		btnSearch.setBounds(374, 165, 89, 23);
		contentPane.add(btnSearch);
		
		txtEmployeeIFld = new JTextField();
		txtEmployeeIFld.setBounds(367, 97, 158, 20);
		contentPane.add(txtEmployeeIFld);
		txtEmployeeIFld.setColumns(10);
		
		 lblErrorMessage = new JLabel("");
		 lblErrorMessage.setForeground(Color.ORANGE);
		 lblErrorMessage.setBackground(Color.ORANGE);
		lblErrorMessage.setBounds(330, 140, 173, 14);
		contentPane.add(lblErrorMessage);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(DeleteStudentSearchView.class.getResource("/org/ims/ignou/view/employee/find/Search.jpg")));
		lblNewLabel.setBounds(0, 0, 288, 264);
		contentPane.add(lblNewLabel);
		setLocationRelativeTo(null);
	}
}
