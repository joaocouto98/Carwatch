package NovoGasto;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Login {

	private JFrame frame;
	private JPasswordField txtPassword;
	private JTextField txtUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(183, 5, 78, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnTipoGasto = new JButton("OK");
		btnTipoGasto.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTipoGasto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if (password.contains("123") && username.contains("joao")) {
					txtPassword.setText(null);
					txtUsername.setText(null);
					Menu info = new Menu(); 
					Menu.main(null);
					Login.dispose();
			}
				else {
					JOptionPane.showMessageDialog(null,"Os dados são invalidos","Login ERRO",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
					
				}
			}
		});
		btnTipoGasto.setBounds(305, 227, 107, 23);
		frame.getContentPane().add(btnTipoGasto);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 206, 391, 2);
		frame.getContentPane().add(separator);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(194, 138, 109, 20);
		frame.getContentPane().add(txtPassword);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(69, 139, 71, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(69, 80, 71, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(194, 77, 109, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(21, 48, 391, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Cadastre-se");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPessoa info = new CadastroPessoa(); 
				CadastroPessoa.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(190, 227, 105, 23);
		frame.getContentPane().add(btnNewButton);
	}

	protected static void dispose() {
		// TODO Auto-generated method stub
		
	}
}
