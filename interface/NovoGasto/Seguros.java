package NovoGasto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Seguros {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seguros window = new Seguros();
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
	public Seguros() {
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
		
		JButton btnNewButton = new JButton("DPVAT");
		btnNewButton.setBounds(94, 96, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Particular");
		btnNewButton_1.setBounds(250, 96, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Seguros");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(174, 11, 89, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(20, 172, 391, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("OK");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(322, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(41, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Voltar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoGasto info = new TipoGasto(); 
				TipoGasto.main(null);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(222, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}

}
