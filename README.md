<div align="center">
       <img src="https://github.com/marirois/conversor-de-monedas-challenge/blob/4f1ed414fece2207e7b28a46b4eff8366a4947b0/src/assets/portada-conversor-de-monedas.jpg" alt="Portada del challenge">
</div>

# Conversor de Monedas en Java

:nut_and_bolt: Proyecto en construcción :nut_and_bolt:

Aplicación de consola desarrollada en Java 24 que permite realizar conversiones de divisas en tiempo real utilizando la API de ExchangeRate-API.

El sistema muestra un menú interactivo, solicita el monto a convertir, consulta el tipo de cambio actualizado desde la API y devuelve el resultado al usuario.

Todas las conversiones realizadas se almacenan en un archivo JSON como historial.

## Características

* Conversion en tiempo real entre divisas específicas:
  * USD → MXN 
  * MXN → USD 
  * USD → BRL 
  * BRL → USD 
  * USD → EUR 
  * EUR → USD
* Menú interactivo en consola
* Ejecución continua mediante bucle ``while``
* Manejo de excepciones (``IOExeptions``)
* Consumo de API externa con ``HTTPClient``
* Serialización y almacenamiento de datos en archivo JSON
* Aplicación de principios de POO

## Tecnologías Utilizadas

* Java 24
* ``HTTPClient``
* ``HTTPRequest``
* ``HTTPResponse``
* ``URI``
* Librería Gson
* ``Scanner``
* IDE IntelliJ IDEA

## Estructura del proyecto
├── Principal  
├── MenuConversor  
├── ConsultarConversion  
├── ConversionOmd (Record)  
├── Conversion  
├── GeneradorDeArchivo

### Descripción de los componentes
* Principal: Controla el flujo principal del programa y el ciclo de ejecución.
* MenuConversor: Muestra el menú de conversiones disponibles y determina el tipo de conversión seleccionada.
* ConsultarConversion: Realiza la petición HTTP a la API y obtiene el tipo de cambio.
* ConversionOmd(Record); Representa el modelo de datos que mapea la respuesta JSON.
* Conversion: Recibe los datos obtenidos con ConversionOmd y crea los objetos a través de un constructor.
* GeneradorDeArchivo: Gestiona la creación del archivo JSON y, en caso de ya existir, lee los datos existentes, los pasa a una lista, añade la nueva consulta y vuelve a escribir todas las consultas realizadas en el archivo. 

## Instalación y Ejecución
1. Clonar el repositorio.  
``git clone https://github.com/tu-usuario/conversor-monedas.git``
2. Abrir el proyecto en IntelliJ IDEA (o cualquier IDE compatible con Java 24).
3. Agregar tu APIKEY dentro del método ``convertirMoneda`` en la clase ``ConsultarConversion``:    
``String apiKey = "TU_API_KEY_AQUI";``
Puedes generar tu APIKEY gratuita en el sito oficial de https://www.exchangerate-api.com/
4. Ejecutar la clase Principal.

```java
Elija una opción válida
1. Dolar            ->  Peso mexicano
2. Peso mexicano    ->  Dolar
3. Dolar            ->  Real brasileño
4. Real brasileño   ->  Dolar
5. Dolar            ->  Euro
6. Euro             ->  Dolar
7. Salir

4

Ingresa el monto que deseas convertir
        
58

Código base: BRL
Código objetivo: USD
Monto ingresado: 58.0
Resultado: 11.1244
```

El sistema vuelve automáticamente al menú hasta que el usuario seleccione la opción **Salir**

## Persistencia de datos
Cada conversión realizada se almacena en un archivo JSON (si este no existe, el programa lo crea), mediante una lista acumulativa. Estopermite conservar el historial de consultas realizadas durante la ejecución del programa.

## Aprendizajes aplicados
Durante el desarrollo del challenge se consolidaron conocimientos en:
* Consumo de APIs REST
* Manejo de peticiones HTTP en Java
* Serialización y deserialización de JSON con Gson
* Manejo de excepciones
* Diseño orie~~~~ntado a objetos
* Separación de responsabilidades entre clsases
* uso de ``record`` en Java

## Mejoras futuras
* Ampliar el catálogo de conversiones disponibles
* Permitir consultar historial de conversiones 
* Implementar validaciones adicionales de entrada
* Implementar interfaz gráfica

  ## DESARROLLADORES
* Mariana Rodríguez
    * [Linkedin](https://www.linkedin.com/in/mariana-rodr%C3%ADguez-b19b0048/)
    * [GitHub](https://github.com/marirois)


