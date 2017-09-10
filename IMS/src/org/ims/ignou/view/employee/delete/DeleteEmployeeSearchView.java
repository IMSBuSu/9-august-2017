package org.ims.ignou.view.employee.delete;

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

import org.ims.ignou.helper.employee.delete.EmpDeleteViewValidation;
import org.ims.ignou.helper.employee.delete.setDeleteEmpdetail;
import org.ims.ignou.helper.employee.find.SearchEmployee;
import javax.swing.ImageIcon;

public class DeleteEmployeeSearchView extends JFrame {


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
				
					EmpDeleteViewValidation deleteValidation=new EmpDeleteViewValidation();
					if(deleteValidation.canNotblank(this)){
									int id=Integer.parseInt(txtEmployeeIFld.getText());
									SearchEmployee employee=new SearchEmployee();
									Boolean found=employee.chkIdDb(id);
									if(!found){
												JOptionPane.showMessageDialog(this, "Employee Not Found");
									}
									else{
										this.setVisible(false);
													new setDeleteEmpdetail().showEmpDetail(employee.getEmployeeFinddto(), txtEmployeeIFld.getText());
									}
					}
		
	}

	public DeleteEmployeeSearchView() {
		
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
		 lblErrorMessage.setForeground(Color.RED);
		 lblErrorMessage.setBackground(Color.RED);
		lblErrorMessage.setBounds(330, 140, 173, 14);
		contentPane.add(lblErrorMessage);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(DeleteEmployeeSearchView.class.getResource("/org/ims/ignou/view/employee/find/Search.jpg")));
		lblNewLabel.setBounds(0, 0, 288, 264);
		contentPane.add(lblNewLabel);
		setLocationRelativeTo(null);
	}
}
