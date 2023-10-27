package Vista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Modelo {
	_03_Registro _03_Registro = new _03_Registro();

	public void agregarLibrosAFichero(String ruta, String autor, String título, String isbn) {
		System.out.println("entra en agregar fichero"); // Imprime un mensaje para indicar que la función ha comenzado a
														// ejecutarse

		String frase = autor + "," + título + "," + isbn + "\n"; // Construye una cadena de texto con los datos del
																	// libro y un salto de línea

		String array[] = { autor, título, isbn }; // Crea un arreglo de cadenas con los datos del libro

		// Imprime información para depuración
		System.out.println(ruta);
		System.out.println(título);
		System.out.println(autor);
		System.out.println(isbn);

		try {
			System.out.println("INTENTA"); // Imprime un mensaje para indicar que se está intentando realizar la
											// escritura en el archivo
			FileWriter fw = new FileWriter(ruta, true); // Abre el archivo para escritura en modo "append" (agregar al
														// final del archivo)

			for (int i = 0; i < frase.length(); i++) {
				fw.write(frase.charAt(i)); // Escribe cada carácter de la cadena "frase" en el archivo
				System.out.println("dentro del for"); // Imprime un mensaje para cada iteración del bucle "for"
			}

			System.out.println("llega a la línea a actualizar"); // Imprime un mensaje para indicar que se ha llegado a
																	// esta línea
			fw.close(); // Cierra el archivo después de escribir en él

		} catch (Exception e) {
			// Manejo de excepciones (captura cualquier excepción y no realiza ninguna
			// acción específica)
			// Puedes agregar un manejo de excepciones más específico aquí
		}
	}

	public void prestaLibrosFichero(String ruta, String ruta2, String titulo, String autor, String ISBN) {
		try {
			System.out.println("Intentando método prestaLibros"); // Imprime un mensaje para indicar que se está
																	// intentando ejecutar la función

			BufferedReader br = new BufferedReader(new FileReader(ruta)); // Abre el archivo de lectura
			FileWriter fw = new FileWriter(ruta2, true); // Abre el archivo de escritura en modo "append" (agregar al
															// final del archivo)

			String linea = titulo + "," + autor + "," + ISBN; // Crea una cadena que representa la información del libro
																// a prestar
			List<String> lista = new ArrayList<>(); // Crea una lista para almacenar las líneas que no se prestan
			String linea2;
			System.out.println("Linea:" + linea);

			while ((linea2 = br.readLine()) != null) {
				String linea2Formatted = linea2.trim().toLowerCase(); // Convierte la línea leída a minúsculas y elimina
																		// espacios en blanco
				String lineaFormatted = linea.trim().toLowerCase(); // Convierte la línea a prestar a minúsculas y
																	// elimina espacios en blanco
				System.out.println("linea2: " + linea2);
				System.out.println("linea: " + linea);

				if (lineaFormatted.equals(linea2Formatted)) {
					System.out.println("Entró en if"); // Imprime un mensaje para indicar que se ha entrado en el bloque
														// "if"
					fw.write(linea2);
					fw.write(System.lineSeparator()); // Agrega un salto de línea

				} else if (!linea.equals(linea2)) {
					lista.add(linea2); // Agrega la línea actual a la lista de líneas que no se prestan
				}
			}

			FileWriter fwSobreEscribe = new FileWriter(ruta, false); // Abre el archivo original en modo de escritura
																		// para sobrescribirlo

			for (String variable : lista) {
				fwSobreEscribe.write(variable); // Escribe cada línea de la lista en el archivo original
				fwSobreEscribe.write(System.lineSeparator()); // Agrega un salto de línea
			}

			fwSobreEscribe.close(); // Cierra el archivo original después de sobrescribirlo
			fw.close(); // Cierra el archivo de escritura
			br.close(); // Cierra el archivo de lectura

		} catch (IOException e) {
			e.printStackTrace(); // En caso de error, imprime la traza de excepción
		}
	}

	public void devuelveLibrosFicheros(String ruta, String ruta2, String titulo2, String autor2, String ISBN2) {
		try {
			System.out.println("Intentando método prestaLibros"); // Imprime un mensaje para indicar que se está
																	// intentando ejecutar la función

			BufferedReader br = new BufferedReader(new FileReader(ruta2)); // Abre el archivo de registro de préstamos
																			// para lectura
			FileWriter fw = new FileWriter(ruta, true); // Abre el archivo original para escritura en modo "append"
														// (agregar al final del archivo)

			String linea = titulo2 + "," + autor2 + "," + ISBN2; // Crea una cadena que representa la información del
																	// libro a devolver
			List<String> lista = new ArrayList<>(); // Crea una lista para almacenar las líneas que no se devuelven
			String linea2;
			System.out.println("Linea:" + linea);

			while ((linea2 = br.readLine()) != null) {
				String linea2Formatted = linea2.trim().toLowerCase(); // Convierte la línea leída a minúsculas y elimina
																		// espacios en blanco
				String lineaFormatted = linea.trim().toLowerCase(); // Convierte la línea a devolver a minúsculas y
																	// elimina espacios en blanco

				System.out.println("Linea2:" + linea2);
				if (lineaFormatted.equals(linea2Formatted)) {
					System.out.println("Entró en if"); // Imprime un mensaje para indicar que se ha entrado en el bloque
														// "if"
					fw.write(linea2);
					fw.write(System.lineSeparator()); // Agrega un salto de línea

				} else if (!linea.equals(linea2)) {
					lista.add(linea2); // Agrega la línea actual a la lista de líneas que no se devuelven
				}
			}

			FileWriter fwSobreEscribe = new FileWriter(ruta2, false); // Abre el archivo de registro de préstamos en
																		// modo de escritura para sobrescribirlo

			for (String variable : lista) {
				fwSobreEscribe.write(variable); // Escribe cada línea de la lista en el archivo de registro de préstamos
				fwSobreEscribe.write(System.lineSeparator()); // Agrega un salto de línea
			}

			fwSobreEscribe.close(); // Cierra el archivo de registro de préstamos después de sobrescribirlo
			fw.close(); // Cierra el archivo original
			br.close(); // Cierra el archivo de registro de préstamos

		} catch (Exception e) {
			// Manejo de excepciones (captura cualquier excepción y no realiza ninguna
			// acción específica)
			// Puedes agregar un manejo de excepciones más específico aquí
		}
	}

}
