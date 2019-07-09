package NovoGasto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TipoGasto {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TipoGasto window = new TipoGasto();
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
	public TipoGasto() {
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
		
		textField = new JTextField();
		textField.setBounds(159, 60, 38, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(217, 60, 38, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(276, 60, 38, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblData = new JLabel("Data :");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblData.setBounds(103, 61, 46, 14);
		frame.getContentPane().add(lblData);
		
		JLabel lblNewLabel = new JLabel("/");
		lblNewLabel.setBounds(207, 63, 13, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setBounds(264, 63, 13, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTipoDeGasto = new JLabel("Tipo de gasto");
		lblTipoDeGasto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTipoDeGasto.setBounds(164, 0, 150, 38);
		frame.getContentPane().add(lblTipoDeGasto);
		
		textField_3 = new JTextField();
		textField_3.setBounds(159, 102, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor :");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor.setBounds(103, 103, 46, 14);
		frame.getContentPane().add(lblValor);
		
		JButton btnNewButton = new JButton("Imposto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imposto info = new Imposto(); 
				Imposto.main(null);
			}
		});
		btnNewButton.setBounds(10, 216, 86, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Manuten\u00E7\u00E3o");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manutencao info = new Manutencao(); 
				Manutencao.main(null);
			}
		});
		btnNewButton_1.setBounds(103, 216, 117, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnAbastecimento = new JButton("Abastecimento");
		btnAbastecimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Abastecimento info = new Abastecimento(); 
				Abastecimento.main(null);
			}
		});
		btnAbastecimento.setBounds(217, 216, 116, 23);
		frame.getContentPane().add(btnAbastecimento);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login info = new Login(); 
				Login.main(null);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVoltar.setBounds(335, 216, 89, 23);
		frame.getContentPane().add(btnVoltar);
	}

}
