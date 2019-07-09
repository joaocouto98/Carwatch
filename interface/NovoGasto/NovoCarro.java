package NovoGasto;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NovoCarro {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovoCarro window = new NovoCarro();
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
	public NovoCarro() {
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
		
		JLabel lblInsiraOsDados = new JLabel("Insira os dados do  seu carro");
		lblInsiraOsDados.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInsiraOsDados.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsiraOsDados.setBounds(82, 0, 280, 25);
		frame.getContentPane().add(lblInsiraOsDados);
		
		JLabel lblMarca = new JLabel("Marca :");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMarca.setBounds(10, 39, 46, 14);
		frame.getContentPane().add(lblMarca);
		
		textField = new JTextField();
		textField.setBounds(112, 38, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Modelo :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 64, 52, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ano :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 89, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Placa :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 114, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Renavam :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 139, 67, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hodometro :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 164, 79, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cor :\r\n\r\n\t");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 189, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Combustivel :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 214, 91, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblCilindrada = new JLabel("Cilindrada :");
		lblCilindrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCilindrada.setBounds(208, 39, 67, 14);
		frame.getContentPane().add(lblCilindrada);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 63, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 88, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(112, 113, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(112, 138, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(112, 163, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(112, 188, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(111, 213, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(299, 38, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoGasto info = new TipoGasto(); 
				TipoGasto.main(null);
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNext.setBounds(318, 227, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu info = new Menu(); 
				Menu.main(null);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltar.setBounds(230, 227, 89, 23);
		frame.getContentPane().add(btnVoltar);
	}
}
