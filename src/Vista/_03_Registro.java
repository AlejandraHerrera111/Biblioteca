package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;

public class _03_Registro extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel tableModel;
	private JButton btnPrestar;
	String[] datosFila;
	String columna1;
	String columna2;
	String columna3;
	String fechaFormateada;

	public _03_Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(580, 580, 780, 512);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(299, 166, 348, 217);
		contentPane.add(scrollPane);

		// Configuración de la tabla para mostrar los resultados
		table = new JTable();
		table.setEnabled(true);
		tableModel = new DefaultTableModel();
		tableModel.addColumn("TITULO");
		tableModel.addColumn("AUTOR");
		tableModel.addColumn("ISBN");
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (filaSeleccionada()) {
					btnPrestar.setEnabled(true);
				}

			}
		});

		table.setModel(tableModel);
		actualizar("C:/Users/U-tad/Desktop/2 DAMP/PROG/Actividad1AAD/src/Libros.txt");
		scrollPane.setViewportView(table);

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
				setVisible(false);
				setVisible(true);
			}
		});

		btnLibrosDisponibles.setBackground(new Color(0x0A2647));
		btnLibrosDisponibles.setForeground(new Color(0xFFE1E1));
		btnLibrosDisponibles.setMargin(new Insets(5, 1, 5, 1));
		btnLibrosDisponibles.setBounds(10, 298, 139, 35);
		panelOpciones.add(btnLibrosDisponibles);

		// PANEL TITULO
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBounds(0, 0, 766, 113);
		contentPane.add(panelTitulo);
		panelTitulo.setLayout(null);
		panelTitulo.setBackground(new Color(0x0A2647));

		// Declaramos la etiqueta
		JLabel lblTitulo = new JLabel("LIBROS DISPONIBLES");
		lblTitulo.setForeground(new Color(0xFFE1E1)); // Define el color de la etiqueta como rojo
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 35));
		lblTitulo.setBounds(280, 41, 405, 27);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panelTitulo.add(lblTitulo);

		// Creamos el boton prestar
		btnPrestar = new JButton("PRESTAR");
		btnPrestar.setEnabled(false);
		btnPrestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardaFechaPulsado();

				System.out.println(columna1);
				System.out.println(columna2);
				System.out.println(columna3);
				Modelo modelo = new Modelo();
				System.out.println("Llama a prestaLibros");
				// Llamamos al metodo prestaLibrosFichero de la clase modelo, le pasamos las
				// rutas como parametros y los valores de la fila seleccionada
				modelo.prestaLibrosFichero("C:/Users/U-tad/Desktop/2 DAMP/PROG/Actividad1AAD/src/Libros.txt",
						"C:/Users/U-tad/Desktop/2 DAMP/PROG/Actividad1AAD/src/Prestamos.txt", columna1, columna2,
						columna3);
				// Llamamos al metodo borrar campos
				borrarCampos();
			}
		});
		btnPrestar.setBackground(new Color(0x75C2F6));
		btnPrestar.setBounds(434, 414, 100, 21);
		contentPane.add(btnPrestar);
	}

	public void actualizar(String filePath) {
		try {
			FileReader fr = new FileReader(filePath); // Abre el archivo para lectura
			int texto;
			StringBuilder fila = new StringBuilder(); // Utiliza un StringBuilder para construir cada fila

			while ((texto = fr.read()) != -1) {
				char letra = (char) texto; // Convierte el número de caracteres a un carácter

				if (letra == '\n') { // Si se encuentra un carácter de nueva línea (fin de fila)
					// Divide la fila en valores utilizando la coma como separador (suponiendo que
					// el archivo usa comas)
					String[] rowData = fila.toString().split(",");

					// Agrega la fila a la tabla en la interfaz gráfica utilizando el tableModel
					tableModel.addRow(rowData);

					// Limpia el StringBuilder para la próxima fila
					fila.setLength(0);
				} else {
					fila.append(letra); // Agrega cada carácter a la fila actual
				}
			}
		} catch (IOException e) {
			e.printStackTrace(); // En caso de error, imprime la traza de excepción
		}
	}

	public boolean filaSeleccionada() {
		// fila seleccionada
		int fila = table.getSelectedRow();
		System.out.println(fila);
		/*
		 * Si la fila esta selecionada permite clickar el boton, sino no lo pone
		 * disponible
		 */
		if (fila != -1) {
			btnPrestar.setEnabled(true);

			// Capturar los datos de la fila
			columna1 = (String) table.getValueAt(fila, 0); // Reemplaza 0 con el índice de la primera columna
			columna2 = (String) table.getValueAt(fila, 1); // Reemplaza 1 con el índice de la segunda columna
			columna3 = (String) table.getValueAt(fila, 2); // Reemplaza 2 con el índice de la tercera columna

			return true;
		} else {
			btnPrestar.setEnabled(false);

			System.out.println("en metodo fila seleccionada:" + btnPrestar);
			return false; // Devuelve false si no hay una fila seleccionada
		}
	}

	// Metodo para borrar campos de la tabla de la fila seleccionada
	public void borrarCampos() {
		int fila = table.getSelectedRow();
		if (fila != -1) {
			tableModel.removeRow(fila);
		}
	}

	// Metodo para guardar la fecha en la que es pulsado el boton de prestar
	public String guardaFechaPulsado() {
		Date fechaClikado = new Date();

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		fechaFormateada = formato.format(fechaClikado);
		return fechaFormateada;
	}

}
