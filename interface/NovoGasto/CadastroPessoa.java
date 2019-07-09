package NovoGasto;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroPessoa {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPessoa window = new CadastroPessoa();
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
	public CadastroPessoa() {
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
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setBounds(33, 69, 55, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(131, 66, 173, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setBounds(33, 138, 55, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 135, 173, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cadastro");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(161, 11, 114, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login info = new Login(); 
				Login.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(335, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
