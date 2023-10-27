# Biblioteca

## [Clase _00_Buscar](#clase-_00_buscar)
## [Clase _01_Agregar](#clase-_01_agregar)




## Clase _00_Buscar

La clase _00_Buscar es una parte fundamental de un proyecto de software o sistema de gestión de bibliotecas. En un archivo README, se puede incluir una sección que describa esta clase en particular, proporcionando información sobre su funcionalidad y cómo se relaciona con el proyecto en su conjunto.

### Descripción

La clase _00_Buscar representa una interfaz de usuario en el proyecto que permite a los usuarios buscar libros en una biblioteca o sistema de gestión de bibliotecas. Ofrece las siguientes características clave:

- Permite a los usuarios ingresar términos de búsqueda en un campo de texto.
- Ofrece un botón de búsqueda que, al hacer clic, inicia la búsqueda de libros.
- Muestra los resultados de la búsqueda en una tabla en la interfaz gráfica.

### Métodos y Funcionalidades

Dentro de esta sección, puedes proporcionar información sobre los métodos y funcionalidades clave de la clase _00_Buscar. Esto podría incluir:

- `getTxtBuscar()`: Un método que recopila el texto ingresado por el usuario en el campo de búsqueda.
- `buscarMostrarLibros()`: Un método que realiza la búsqueda de libros en archivos de texto y muestra los resultados en la tabla.

### Uso

En esta sección del README, puedes explicar cómo los usuarios pueden interactuar con esta clase y cómo pueden utilizarla para buscar libros en el sistema. Puedes proporcionar ejemplos de código, comandos de terminal o casos de uso.

### Contribución

Si tu proyecto es de código abierto y acepta contribuciones, puedes incluir información sobre cómo otros desarrolladores pueden contribuir a la clase _00_Buscar. Esto podría incluir pautas para enviar cambios y el proceso de revisión.

#### Ejemplo de Uso

```java
// Crear una instancia de la clase _02_Prestamos
_02_Prestamos prestamos = new _02_Prestamos();

// Actualizar la lista de préstamos y mostrar la fecha de préstamo
prestamos.actualizarPrestamos("prestamos.txt", "2023-10-25");

// Verificar si una fila está seleccionada y habilitar la devolución
if (prestamos.filaSeleccionada()) {
    // Realizar la devolución de libros
    prestamos.borrarCampos();
}
```


## Clase _01_Agregar

La clase _01_Agregar es parte del proyecto y representa una interfaz de usuario que permite agregar libros a un sistema de gestión de bibliotecas. A continuación, se describen las características clave y funcionalidades de esta clase.

## Descripción

La clase _01_Agregar se utiliza para ingresar información sobre un libro, como título, autor e ISBN, en un sistema de gestión de bibliotecas. Ofrece las siguientes características:

- Campos de texto para ingresar el título del libro, el autor y el ISBN.
- Verificación en tiempo real para habilitar un botón de "AÑADIR" cuando los campos están rellenados.
- Botón "AÑADIR" que permite agregar libros a la biblioteca.

 Métodos y Funcionalidades

Dentro de esta sección, se destacan los métodos y funcionalidades clave de la clase _01_Agregar. Esto incluye:

- `getTxTitulo()`: Un método que recopila el título del libro ingresado en el campo de texto.
- `getTxtAutor()`: Un método que recopila el autor del libro ingresado en el campo de texto.
- `getTxtISBN()`: Un método que recopila el ISBN del libro ingresado en el campo de texto.
- `camposRellenos()`: Un método que verifica si los campos de texto están rellenados y habilita el botón "AÑADIR" en consecuencia.

## Uso

En esta sección del README, se puede explicar cómo los usuarios pueden utilizar la clase _01_Agregar para agregar libros al sistema. Puedes proporcionar ejemplos de cómo interactuar con la interfaz de usuario y cómo se activa el botón "AÑADIR" cuando los campos están completos.

## Contribución

Si el proyecto es de código abierto y acepta contribuciones, puedes incluir información sobre cómo otros desarrolladores pueden contribuir a la clase _01_Agregar. Esto podría incluir pautas para enviar cambios y el proceso de revisión.

## Ejemplo de Uso

Para agregar un nuevo libro a la biblioteca, sigue estos pasos:

1. Abre la aplicación y selecciona la opción "AGREGAR" en el menú principal.

2. Completa la información del libro en los campos de texto:
   - Título del libro en el campo "Libro".
   - Nombre del autor en el campo "Autor".
   - Número de ISBN en el campo "ISBN".

3. A medida que ingreses información en los campos de texto, el botón "AÑADIR" se habilitará automáticamente si todos los campos están completos.

4. Haz clic en el botón "AÑADIR" para agregar el libro al sistema.

5. El libro se guardará en la base de datos y estará disponible para su consulta.

¡Listo! Has agregado un nuevo libro a la biblioteca utilizando la clase _01_Agregar.

Nota: Asegúrate de que todos los campos estén rellenados antes de hacer clic en "AÑADIR" para evitar errores.


## Clase _02_Prestamos

La clase `_02_Prestamos` forma parte de la aplicación de gestión de bibliotecas y se encarga de la gestión de préstamos de libros. A continuación, se describen sus características y funcionalidades clave.

## Descripción

La clase `_02_Prestamos` permite a los usuarios realizar las siguientes acciones:

- Ver una lista de los libros prestados.
- Marcar libros como devueltos.
- Interactuar con la base de datos de préstamos.

## Métodos y Funcionalidades

Dentro de esta sección, se destacan los métodos y funcionalidades clave de la clase `_02_Prestamos`. Esto incluye:

- `actualizarPrestamos(String filePath, String fechaFormateada)`: Un método que actualiza la lista de préstamos en la interfaz gráfica y muestra la fecha de préstamo.
- `filaSeleccionada()`: Un método que verifica si se ha seleccionado una fila en la tabla y habilita o deshabilita el botón de devolución.
- `borrarCampos()`: Un método para eliminar filas seleccionadas en la tabla.

## Uso

En esta sección del documento, se puede explicar cómo los usuarios pueden utilizar la clase `_02_Prestamos` para gestionar los préstamos de libros. Puedes proporcionar ejemplos de interacción con la interfaz de usuario y cómo se devuelven los libros.

## Ejemplo de Uso

```java
// Crear una instancia de la clase _02_Prestamos
_02_Prestamos prestamos = new _02_Prestamos();

// Actualizar la lista de préstamos y mostrar la fecha de préstamo
prestamos.actualizarPrestamos("prestamos.txt", "2023-10-25");

// Verificar si una fila está seleccionada y habilitar la devolución
if (prestamos.filaSeleccionada()) {
    // Realizar la devolución de libros
    prestamos.borrarCampos();
}
```

## Clase _03_Registro

La clase `_03_Registro` representa una interfaz gráfica para mostrar libros disponibles y realizar préstamos. A continuación, se detalla su estructura y funcionalidades.

## Descripción
La clase _03_Registro representa la interfaz gráfica de una aplicación de gestión de libros. Permite a los usuarios ver libros disponibles, realizar préstamos y gestionar la información de los libros. Aquí hay una descripción de sus principales características:

- **Interfaz Gráfica:** La clase crea una ventana de interfaz de usuario que muestra una tabla con libros disponibles. Los usuarios pueden interactuar con la tabla para seleccionar libros y realizar préstamos.

- **Panel de Opciones:** La interfaz incluye un panel de opciones con botones que permiten a los usuarios acceder a diferentes funcionalidades de la aplicación, como búsqueda de libros, agregar nuevos libros, gestionar préstamos, ver libros disponibles y cerrar sesión.

- **Botón de Préstamo:** El botón "PRESTAR" está inicialmente deshabilitado y se activa cuando se selecciona una fila en la tabla. Al hacer clic en este botón, se realiza un préstamo de un libro, se registra la fecha del préstamo y se elimina la fila correspondiente de la tabla.

- **Actualización de la Tabla:** La tabla se actualiza con datos de libros disponibles desde un archivo. Los libros se muestran en filas con información como el título, autor y ISBN.

## Ejemplos de Uso

### 1. Visualizar Libros Disponibles
Cuando se inicia la aplicación, la clase _03_Registro muestra una tabla con libros disponibles. Los usuarios pueden desplazarse por la tabla y ver información detallada de cada libro.

### 2. Realizar un Préstamo
- Paso 1: El usuario selecciona un libro haciendo clic en la fila correspondiente de la tabla.
- Paso 2: El botón "PRESTAR" se habilita cuando se selecciona un libro.
- Paso 3: El usuario hace clic en "PRESTAR" para realizar el préstamo.
- Paso 4: La fecha del préstamo se registra y se elimina la fila del libro prestado de la tabla.

### 3. Navegación entre Funcionalidades
Los botones en el panel de opciones permiten a los usuarios acceder a diferentes partes de la aplicación:
- "BUSCAR" abre la funcionalidad de búsqueda de libros.
- "AGREGAR" permite agregar nuevos libros a la base de datos.
- "PRESTAMOS" permite gestionar los préstamos activos.
- "LIBROS DISPONIBLES" recarga la lista de libros disponibles.
- "CERRAR SESIÓN" cierra la aplicación.

### 4. Actualización de la Tabla
La tabla se actualiza automáticamente con datos de libros disponibles desde un archivo. Cuando se agrega un nuevo libro o se realiza un préstamo, la tabla se actualiza para reflejar los cambios.

Estos ejemplos de uso ilustran cómo la clase _03_Registro se integra en la aplicación y cómo los usuarios pueden interactuar con ella para gestionar libros y realizar préstamos. La clase brinda una interfaz intuitiva y funcionalidades esenciales para la administración de una biblioteca o sistema de préstamo de libros.

