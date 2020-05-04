package swimPrueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

public class Bienvenida extends JFrame {

	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480,130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenido ");
		lblBienvenido.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblBienvenido.setForeground(Color.CYAN);
		lblBienvenido.setBounds(10, 22, 190, 44);
		contentPane.add(lblBienvenido);
		
		JLabel lblUsuario = new JLabel(Llamada.user.getNombre());
		lblUsuario.setForeground(Color.CYAN);
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblUsuario.setBounds(169, 22, 190, 44);
		contentPane.add(lblUsuario);
		
		JLabel lblApellido = new JLabel(Llamada.user.getApellido());
		lblApellido.setForeground(Color.CYAN);
		lblApellido.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblApellido.setBounds(295, 22, 190, 44);
		contentPane.add(lblApellido);
		}

}


