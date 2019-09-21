package org.iuea.oop.views;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class LoginView extends JFrame{
	//Contructor
		public LoginView(){

			

			//Setting the JFrame
			this.setTitle("Login Page");
			this.setSize(500,300);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.validate();
			this.setVisible(true);

			//Creating a JPanel
			JPanel pan = new JPanel();
			pan.setBackground(Color.GRAY);
			pan.setLayout(null);
			this.getContentPane().add(pan);

			//Creating the title JLabel
				//Setting the Font style
				Font font = new Font("Calibri", Font.BOLD, 32);
			JLabel lblTitle = new JLabel("LOGIN");
			lblTitle.setBounds(190,5,153,100);
			lblTitle.setFont(font);
			lblTitle.setForeground(Color.WHITE);
			pan.add(lblTitle);

			//Adding a userName label
			JLabel lblUsername = new JLabel("Username");
			lblUsername.setForeground(Color.WHITE);
			lblUsername.setBounds(10,80,153,20);
			pan.add(lblUsername);

			//Adding a Password label
			JLabel lblPassword = new JLabel("Username");
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setBounds(10,130,153,20);
			pan.add(lblPassword);

			//Adding a Username fields label
			JTextField textUsername = new JTextField("Username");
			textUsername.setBounds(100,80,153,20);
			pan.add(textUsername);

			//Adding a Password fields label
			JTextField textPassword = new JTextField("Username");
			textPassword.setBounds(100,130,153,20);
			pan.add(textPassword);

			//Adding a Password fields label
			JButton loginBtn = new JButton("Login");
			loginBtn.setBounds(100,170,153,20);
			pan.add(loginBtn);

		}


		

		

}
