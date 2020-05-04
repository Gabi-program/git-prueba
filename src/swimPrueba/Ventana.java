package swimPrueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setResizable(false);
		setTitle("Bienvenido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 10));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblBienvenidoAlPrograma = new JLabel("Bienvenido al programa de Java!!");
		lblBienvenidoAlPrograma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblBienvenidoAlPrograma);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(125, 45, 69, 36);
		panel_1.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(125, 92, 69, 31);
		panel_1.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(204, 53, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(204, 97, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
	
		panel_1.add(textField_1);
		
		JButton btnRegistrarte = new JButton("Registrarte");

		btnRegistrarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registro.main(null);
			}
		});
		btnRegistrarte.setBounds(67, 154, 109, 23);
		panel_1.add(btnRegistrarte);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario o contrase\u00F1a incorrecto");
		lblNombreDeUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNombreDeUsuario.setForeground(Color.RED);
		lblNombreDeUsuario.setVisible(false);
		lblNombreDeUsuario.setBounds(10, 130, 359, 14);
		panel_1.add(lblNombreDeUsuario);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if ((textField.getText().isEmpty()==false) && (textField_1.getText().isEmpty()==false)) {	
				if(Llamada.user.validarUsuario(textField.getText(),textField_1.getText())
						) {
					dispose();
					Bienvenida.main(null);
				}else {
					lblNombreDeUsuario.setVisible(true);
				}
			}
			else {
				lblNombreDeUsuario.setVisible(true);
				System.out.println("Hola");
			}
			}
		});
		btnNewButton.setBounds(181, 154, 109, 23);
		panel_1.add(btnNewButton);
		
		
	}
}
