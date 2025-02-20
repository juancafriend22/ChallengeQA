Autor: Juan Carlos Gonzalez Ortiz

www.linkedin.com/in/juan-carlos-gonzalez-3b566598

# Challenge QA Serenity con ScreenPlay
Pagina automatizada: https://www.saucedemo.com/

Funciones automatizadas: Carrito de compras

Patrón de diseño: Screenplay

Framework: gherkin, cucumber, SerenityBDD 3.3.4

Plugins adicionales: cucumber for java, Gherkin

Lenguaje programacion: Java

version gradle: gradle-7.6.1

JDK: OPEN_JDK Version 17.0.9

Driver Selenium: Edge(modo automático de versión)

IDE: Intellij IDEA  2024.3.3

#### **_Escenario Propuesto:_**

Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la página
https://www.saucedemo.com/ que incluya:

• Autenticarse con el usuario: standard_user y password: secret_sauce

• Agregar dos productos al carrito

• Visualizar el carrito

• Completar el formulario de compra

• Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”

## **PASOS PARA LA EJECUCIÓN**
1. Tener seteada la variable JAVA_HOME y Gradle(dentro del Path) como variables de sistema
![img.png](img.png)

![img_1.png](img_1.png)

2.Para compilar el proyecto y preparar todo para la ejecución con las respectivas dependencias necesarias, ejecuta el comando: gradle clean build. Este comando limpia cualquier compilación anterior y compila el proyecto desde cero.
Como solo se tiene un Runner, basta con este comando para que se ejecute el proceso.
Se adjunta un video demostrativo de la aplicación ejecutándose:
https://youtu.be/Ki0_k9dfaKk

## **Reportes**
El main report de Serenity-Cucumber se genera automáticamente luego de la ejecución de la automatización en el directorio: "../IdeaProjects/ChallengeQA/target/site/serenity/index.html"
![img_2.png](img_2.png)

Adicionalmente, se puede encontrar evidencias generadas por Cucumber en la ruta target/serenity-reports, los archivos generados son:

-rerun.txt: Archivo de texto con la información de la línea donde falló el caso para su revisión.

-serenity-html-report.html: Reporte generado con el resultado de cada uno de los pasos del feature incluido en las pruebas.

-serenity-summary.html: Este es un reporte gerencial sobre los resultados de la ejecución, se obtiene con el comando después de la ejecución de las pruebas:  gradle reports
