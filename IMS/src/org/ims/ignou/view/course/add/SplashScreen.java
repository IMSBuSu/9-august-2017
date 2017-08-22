package org.ims.ignou.view.course.add;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class SplashScreen extends JWindow {

	public SplashScreen() {
		setBounds(100, 100, 244, 190);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SplashScreen.class.getResource("/org/ims/ignou/view/course/add/Processing.gif")));
		lblNewLabel.setEnabled(true);
		lblNewLabel.setBounds(0, 0, 241, 190);
		getContentPane().add(lblNewLabel);
		
	}

}
