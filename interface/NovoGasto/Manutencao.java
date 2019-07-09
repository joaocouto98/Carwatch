package NovoGasto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manutencao {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_8;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_9;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manutencao window = new Manutencao();
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
	public Manutencao() {
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
		
		JLabel label_3 = new JLabel("Placa :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(21, 48, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_5 = new JLabel("Hodometro :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(21, 74, 79, 14);
		frame.getContentPane().add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(123, 73, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(123, 47, 86, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblManuteno = new JLabel("Manuten\u00E7\u00E3o");
		lblManuteno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblManuteno.setBounds(158, 11, 124, 25);
		frame.getContentPane().add(lblManuteno);
		
		JLabel label_6 = new JLabel("Data :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(231, 46, 46, 14);
		frame.getContentPane().add(label_6);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(270, 45, 38, 20);
		frame.getContentPane().add(textField);
		
		JLabel label_7 = new JLabel("/");
		label_7.setBounds(318, 48, 20, 14);
		frame.getContentPane().add(label_7);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(328, 45, 38, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel label_8 = new JLabel("/");
		label_8.setBounds(376, 48, 13, 14);
		frame.getContentPane().add(label_8);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(386, 45, 38, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel lblPrximaManuteno = new JLabel("Pr\u00F3xima manuten\u00E7\u00E3o :");
		lblPrximaManuteno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrximaManuteno.setBounds(21, 99, 154, 20);
		frame.getContentPane().add(lblPrximaManuteno);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(270, 99, 38, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel label_4 = new JLabel("/");
		label_4.setBounds(318, 102, 13, 14);
		frame.getContentPane().add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(328, 99, 38, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel label_9 = new JLabel("/");
		label_9.setBounds(376, 102, 13, 14);
		frame.getContentPane().add(label_9);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(386, 99, 38, 20);
		frame.getContentPane().add(textField_9);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o :");
		lblDescrio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescrio.setBounds(21, 144, 79, 14);
		frame.getContentPane().add(lblDescrio);
		
		textField_6 = new JTextField();
		textField_6.setBounds(14, 169, 410, 51);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 131, 403, 2);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoGasto info = new TipoGasto(); 
				TipoGasto.main(null);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltar.setBounds(242, 227, 89, 23);
		frame.getContentPane().add(btnVoltar);
	}

}
