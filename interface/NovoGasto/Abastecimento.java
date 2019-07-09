package NovoGasto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Abastecimento {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Abastecimento window = new Abastecimento();
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
	public Abastecimento() {
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
		
		JLabel lblNewLabel = new JLabel("Abastecimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(141, 11, 155, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxTanqueCheio = new JCheckBox("Tanque cheio.");
		chckbxTanqueCheio.setBounds(25, 181, 137, 23);
		frame.getContentPane().add(chckbxTanqueCheio);
		
		JLabel lblQualCombustivelUsado = new JLabel("Qual combustivel usado?");
		lblQualCombustivelUsado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQualCombustivelUsado.setBounds(10, 57, 152, 25);
		frame.getContentPane().add(lblQualCombustivelUsado);
		
		textField = new JTextField();
		textField.setBounds(205, 61, 118, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblHodometro = new JLabel("Hod\u00F4metro :");
		lblHodometro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHodometro.setBounds(10, 93, 95, 25);
		frame.getContentPane().add(lblHodometro);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 97, 118, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("Data :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 130, 46, 14);
		frame.getContentPane().add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(66, 129, 38, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel label_1 = new JLabel("/");
		label_1.setBounds(114, 132, 13, 14);
		frame.getContentPane().add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 129, 38, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel label_2 = new JLabel("/");
		label_2.setBounds(171, 132, 13, 14);
		frame.getContentPane().add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(183, 129, 38, 20);
		frame.getContentPane().add(textField_4);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoGasto info = new TipoGasto(); 
				TipoGasto.main(null);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOk.setBounds(316, 215, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoGasto info = new TipoGasto(); 
				TipoGasto.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(221, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
