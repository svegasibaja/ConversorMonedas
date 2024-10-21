# Conversor de Monedas 💱

## Descripción
Este proyecto es una aplicación sencilla desarrollada en Java que permite convertir entre diferentes monedas. Está diseñado para ser intuitivo y eficiente en la conversión de valores entre divisas comunes.

## Funcionalidades
- Conversión entre monedas: USD (DOLAR), EUR (EURO), COP, MXN, PEN y BRL.
- Consultar cambio de moneda actual de uno a uno.
- Validación de entrada para evitar errores.
- Interfaz amigable para el usuario.
  
## Tecnologías Utilizadas
- **Lenguaje:** Java  
- **Entorno:** IntelliJ IDEA  
- **Control de versiones:** Git y GitHub

## Instalación y Uso

### Clonar el Repositorio
Abre la terminal y ejecuta el siguiente comando para clonar el proyecto en tu máquina local:
```
git clone https://github.com/svegasibaja/ConversorMonedas.git
```
## Navegar a la Carpeta del Proyecto
```
cd ConversorMonedas
```
## Compilar el Proyecto
```
javac src/*.java
```
## Ejecutar el Proyecto
```
java src.Main
```
## Estructura del proyecto

La estructura del proyecto se divide de la siguiente manera:

* **src:** Contiene el código fuente del proyecto.
    * **java:**
        * **main:**
            * **java:** Contiene las clases principales del proyecto:
                * **APIManager:** Probablemente se encarga de la interacción con una API externa para obtener las tasas de cambio.
                * **ConvertidorMoneda:** Realiza la conversión de monedas.
                * **Principal:** Clase de inicio de la aplicación.
                * **ValidadorMoneda:** Valida la entrada del usuario (monedas, cantidades).
                * **VisualizadorTasaCam:** Se encarga de mostrar las tasas de cambio al usuario.
            * **resources:** Contiene recursos adicionales como archivos de configuración o propiedades.
* **target:** Contiene los archivos generados durante la compilación.
* **.gitignore:** Define los archivos que se deben ignorar al realizar el control de versiones con Git.
* **ConversorDeMonedas.iml:** Archivo de configuración de IntelliJ IDEA.
* **pom.xml:** Archivo de configuración de Maven.
* **External Libraries:** Contiene las librerías externas utilizadas en el proyecto.
* **Scratches and Consoles:** Archivos temporales y consolas de la IDE.

## Autor ✍️
Sebastián Vegas – svegasibaja
