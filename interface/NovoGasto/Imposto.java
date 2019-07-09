package NovoGasto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Imposto {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imposto window = new Imposto();
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
	public Imposto() {
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
		
		JLabel lblNewLabel = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(22, 55, 148, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Imposto");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(181, 11, 148, 38);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(22, 151, 386, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("OK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(319, 213, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoGasto info = new TipoGasto(); 
				TipoGasto.main(null);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltar.setBounds(220, 213, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnNewButton = new JButton("IPVA");
		btnNewButton.setBounds(75, 96, 107, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Licenciamento");
		btnNewButton_2.setBounds(238, 96, 119, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
