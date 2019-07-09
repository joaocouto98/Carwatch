package NovoGasto;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
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
		
		JLabel lblMonitoreSeuCarro = new JLabel("Monitore seu carro!");
		lblMonitoreSeuCarro.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblMonitoreSeuCarro.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonitoreSeuCarro.setBounds(114, 11, 207, 31);
		frame.getContentPane().add(lblMonitoreSeuCarro);
		
		JButton btnNewButton = new JButton("Novo carro");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NovoCarro info = new NovoCarro(); 
				NovoCarro.main(null);
				
			}
		});
		btnNewButton.setBounds(62, 130, 124, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Carro cadastrado");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoGasto info = new TipoGasto(); 
				TipoGasto.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(234, 130, 141, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
