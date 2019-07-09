package NovoGasto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class CarroCadastrado {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarroCadastrado window = new CarroCadastrado();
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
	public CarroCadastrado() {
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
		
		JButton btnNewButton = new JButton("Adicionar gasto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoGasto info = new TipoGasto(); 
				TipoGasto.main(null);
			}
		});
		btnNewButton.setBounds(74, 189, 121, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Emitir relat\u00F3rio");
		btnNewButton_1.setBounds(234, 189, 121, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 160, 414, 2);
		frame.getContentPane().add(separator);
	}

}
