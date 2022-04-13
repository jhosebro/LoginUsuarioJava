package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Frame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Rectangle;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.event.KeyEvent;
import java.awt.Cursor;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class Interfaz extends JFrame {

	private JButton botonSalir;
	private JPanel contentPane;
	private JLabel User;
	private JLabel Usuario;
	private JLabel Usuario_1;
	private JTextField DigiteContrasena;
	private JPasswordField DigiteUsuario;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/imagenes/81317_man_512x512.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton IniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		IniciarSesion.setForeground(Color.BLACK);
		IniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 14));
		IniciarSesion.setFocusable(false);
		IniciarSesion.setBorder(new LineBorder(SystemColor.controlShadow, 4, true));
		IniciarSesion.setBackground(SystemColor.menu);
		IniciarSesion.setBounds(619, 381, 136, 33);
		contentPane.add(IniciarSesion);
		
		DigiteUsuario = new JPasswordField();
		DigiteUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		DigiteUsuario.setBackground(SystemColor.control);
		DigiteUsuario.setBounds(566, 322, 239, 33);
		contentPane.add(DigiteUsuario);
		
		DigiteContrasena = new JTextField();
		DigiteContrasena.setFont(new Font("Tahoma", Font.BOLD, 14));
		DigiteContrasena.setBackground(SystemColor.control);
		DigiteContrasena.setBounds(566, 251, 239, 33);
		contentPane.add(DigiteContrasena);
		DigiteContrasena.setColumns(10);
		
		Usuario_1 = new JLabel("Contrase\u00F1a:");
		Usuario_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Usuario_1.setBounds(450, 301, 220, 69);
		contentPane.add(Usuario_1);
		
		Usuario = new JLabel("Usuario: ");
		Usuario.setFont(new Font("Tahoma", Font.BOLD, 18));
		Usuario.setBounds(450, 238, 90, 52);
		contentPane.add(Usuario);
		
		User = new JLabel("");
		User.setRequestFocusEnabled(false);
		User.setHorizontalAlignment(SwingConstants.TRAILING);
		User.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/81317_man_512x512.png")));
		User.setBounds(40, 58, 437, 501);
		contentPane.add(User);
		botonSalir.setBorder(new LineBorder(SystemColor.controlShadow, 4, true));
		botonSalir.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		botonSalir.setFocusable(false);
		botonSalir.setBackground(SystemColor.control);
		botonSalir.setForeground(new Color(0, 0, 0));
		botonSalir.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonSalir.setBounds(816, 21, 90, 33);
		contentPane.add(botonSalir);
		
		JLabel jLabelFondo = new JLabel("");
		jLabelFondo.setBackground(SystemColor.controlHighlight);
		jLabelFondo.setDisplayedMnemonic(KeyEvent.VK_CONTEXT_MENU);
		jLabelFondo.setBorder(new EmptyBorder(0, 0, 0, 0));
		jLabelFondo.setBounds(0, 0, 927, 645);
		jLabelFondo.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/4497961-white-backgrounds.jpg")));
		contentPane.add(jLabelFondo);
		this.setLocationRelativeTo(null);
	}
}
