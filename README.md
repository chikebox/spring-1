# Spring 3
![Alt text](doc/screenshot.png?raw=true 'logo spring')

Proyecto Web para aprender el manejo básico del FrameWork Spring 3:

	- Spring MVC
	- Spring JDBC Templates	
	- Spring Security
	- Spring AOP	 
	- Subida Ficheros

Recomendable NO comenzar con el branch 'master', mejor comenzar con los 'TAG' creados para avanzar progresivamente con los nuevos conceptos.

## TAG 0.1 - inicio
Estructura básica de Spring MVC Legacy, proyecto creado con Spring Tools Suite 3.8.3 desde Eclipse.
Añadido un controlador nuevo para típico ejemplo de Saludar pasando un parametro.

## TAG 0.2 - JdbcTemplate
Estructura de clases e interfaces necesaria para poder hacer una consulta en BBDD. Solo implementado 'getAll()' para recuperar un listado de Vehiculos.
### TAG 0.2.1 - Test JdbcTemplate
Ejemplo básico para cargar un contexto de test y probar un DAO.

## TAG 0.3 - Validacion
Validación de datos enviados por formulario usando JSR-303

## TAG 0.4 - i18n
Internacionalizaión i18n - 3 Idiomas ( Castellano, Euskara e Ingles ).

	- Mirar carpeta src/main/resources/messages
	- Definir en root-context.xml properties de mensajes
	- Definir en servlet-context.xml interceptor para LocaleChangeInterceptor
	- Capa Presentacion ( Views ) usar TLD: taglib uri="http://www.springframework.org/tags" prefix="spring"
	- Capa Modelo POJO (domain) enlace automaticamente validaciones javax.validation api 

## TAG 0.5 - Security

[leer más](doc/security.md)


	
## TAG 0.6 - Logger
Trazas de logs para escribir en un fichero de texto '${catalina.home}/logs/spring/trazas.log'

## TAG 0.7 - File Upload
Subidas de ficheros ( imagenes con extensión .jpeg, que no pesen mas de 1Mb )

	- Añadir dependencias al pom.xml ( commons-fileupload y commons-io )
	- bean org.springframework.web.multipart.commons.CommonsMultipartResolver en servlet-context.xml
	- @Controller UploadFileController
	- formulario para subir imagenes en index.jsp

### Installation 

	. importar script para la bbdd
	. cambiar parametros conexion bbdd en src/main/resources/database.properties
	


