package Vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.nio.file.spi.FileSystemProvider;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class _01_Agregar extends JFrame {

	_03_Registro miRegistro = new _03_Registro();
	private JTextField txtLibro;
	private JTextField txtAutor;
	private JTextField txtISBN;
	private JButton btnRegistr;

	public _01_Agregar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(580, 580, 780, 512);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 255, 255));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Declaramos las etiquitas y los campos de texto
		txtLibro = new JTextField();
		txtLibro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				camposRellenos();
			}
		});

		txtLibro.setBounds(461, 207, 126, 19);
		contentPane.add(txtLibro);
		txtLibro.setColumns(10);

		txtAutor = new JTextField();
		txtAutor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				camposRellenos();
			}
		});
		txtAutor.setBounds(461, 271, 126, 19);
		txtAutor.setColumns(10);
		contentPane.add(txtAutor);

		txtISBN = new JTextField();
		txtISBN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				camposRellenos();
			}
		});
		txtISBN.setBounds(461, 331, 126, 19);
		txtISBN.setColumns(10);
		contentPane.add(txtISBN);

		JLabel lblLibro = new JLabel("Libro");
		lblLibro.setBounds(374, 210, 45, 13);
		contentPane.add(lblLibro);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(374, 274, 45, 13);
		contentPane.add(lblAutor);

		JLabel lblISBN = new JLabel("ISBN");
		lblISBN.setBounds(374, 334, 45, 13);
		contentPane.add(lblISBN);

		btnRegistr = new JButton("AÑADIR");
		btnRegistr.setEnabled(false);
		System.out.println("fuera del action antes " + btnRegistr.isEnabled());
		System.out.println("fuera del action despues " + btnRegistr.isEnabled());
		System.out.println("boton desabilitado");
		System.out.println("campos rellenos " + camposRellenos());
		System.out.println("dentro del action " + btnRegistr.isEnabled());
		btnRegistr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (camposRellenos() == true) {
					Modelo modelo = new Modelo();
					// Llamos a el metodo de modelo para agregar libros
					modelo.agregarLibrosAFichero("C:/Users/U-tad/Desktop/2 DAMP/PROG/Actividad1AAD/src/Libros.txt",
							txtAutor.getText(), txtLibro.getText(), txtISBN.getText());

				}
			}
		});
		btnRegistr.setBackground(new Color(0x75C2F6));
		btnRegistr.setForeground(new Color(0, 0, 0));
		btnRegistr.setBounds(439, 401, 85, 21);
		contentPane.add(btnRegistr);

		// PANEL OPCIONES
		JPanel panelOpciones = new JPanel();
		panelOpciones.setForeground(new Color(0, 0, 0));
		panelOpciones.setBackground(new Color(0xFFEEF4));
		panelOpciones.setBounds(0, 0, 170, 533);
		contentPane.add(panelOpciones);
		panelOpciones.setLayout(null);

		// Declaramos los botones y hacemos el cambio de una pantalla a otra
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFocusPainted(false);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_00_Buscar miBuscar = new _00_Buscar();
				setVisible(false);
				miBuscar.setVisible(true);
			}
		});
		btnBuscar.setBackground(new Color(0x0A2647));
		btnBuscar.setForeground(new Color(0xFFE1E1));
		btnBuscar.setBounds(10, 53, 139, 35);
		panelOpciones.add(btnBuscar);

		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.setBackground(new Color(255, 255, 255));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);
				setVisible(true);

			}
		});
		btnAgregar.setBackground(new Color(0x0A2647));
		btnAgregar.setForeground(new Color(0xFFE1E1));
		btnAgregar.setBounds(10, 134, 139, 35);
		panelOpciones.add(btnAgregar);

		JButton btnPrestamos = new JButton("PRESTAMOS");
		btnPrestamos.setBackground(new Color(255, 255, 255));
		btnPrestamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_02_Prestamos miPrestamos = new _02_Prestamos();
				setVisible(false);
				miPrestamos.setVisible(true);
			}
		});
		btnPrestamos.setBackground(new Color(0x0A2647));
		btnPrestamos.setForeground(new Color(0xFFE1E1));
		btnPrestamos.setBounds(10, 213, 139, 35);
		panelOpciones.add(btnPrestamos);

		JButton btnCerrarSesion = new JButton("CERRAR SESIÓN");
		btnCerrarSesion.setBackground(new Color(255, 255, 255));
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnCerrarSesion.setBackground(new Color(0x0A2647));
		btnCerrarSesion.setForeground(new Color(0xFFE1E1));
		btnCerrarSesion.setBounds(10, 379, 139, 35);
		panelOpciones.add(btnCerrarSesion);

		JButton btnLibrosDisponibles = new JButton("LIBROS DISPONIBLES");
		btnLibrosDisponibles.setBackground(new Color(255, 255, 255));
		btnLibrosDisponibles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_03_Registro miRegistro = new _03_Registro();
				setVisible(false);
				miRegistro.setVisible(true);
			}
		});
		btnLibrosDisponibles.setBackground(new Color(0x0A2647));
		btnLibrosDisponibles.setForeground(new Color(0xFFE1E1));
		btnLibrosDisponibles.setMargin(new Insets(5, 1, 5, 1));
		btnLibrosDisponibles.setBounds(10, 298, 139, 35);
		panelOpciones.add(btnLibrosDisponibles);

		// PANEL TITULO
		// Declaramos etiquetas
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBounds(0, 0, 766, 113);
		contentPane.add(panelTitulo);
		panelTitulo.setLayout(null);
		panelTitulo.setBackground(new Color(0x0A2647));

		JLabel lblTitulo = new JLabel("AGREGAR");
		lblTitulo.setForeground(new Color(0xFFE1E1)); // Define el color de la etiqueta como rojo
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 35));
		lblTitulo.setBounds(348, 40, 254, 27);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panelTitulo.add(lblTitulo);
	}

	// Metodos para coger el valor de la textField
	public String getTxTitulo() {
		String libro = txtLibro.getText();
		return libro;
	}

	public String getTxtAutor() {
		String autor = txtAutor.getText();
		return autor;
	}

	public String getTxtISBN() {
		String ISBN = txtISBN.getText();
		return ISBN;

	}

	/*
	 * Creamos un metodo para comprobar que los camposd etexto estan rellenos y asi
	 * habilitar el boton añadir
	 */
	public boolean camposRellenos() {

		if (txtLibro.getText().length() != 0 && txtAutor.getText().length() != 0 && txtISBN.getText().length() != 0) {
			btnRegistr.setEnabled(true);
			return true;
		} else {
			btnRegistr.setEnabled(false);
			return false;
		}
	}

}
