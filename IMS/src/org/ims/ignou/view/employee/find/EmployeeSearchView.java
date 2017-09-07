package org.ims.ignou.view.employee.find;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.dao.employee.delete.DeleteEmpFromDB;
import org.ims.ignou.helper.employee.delete.EmpDeleteValidation;
import org.ims.ignou.helper.employee.find.SearchEmployee;

public class EmployeeSearchView extends JFrame {

	private JPanel contentPane;
	
	private JTextField txtEmployeeIFld;
	private JLabel lblErrorMessage;
	
	

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
				
					EmpDeleteValidation deleteValidation=new EmpDeleteValidation();
					if(deleteValidation.canNotblank(this)){
									int id=Integer.parseInt(txtEmployeeIFld.getText());
									SearchEmployee employee=new SearchEmployee();
									Boolean found=employee.chkIdDb(id);
									if(!found){
												JOptionPane.showMessageDialog(this, "Employee Not Found");
									}
									else{
									
													employee.showEmpDetail();
													this.setVisible(false);
									}
									
					}
					
		
	}

	public EmployeeSearchView() {
		
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
		setTitle("Search Employee");
		setResizable(false);
		setBounds(100, 100, 369, 180);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setBounds(50, 33, 59, 14);
		contentPane.add(lblEmployeeId);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
						validation();
				
			}
		});
		btnSearch.setBounds(130, 98, 89, 23);
		contentPane.add(btnSearch);
		
		txtEmployeeIFld = new JTextField();
		txtEmployeeIFld.setBounds(141, 30, 158, 20);
		contentPane.add(txtEmployeeIFld);
		txtEmployeeIFld.setColumns(10);
		
		 lblErrorMessage = new JLabel("");
		 lblErrorMessage.setForeground(Color.RED);
		 lblErrorMessage.setBackground(Color.RED);
		lblErrorMessage.setBounds(139, 57, 173, 14);
		contentPane.add(lblErrorMessage);
		setLocationRelativeTo(null);
	}
}
