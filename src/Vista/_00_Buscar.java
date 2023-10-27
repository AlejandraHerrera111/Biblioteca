package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class _00_Buscar extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtBuscar;
	private DefaultTableModel tableModel;

	public _00_Buscar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(580, 580, 780, 512);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Campos de textos para ingresar el texto de búsqueda
		txtBuscar = new JTextField();
		txtBuscar.setBounds(302, 153, 223, 19);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);

		// Botón de búsqueda
		JButton btnLupa = new JButton("Buscar");
		btnLupa.setBackground(new Color(0x75C2F6));
		btnLupa.setForeground(new Color(0x243D25));
		btnLupa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modelo modelo = new Modelo();
				// Llama al método buscarMostrarLibros para buscar y mostrar libros
				buscarMostrarLibros("C:/Users/U-tad/Desktop/2 DAMP/PROG/Actividad1AAD/src/Libros.txt", getTxtBuscar());
				buscarMostrarLibros("C:/Users/U-tad/Desktop/2 DAMP/PROG/Actividad1AAD/src/Prestamos.txt",
						getTxtBuscar());
			}
		});
		btnLupa.setBounds(556, 152, 76, 21);
		contentPane.add(btnLupa);

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
				setVisible(false);
				setVisible(true);
			}
		});
		btnBuscar.setBackground(new Color(0x0A2647));
		btnBuscar.setForeground(new Color(0xFFE1E1));
		btnBuscar.setBounds(10, 53, 139, 35);
		panelOpciones.add(btnBuscar);

		JButton btnAgregar = new JButton("AGREGAR");

		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_01_Agregar miAgregar = new _01_Agregar();
				setVisible(false);
				miAgregar.setVisible(true);

			}
		});

		btnAgregar.setBackground(new Color(0x0A2647));
		btnAgregar.setForeground(new Color(0xFFE1E1));
		btnAgregar.setBounds(10, 134, 139, 35);
		panelOpciones.add(btnAgregar);

		JButton btnPrestamos = new JButton("PRESTAMOS");
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

		// Añadimos un scrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(302, 194, 330, 220);
		contentPane.add(scrollPane);

		// Configuración de la tabla para mostrar los resultados
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setEnabled(true);
		tableModel = new DefaultTableModel();
		tableModel.addColumn("TITULO");
		tableModel.addColumn("AUTOR");
		tableModel.addColumn("ISBN");
		table.setModel(tableModel);
		scrollPane.setViewportView(table);

		// PANEL TITULO
		// Creacion de etiquetas
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBounds(0, 0, 766, 113);
		contentPane.add(panelTitulo);
		panelTitulo.setLayout(null);
		panelTitulo.setBackground(new Color(0x0A2647));

		JLabel lblTitulo = new JLabel("BUSCAR");
		lblTitulo.setForeground(new Color(0xFFE1E1)); // Define el color de la etiqueta como rojo
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 35));
		lblTitulo.setBounds(354, 43, 254, 27);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panelTitulo.add(lblTitulo);

	}

	public String getTxtBuscar() {

		String campoTexto = txtBuscar.getText();
		return campoTexto;

	}

	public void buscarMostrarLibros(String cualquierRuta, String campoTexto) {
		// Imprime un mensaje en la consola para indicar el inicio de la función
		System.out.println("entra en buscar libros");
		try {
			// Abre un archivo en modo lectura usando FileReader
			FileReader fr = new FileReader(cualquierRuta);

			// Crea un objeto BufferedReader para leer líneas del archivo de manera
			// eficiente
			BufferedReader br = new BufferedReader(fr);

			// Obtiene el texto a buscar del campo de texto proporcionado
			String textoABuscar = campoTexto;

			String buscar; // Almacena cada línea leída del archivo

			while ((buscar = br.readLine()) != null) {
				// Imprime un mensaje para indicar que ha ingresado al bucle "while" de lectura
				// del archivo
				System.out.println("entra en while de buscar libros");

				// Comprueba si la línea leída contiene el texto de búsqueda
				if (buscar.contains(textoABuscar)) {
					// Imprime un mensaje para indicar que ha ingresado al bucle "if" de
					// coincidencia
					System.out.println("entra en if de buscar libros");
					System.out.println(buscar); // Imprime la línea que coincide con la búsqueda

					// Divide la línea en valores utilizando la coma como separador y los almacena
					// en un arreglo
					String[] lineaValores = buscar.split(",");

					// Agrega los valores como una nueva fila a la tabla en la interfaz gráfica
					tableModel.addRow(lineaValores);

					// Imprime los valores que se han agregado a la tabla
					System.out.println(lineaValores);

					lineaValores = new String[0]; // Reestablece el arreglo de valores
				}
			}
		} catch (Exception e) {
			// Manejo de excepciones (captura cualquier excepción y no realiza ninguna
			// acción)
			// Puedes agregar un manejo de excepciones más específico aquí
		}
	}

}
