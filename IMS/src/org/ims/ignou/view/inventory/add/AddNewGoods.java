package org.ims.ignou.view.inventory.add;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.spi.DateFormatProvider;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.dto.inventory.add.GoodsAddDto;
import org.ims.ignou.helper.inventory.add.FeelGoodsDetailfrmForm;
import org.ims.ignou.helper.inventory.add.GoodsAddValidation;
import org.ims.ignou.helper.inventory.add.InsertGoodsDetailHelper;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddNewGoods extends JFrame {

	private JPanel contentPane;
	private JTextField textGoodsName;
	private JTextField textWarntyDurtin;
	private JTextField textTinNo;
	private JTextField textShopName;
	private JTextField textFieldWarantyType;
	private JTextField textQuantity;
	private JLabel lblGoodsDEscription;
	private JTextArea textDescription;
	
	
private JDateChooser dateChooser;

public JTextArea getTextDescription() {
	return textDescription;
}	
	public JTextField getTextGoodsName() {
	return textGoodsName;
}
public JTextField getTextWarntyDurtin() {
	return textWarntyDurtin;
}
public JTextField getTextTinNo() {
	return textTinNo;
}
public JTextField getTextShopName() {
	return textShopName;
}
public JTextField getTextFieldWarantyType() {
	return textFieldWarantyType;
}
public JTextField getTextQuantity() {
	return textQuantity;
}
public JDateChooser getDateChooser() {
	return dateChooser;
}

GoodsAddValidation addValidation=new GoodsAddValidation();
	

	public void validation(){
					
				if(addValidation.checkValue(this)){
					
							FeelGoodsDetailfrmForm feelGoodsDetail=new FeelGoodsDetailfrmForm();
							GoodsAddDto goodsDetail=feelGoodsDetail.setDetail(this);
							InsertGoodsDetailHelper insert=new InsertGoodsDetailHelper();
							Boolean isDetailInserted=insert.insertDetail(goodsDetail);
							if(isDetailInserted){
								this.setVisible(false);
								JOptionPane.showMessageDialog(this, "Record Added SuccessFully , Your Goods Id :-"+insert.getGoods_Id());
							}else{
								this.setVisible(false);
								JOptionPane.showMessageDialog(this, "Failed to Add Detail !");
							}
							
							
				}
	
		
		
	}
	public AddNewGoods() {
		setBackground(Color.ORANGE);
		setResizable(false);
		setTitle("Add New Goods");
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
		
		
		setBounds(100, 100, 450, 368);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGoodsName = new JLabel("Goods Name");
		lblGoodsName.setBounds(34, 41, 61, 14);
		contentPane.add(lblGoodsName);
		
		textGoodsName = new JTextField();
		textGoodsName.setBounds(141, 35, 264, 20);
		contentPane.add(textGoodsName);
		textGoodsName.setColumns(10);
		
		JLabel lblWarrantyDurationin = new JLabel("Warranty Duration\r\n (In Months)");
		lblWarrantyDurationin.setBounds(34, 66, 157, 14);
		contentPane.add(lblWarrantyDurationin);
		
		textWarntyDurtin = new JTextField();
		textWarntyDurtin.setColumns(10);
		textWarntyDurtin.setBounds(204, 63, 201, 20);
		contentPane.add(textWarntyDurtin);
		
		JLabel lblTinNo = new JLabel("TIN no.");
		lblTinNo.setBounds(34, 97, 61, 14);
		contentPane.add(lblTinNo);
		
		textTinNo = new JTextField();
		textTinNo.setColumns(10);
		textTinNo.setBounds(141, 91, 264, 20);
		contentPane.add(textTinNo);
		
		JLabel labelGoodsId = new JLabel("Shop Name");
		labelGoodsId.setBounds(34, 125, 61, 14);
		contentPane.add(labelGoodsId);
		
		textShopName = new JTextField();
		textShopName.setColumns(10);
		textShopName.setBounds(141, 119, 264, 20);
		contentPane.add(textShopName);
		
		JLabel lblWarrantyType = new JLabel("Warranty Name");
		lblWarrantyType.setBounds(34, 153, 97, 14);
		contentPane.add(lblWarrantyType);
		
		textFieldWarantyType = new JTextField();
		textFieldWarantyType.setColumns(10);
		textFieldWarantyType.setBounds(141, 147, 264, 20);
		contentPane.add(textFieldWarantyType);
		
		JLabel labelQuantity = new JLabel("Quantity");
		labelQuantity.setBounds(34, 181, 61, 14);
		contentPane.add(labelQuantity);
		
		textQuantity = new JTextField();
		textQuantity.setColumns(10);
		textQuantity.setBounds(141, 175, 264, 20);
		contentPane.add(textQuantity);
		
		lblGoodsDEscription = new JLabel("Description");
		lblGoodsDEscription.setBounds(34, 206, 83, 14);
		contentPane.add(lblGoodsDEscription);
		
		 textDescription = new JTextArea();
		textDescription.setBounds(141, 201, 264, 54);
		contentPane.add(textDescription);
		
		JLabel lblPurchasingDate = new JLabel("Purchasing Date");
		lblPurchasingDate.setBounds(34, 274, 97, 14);
		contentPane.add(lblPurchasingDate);
		
		
		 dateChooser=new JDateChooser();
		dateChooser.setDateFormatString("d/MMM/yyyy");
		dateChooser.setToolTipText("Choose Date");
		dateChooser.setBounds(141, 266, 134, 27);
		contentPane.add(dateChooser);
		
		
	
		
		JButton btnNewButton = new JButton("Add Goods ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				validation();
			}
		});
		btnNewButton.setBounds(212, 305, 89, 23);
		contentPane.add(btnNewButton);
		
	
	}
}
