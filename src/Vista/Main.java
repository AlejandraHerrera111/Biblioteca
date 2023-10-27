package Vista;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// Debes inicializar tus objetos antes de utilizarlos
		_00_Buscar miBuscar = new _00_Buscar();
		_01_Agregar miAgregar = new _01_Agregar();
		_02_Prestamos miPrestamos = new _02_Prestamos();
		_03_Registro miRegistro = new _03_Registro();

		// Hacemos visible el JFrame
		miBuscar.setVisible(true);
	}
}
