package swimPrueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Registro extends JFrame {

	private JPanel contentPane;
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
					Registro frame = new Registro();
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
	public Registro() {
		setTitle("Registro");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 225, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 35, 100, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(30, 75, 100, 14);
		contentPane.add(lblApellido);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(30, 115, 100, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(30, 155, 100, 14);
		contentPane.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(110, 35, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPorFavorcompleteTodos = new JLabel("Por favor,complete todos los campos");
		lblPorFavorcompleteTodos.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		lblPorFavorcompleteTodos.setVisible(false);
		lblPorFavorcompleteTodos.setForeground(Color.RED);
		lblPorFavorcompleteTodos.setBounds(10, 180, 340, 38);
		contentPane.add(lblPorFavorcompleteTodos);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_1.getText().isEmpty() || textField_2.getText().isEmpty()
						|| textField_3.getText().isEmpty() || textField.getText().isEmpty()) {
					lblPorFavorcompleteTodos.setVisible(true);

				}
				else {
					Llamada.user=new Usuario(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText());
				dispose();
			}}
		});
		btnAceptar.setBounds(110, 215, 89, 23);
		contentPane.add(btnAceptar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 75, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 115, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 155, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		

	}
}
