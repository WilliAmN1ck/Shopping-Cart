import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SignInWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignInWindow frame = new SignInWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignInWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("Username: ");
		lblUserName.setBounds(60, 75, 93, 15);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(60, 140, 82, 15);
		contentPane.add(lblPassword);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(140, 73, 223, 19);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(140, 138, 223, 19);
		contentPane.add(txtPassword);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(324, 233, 114, 25);
		contentPane.add(btnSignIn);
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//if(search data base for username returns something){
				
			//}
//			else{
				
//				set error 'User name does not exit'
//			}
		// if(password.equals(passwordReturend){
//				good	
//			}
//			else {
//				send error 'Password is incorrect'
//			}
			}});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(12, 233, 114, 25);
		contentPane.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login cancelled = new Login();
				cancelled.setVisible(true);
				dispose();
			}
		});
		
		
	}
}