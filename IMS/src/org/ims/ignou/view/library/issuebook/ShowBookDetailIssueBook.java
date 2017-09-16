package org.ims.ignou.view.library.issuebook;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.ims.ignou.helper.employee.find.SearchEmployee;
import org.ims.ignou.helper.library.issue_books.InsertDetailIssueBookHelper;
import org.ims.ignou.helper.student.find.SearchStudent;
import org.ims.ignou.view.library.find.ShowBookDetail;

public class ShowBookDetailIssueBook extends ShowBookDetail
{
	private JTextField textFieldreciverId;

	
	
	@Override
	protected void searchanother() //Method changed to Issue Book	
	{
		
		if(cannotBlank())
		{
			if(onlynumbeAlowed()){
			Boolean isfound=searchReciver();
					if(isfound)
					{
						
						InsertDetailIssueBookHelper issuebook = new InsertDetailIssueBookHelper();
						int reciverId=Integer.parseInt(textFieldreciverId.getText().trim());
						int bookid=Integer.parseInt(textFieldbookid.getText().trim());
						if(issuebook.isue(reciverId,bookid)){
							this.setVisible(false);
							JOptionPane.showMessageDialog(this, "Book  Issued Successfully!");
							
						}
						else{
							this.setVisible(false);
							JOptionPane.showMessageDialog(this, "Failed to issued book!");
						}
						
					}else{
						JOptionPane.showMessageDialog(this, "Reciver Not Found");
					}
			}		
		}
		else{
			JOptionPane.showMessageDialog(this, "Reciver Can not Blank");
		}
		
	}
	
	private Boolean onlynumbeAlowed(){
			
			try{
				Integer.parseInt(textFieldreciverId.getText().trim());
				return true;
			}
			catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(this, "Only Number Allowed in reciver id!");
				return false;
			}
	}
	private Boolean cannotBlank(){
				if(!textFieldreciverId.getText().trim().equals("")){
					return true;
				}				
				return false;
	}
	
	
	private Boolean searchReciver() {
		
		
		int id=Integer.parseInt(textFieldreciverId.getText().trim());
		SearchStudent student=new SearchStudent();
		Boolean found=student.chkIdDb(id);
				if(found){
					return true;
				}
				
	
		SearchEmployee employee=new SearchEmployee();
		found=employee.chkIdDb(id);
		
		if(found){
			return true;
		}
		
		return false;
	}




	public ShowBookDetailIssueBook() {
		
		
		setBounds(100, 100, 460, 360);
		setLocationRelativeTo(null);
		setTitle("IssueBook");
		btnSearchAnother.setText("Issue Book");
		textFieldbookid.setEnabled(false);
		textFieldBookLanGuage.setEnabled(false);
		textbookpurchasingDate.setEnabled(false);
		textFieldCategorycmbx.setEnabled(false);
		textFieldisbn.setEnabled(false);
		textFieldBooksName.setEnabled(false);
		btnSearchAnother.setLocation(168, 269);
		
		textFieldreciverId = new JTextField();
		textFieldreciverId.setBounds(164, 216, 227, 20);
		getContentPane().add(textFieldreciverId);
		textFieldreciverId.setColumns(10);
		
		JLabel lblReciverId = new JLabel("Reciver Id");
		lblReciverId.setBounds(55, 219, 66, 14);
		getContentPane().add(lblReciverId);
		
	
	
	
	}

	
}



