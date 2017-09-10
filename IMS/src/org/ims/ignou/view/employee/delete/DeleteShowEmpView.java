package org.ims.ignou.view.employee.delete;

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

import org.ims.ignou.helper.employee.delete.DeleteEmpRecord;

public class DeleteShowEmpView extends JFrame{

	
	


	private JPanel contentPane;

	private JTextField textEMPname;
	private JTextField textempdob;
	private JTextField textempid;
	private JTextField textEmailid;
	private JTextField textfatherName;
	private JLabel labelempimage;
	private DeleteShowEmpView frame;

	public void setempImage(ImageIcon img){
		 labelempimage.setIcon(img);

	}
	public void setTextEMPname(String textEMPname) {
		this.textEMPname.setText(textEMPname);
	}

	public void setTextempdob(String textempdob) {
		this.textempdob.setText(textempdob);
	}

	public void setTextempid(String textempid) {
		setTitle("Employee Id :- "+textempid);
		this.textempid.setText(textempid);
	}

	public void setTextEmailid(String textEmailid) {
		this.textEmailid.setText(textEmailid);
	}

	public void setTextfatherName(String textfatherName) {
		this.textfatherName.setText(textfatherName);
	}

	
	 public DeleteShowEmpView() {
	 
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
		   frame=this;
		setBounds(100, 100, 607, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setBounds(39, 39, 88, 14);
		contentPane.add(lblEmployeeName);
		
		textEMPname = new JTextField();
		textEMPname.setBounds(137, 36, 263, 20);
		contentPane.add(textEMPname);
		textEMPname.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("DOB");
		lblDateOfBirth.setBounds(39, 67, 26, 14);
		contentPane.add(lblDateOfBirth);
		
		textempdob = new JTextField();
		textempdob.setColumns(10);
		textempdob.setBounds(137, 64, 263, 20);
		contentPane.add(textempdob);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setBounds(39, 95, 88, 14);
		contentPane.add(lblEmployeeId);
		
		textempid = new JTextField();
		textempid.setColumns(10);
		textempid.setBounds(137, 92, 263, 20);
		contentPane.add(textempid);
		
		JLabel lblEmailId = new JLabel("Email Id");
		lblEmailId.setBounds(39, 123, 88, 14);
		contentPane.add(lblEmailId);
		
		textEmailid = new JTextField();
		textEmailid.setColumns(10);
		textEmailid.setBounds(137, 120, 263, 20);
		contentPane.add(textEmailid);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setBounds(39, 151, 88, 14);
		contentPane.add(lblFathersName);
		
		textfatherName = new JTextField();
		textfatherName.setColumns(10);
		textfatherName.setBounds(137, 148, 263, 20);
		contentPane.add(textfatherName);
		
		 labelempimage = new JLabel("Image Not Found");
		labelempimage.setBackground(Color.CYAN);
		labelempimage.setBounds(453, 60, 103, 105);
		contentPane.add(labelempimage);
		
		
		
		JButton btndeleteEmpRecord = new JButton("Delete Employee");
		btndeleteEmpRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				int askDeleterecrd=JOptionPane.showConfirmDialog(frame, "Do You Want To Delete Employee Record ?");
				if(askDeleterecrd==0){
							frame.setVisible(false);
							DeleteEmpRecord deleteEmpRecord=new DeleteEmpRecord();
							Boolean isRecord=deleteEmpRecord.DeleteRecord(textEmailid.getText(),Integer.parseInt(textempid.getText()));
								if(isRecord){
									JOptionPane.showMessageDialog(frame, "Success To Delete Record");				
								}		
								else{
									JOptionPane.showMessageDialog(frame, "Failed To Delete Reocrd");
								}				
				}
				
			}	
		});
		btndeleteEmpRecord.setBounds(229, 217, 133, 23);
		contentPane.add(btndeleteEmpRecord);
		setLocationRelativeTo(null);

	
	 }
}	 
