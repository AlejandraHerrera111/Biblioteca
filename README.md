# Biblioteca

## [Clase _00_Buscar](#clase-_00_buscar)


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

### Ejemplo de Uso

### Clase `_00_Buscar`

La clase `_00_Buscar` es una parte fundamental de nuestro sistema de gestión de bibliotecas. Permite a los usuarios buscar libros en nuestra biblioteca y ver los resultados en una interfaz amigable.

#### Métodos y Funcionalidades

- `getTxtBuscar()`: Este método recopila el término de búsqueda ingresado por el usuario.
- `buscarMostrarLibros()`: Realiza la búsqueda de libros en nuestra base de datos y muestra los resultados en la tabla de la interfaz.

#### Uso

Para buscar libros en nuestra biblioteca, simplemente ingresa las palabras clave en el campo de búsqueda y haz clic en el botón de búsqueda. Los resultados se mostrarán en la tabla de resultados.

#### Contribución

Si deseas contribuir a esta clase, sigue nuestras pautas de contribución en [CONTRIBUTING.md](CONTRIBUTING.md).

#### Ejemplo de Uso

### Clase `_00_Buscar`

La clase `_00_Buscar` es una parte fundamental de nuestro sistema de gestión de bibliotecas. Permite a los usuarios buscar libros en nuestra biblioteca y ver los resultados en una interfaz amigable.

#### Métodos y Funcionalidades

- `getTxtBuscar()`: Este método recopila el término de búsqueda ingresado por el usuario.
- `buscarMostrarLibros()`: Realiza la búsqueda de libros en nuestra base de datos y muestra los resultados en la tabla de la interfaz.

#### Uso

Para buscar libros en nuestra biblioteca, simplemente ingresa las palabras clave en el campo de búsqueda y haz clic en el botón de búsqueda. Los resultados se mostrarán en la tabla de resultados.

#### Contribución

Si deseas contribuir a esta clase, sigue nuestras pautas de contribución en [CONTRIBUTING.md](CONTRIBUTING.md).

#### Ejemplo de Uso

```java
// Crear una instancia de la clase _00_Buscar
_00_Buscar buscador = new _00_Buscar();

// Ingresar un término de búsqueda
String terminoBusqueda = "novela";

// Realizar la búsqueda y mostrar los resultados
buscador.buscarMostrarLibros("biblioteca.txt", terminoBusqueda);



## Clase _01_Agregar

La clase `_01_Agregar` es parte del proyecto y representa una interfaz de usuario que permite agregar libros a un sistema de gestión de bibliotecas. A continuación, se describen las características clave y funcionalidades de esta clase.

### Descripción

La clase `_01_Agregar` se utiliza para ingresar información sobre un libro, como título, autor e ISBN, en un sistema de gestión de bibliotecas. Ofrece las siguientes características:

- Campos de texto para ingresar el título del libro, el autor y el ISBN.
- Verificación en tiempo real para habilitar un botón de "AÑADIR" cuando los campos están rellenados.
- Botón "AÑADIR" que permite agregar libros a la biblioteca.

### Métodos y Funcionalidades

Dentro de esta sección, se destacan los métodos y funcionalidades clave de la clase `_01_Agregar`. Esto incluye:

- `getTxTitulo()`: Un método que recopila el título del libro ingresado en el campo de texto.
- `getTxtAutor()`: Un método que recopila el autor del libro ingresado en el campo de texto.
- `getTxtISBN()`: Un método que recopila el ISBN del libro ingresado en el campo de texto.
- `camposRellenos()`: Un método que verifica si los campos de texto están rellenados y habilita el botón "AÑADIR" en consecuencia.

### Uso

En esta sección del README, se puede explicar cómo los usuarios pueden utilizar la clase `_01_Agregar` para agregar libros al sistema. Puedes proporcionar ejemplos de cómo interactuar con la interfaz de usuario y cómo se activa el botón "AÑADIR" cuando los campos están completos.

### Contribución

Si el proyecto es de código abierto y acepta contribuciones, puedes incluir información sobre cómo otros desarrolladores pueden contribuir a la clase `_01_Agregar`. Esto podría incluir pautas para enviar cambios y el proceso de revisión.

### Ejemplo de Uso

Para agregar un nuevo libro a la biblioteca, sigue estos pasos:

1. Abre la aplicación y selecciona la opción "AGREGAR" en el menú principal.

2. Completa la información del libro en los campos de texto:
   - Título del libro en el campo "Libro".
   - Nombre del autor en el campo "Autor".
   - Número de ISBN en el campo "ISBN".

3. A medida que ingreses información en los campos de texto, el botón "AÑADIR" se habilitará automáticamente si todos los campos están completos.

4. Haz clic en el botón "AÑADIR" para agregar el libro al sistema.

5. El libro se guardará en la base de datos y estará disponible para su consulta.

¡Listo! Has agregado un nuevo libro a la biblioteca utilizando la clase `_01_Agregar`.

Nota: Asegúrate de que todos los campos estén rellenados antes de hacer clic en "AÑADIR" para evitar errores.



