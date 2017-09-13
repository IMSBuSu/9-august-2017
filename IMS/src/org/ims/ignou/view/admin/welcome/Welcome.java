package org.ims.ignou.view.admin.welcome;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.helper.employee.registration.CourseGet;
import org.ims.ignou.helper.student.registration.BatchDetails;
import org.ims.ignou.view.course.add.CourseAddView;
import org.ims.ignou.view.course.delete.CourseDeleteView;
import org.ims.ignou.view.course.find.CourseFindView;
import org.ims.ignou.view.course.update.CourseUpdateView;
import org.ims.ignou.view.employee.delete.DeleteEmployeeSearchView;
import org.ims.ignou.view.employee.find.EmployeeSearchView;
import org.ims.ignou.view.employee.registration.RegistrationeEmployee;
import org.ims.ignou.view.inventory.add.AddNewGoods;
import org.ims.ignou.view.inventory.delete.GoodsSearchViewForDelete;
import org.ims.ignou.view.inventory.find.GoodsSearchView;
import org.ims.ignou.view.library.add.BooksAddView;
import org.ims.ignou.view.library.delete.BookFindViewforDelete;
import org.ims.ignou.view.library.find.BookFindView;
import org.ims.ignou.view.library.update.BookUpdateSearchView;
import org.ims.ignou.view.student.delete.DeleteStudentSearchView;
import org.ims.ignou.view.student.fees.submit.StudentSearchFeesUpdate;
import org.ims.ignou.view.student.find.StudentSearchView;
import org.ims.ignou.view.student.registration.StudentRegistration;

public class Welcome extends JFrame {

	private JLabel label;	
	private JPanel contentPane;
	public Welcome() 
	{
		try
	    {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
		} 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		setTitle("IMS[Institute Managment System] Version 1.0");
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 568);
		setFocusable(true);
		setLocationRelativeTo(null);	//screen open on center.
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		menuBar.setBorderPainted(false);
		setJMenuBar(menuBar);
		
		JMenu mnNew = new JMenu("Student");
		mnNew.setIcon(new ImageIcon(Welcome.class.getResource("Student.png")));
		menuBar.add(mnNew);
		
		JMenuItem menuItem_18 = new JMenuItem("New Student registration");
		menuItem_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BatchDetails courseGetFromDB=new BatchDetails();
				if(courseGetFromDB.getCourseAndBatch()){
					StudentRegistration student=new StudentRegistration(courseGetFromDB.getCourselist(),courseGetFromDB.getBatchList());
					student.setVisible(true);		
				}
			}
		});
		mnNew.add(menuItem_18);
		
		JMenuItem menuItem_15 = new JMenuItem("View Record");
		menuItem_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentSearchView searchView=new StudentSearchView();
				searchView.setVisible(true);
			}
		});
		mnNew.add(menuItem_15);
		
		JMenuItem menuItem_16 = new JMenuItem("Delete Record");
		menuItem_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new	DeleteStudentSearchView().setVisible(true);
			}
		});
		mnNew.add(menuItem_16);
		
		JMenuItem menuItem_17 = new JMenuItem("Update Record");
		mnNew.add(menuItem_17);
		
		JMenu mnStaffMember = new JMenu("Staff Member");
		mnStaffMember.setIcon(new ImageIcon(Welcome.class.getResource("staff.jpg")));
		menuBar.add(mnStaffMember);
		
		JMenuItem mntmNewFacultyRegistration = new JMenuItem("New Staff  registration");
		mntmNewFacultyRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CourseGet arrayList=new CourseGet();
				ArrayList<String> course=arrayList.getCourseFromDb();
				RegistrationeEmployee employee;
				if(course!=null)
				{

							employee=new RegistrationeEmployee(course);
							employee.setVisible(true);
				}
				else{
					
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
									| UnsupportedLookAndFeelException e2) {

							}	    
					    	
						}			   
						if(JOptionPane.showConfirmDialog(null, "No Course Found In System. Do you want to Add New Course ?")==0);
						{
							CourseAddView addNewcourse=new CourseAddView();
							addNewcourse.setVisible(true);
						}
				}

				
				
			
			}
		});
		mnStaffMember.add(mntmNewFacultyRegistration);
		
		JMenuItem menuItem_1 = new JMenuItem("Update Record");
		mnStaffMember.add(menuItem_1);
		
		JMenuItem menuItem_3 = new JMenuItem("View Record");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EmployeeSearchView employeeSearchView=new EmployeeSearchView();
				employeeSearchView.setVisible(true);
			}
		});
		mnStaffMember.add(menuItem_3);
		
		JMenuItem menuItem_2 = new JMenuItem("Delete Record");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteEmployeeSearchView deleteEmployeeSearchView=new DeleteEmployeeSearchView();
				deleteEmployeeSearchView.setVisible(true);
			
			}
		});
		mnStaffMember.add(menuItem_2);
		
		JMenu mnOrganization = new JMenu("Organization");
		mnOrganization.setIcon(new ImageIcon(Welcome.class.getResource("oRGANIZATION.jpg")));
		
		menuBar.add(mnOrganization);
		
		JMenu mnFees = new JMenu("Fees");
		mnOrganization.add(mnFees);
		
		JMenuItem mntmUpdate = new JMenuItem("Sumbit now");
		mntmUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StudentSearchFeesUpdate feesUpdate=new StudentSearchFeesUpdate("");
				feesUpdate.setVisible(true);
			}
		});
		mnFees.add(mntmUpdate);
		
		JMenuItem mntmCheckStatusItem = new JMenuItem("Check Status");
		mntmCheckStatusItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentSearchFeesUpdate feesUpdate=new StudentSearchFeesUpdate("Check Status");
				feesUpdate.setVisible(true);
					
			
			}	
		});
	
		mnFees.add(mntmCheckStatusItem);
		
		JMenu mnSalary = new JMenu("Salary");
		mnOrganization.add(mnSalary);
		
		JMenuItem mntmPayNow = new JMenuItem("Pay Now");
		mnSalary.add(mntmPayNow);
		
		JMenu mnCheckStatus = new JMenu("Check Status");
		mnSalary.add(mnCheckStatus);
		
		JMenuItem mntmByFacultyId = new JMenuItem("By Faculty Id");
		mnCheckStatus.add(mntmByFacultyId);
		
		JMenu mnBooks = new JMenu("Library");
		mnOrganization.add(mnBooks);
		
		JMenuItem mntmAddNewBook = new JMenuItem("Add new Book");
		mntmAddNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BooksAddView addView=new BooksAddView();
				addView.setVisible(true);
			
			}
		});
		mnBooks.add(mntmAddNewBook);
		
		JMenuItem mntmUpdateExistingBooks = new JMenuItem("Update Existing Book");
		mntmUpdateExistingBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				BookUpdateSearchView bookUpdateSearchView=new BookUpdateSearchView();
				bookUpdateSearchView.setVisible(true);
			}
		});
		mnBooks.add(mntmUpdateExistingBooks);
		
		JMenuItem mntmDeleteExistingBooks = new JMenuItem("Delete Existing Book");
		mntmDeleteExistingBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookFindViewforDelete bookFindViewforDelete=new BookFindViewforDelete();
				bookFindViewforDelete.setVisible(true);
			}
		});
		mnBooks.add(mntmDeleteExistingBooks);
		
		JMenuItem mntmViewExistingBooks = new JMenuItem("View  Existing Book");
		mntmViewExistingBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BookFindView bookFindView=new BookFindView();
				bookFindView.setVisible(true);

			}
		});
		mnBooks.add(mntmViewExistingBooks);
		
		JMenu mnCourse = new JMenu("Course");
		mnOrganization.add(mnCourse);
		
		JMenuItem menuItem = new JMenuItem("Add new Course");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseAddView addView=new CourseAddView();
				addView.setVisible(true);
				
			}
		});
		mnCourse.add(menuItem);
		
		JMenuItem menuItem_4 = new JMenuItem("Update Existing Course");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseUpdateView courseUpdateView=new CourseUpdateView();
				courseUpdateView.setVisible(true);
			}
		});
		mnCourse.add(menuItem_4);

		JMenuItem menuItem_5 = new JMenuItem("Delete Existing Course");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					CourseDeleteView courseDeleteView=new CourseDeleteView();
					courseDeleteView.setVisible(true);
			}
		});
		mnCourse.add(menuItem_5);
		
		JMenuItem mntmViewExistingCourse = new JMenuItem("View  Existing Course");
		mntmViewExistingCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseFindView courseFindView=new CourseFindView();
				courseFindView.setVisible(true);
			}
		});
		mnCourse.add(mntmViewExistingCourse);
		
		JMenu mnInventory = new JMenu("Inventory");
		mnOrganization.add(mnInventory);
		
		JMenuItem mntmAddNewGoods = new JMenuItem("Add new Goods");
		mntmAddNewGoods.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddNewGoods addNewGoods=new AddNewGoods();
				addNewGoods.setVisible(true);

			}
		});
		mnInventory.add(mntmAddNewGoods);
		
		JMenuItem mntmUpdateExistingGoods = new JMenuItem("Update Existing Goods");
		mnInventory.add(mntmUpdateExistingGoods);
		
		JMenuItem mntmDeleteExistingGoods = new JMenuItem("Delete Existing Goods");
		mntmDeleteExistingGoods.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GoodsSearchViewForDelete delete=new GoodsSearchViewForDelete();
				delete.setVisible(true);
			}
		});
		mnInventory.add(mntmDeleteExistingGoods);
		
		JMenuItem mntmViewExistingGoods = new JMenuItem("View  Existing goods");
		mntmViewExistingGoods.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GoodsSearchView goodsSearchView=new GoodsSearchView();
				goodsSearchView.setVisible(true);

			}
		});
		mnInventory.add(mntmViewExistingGoods);
		
		JMenu mnEmail = new JMenu("Send Message");
		mnOrganization.add(mnEmail);
		
		JMenu mnNewMenu_2 = new JMenu("Email");
		mnEmail.add(mnNewMenu_2);
		
		JMenu menu = new JMenu("Student ");
		mnNewMenu_2.add(menu);
		
		JMenuItem menuItem_11 = new JMenuItem("All Student");
		menu.add(menuItem_11);
		
		JMenuItem menuItem_12 = new JMenuItem("By Student Id");
		menu.add(menuItem_12);
		
		JMenu menu_1 = new JMenu("Faculty");
		mnNewMenu_2.add(menu_1);
		
		JMenuItem menuItem_13 = new JMenuItem("By Faculty Id");
		menu_1.add(menuItem_13);
		
		JMenuItem menuItem_14 = new JMenuItem("All Faculty");
		menu_1.add(menuItem_14);
		
		JMenu mnAverage = new JMenu("Estimate");
		mnOrganization.add(mnAverage);
		
		JMenuItem mntmExpenditureVsProfit = new JMenuItem("Expenditure VS Profit ");
		mnAverage.add(mntmExpenditureVsProfit);
		
		JMenu mnAdminProfile = new JMenu("Admin Profile");
		mnAdminProfile.setIcon(new ImageIcon(Welcome.class.getResource("login_icon.png")));
		menuBar.add(mnAdminProfile);
		
		JMenuItem mntmV = new JMenuItem("View Details");
		mnAdminProfile.add(mntmV);
		
		JMenuItem mntmChangePassword = new JMenuItem("Change Password");
		mnAdminProfile.add(mntmChangePassword);
		
		JMenuItem menuItem_23 = new JMenuItem("Update Details");
		mnAdminProfile.add(menuItem_23);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mnAdminProfile.add(mntmLogout);
		
		JMenuItem mntmLogOff = new JMenuItem("Log off");
		mnAdminProfile.add(mntmLogOff);
		
		JMenu mnRegistration = new JMenu("Registration");
		mnRegistration.setIcon(new ImageIcon(Welcome.class.getResource("register.png")));
		menuBar.add(mnRegistration);
		
		JMenuItem mntmRevenue = new JMenuItem("View Details");
		mnRegistration.add(mntmRevenue);
		
		JMenuItem mntmSendFeedback = new JMenuItem("Feed Back");
		mnRegistration.add(mntmSendFeedback);
		
		JMenu mnBackup = new JMenu("Backup");
		mnBackup.setIcon(new ImageIcon(Welcome.class.getResource("settings.png")));
		menuBar.add(mnBackup);
		
		JMenuItem mntmStart = new JMenuItem("Start new backup");
		mnBackup.add(mntmStart);
		
		JMenuItem mntmUpload = new JMenuItem("Upload Last backup");
		mnBackup.add(mntmUpload);
		
		JMenu mnAbout = new JMenu("Help");
		mnAbout.setIcon(new ImageIcon(Welcome.class.getResource("HELP.png")));
		menuBar.add(mnAbout);
		
		JMenuItem mntmContactUs = new JMenuItem("Contact us");
		mnAbout.add(mntmContactUs);
		
		JMenuItem mntmHowToUse = new JMenuItem("About");
		mnAbout.add(mntmHowToUse);
		
		JMenuItem mntmHowToUse_1 = new JMenuItem("How to use ?");
		mnAbout.add(mntmHowToUse_1);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);	
		contentPane.setLayout(null);
		
		label = new JLabel("");				
		label.setIcon(new ImageIcon(Welcome.class.getResource("edu2.gif")));
		label.setBounds(-112, 0, 952, 477);
		contentPane.add(label);
	
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
