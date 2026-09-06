# Programacion2 - Grupo 6 - Semana 8

Proyecto colaborativo en Java para practicar el flujo de trabajo con ramas,
commits semanticos, Pull Requests, revisiones de codigo y resolucion de
conflictos en GitHub.

## Integrantes y aportes

> Sustituir los textos pendientes por los nombres completos antes de entregar.

| Integrante | Rol | Aporte |
| --- | --- | --- |
| Josué Ernesto Zelaya Carballo | Git Master / desarrollador | Configuracion del repositorio y modulo Cliente |
| Elvis Tu Yang | QA / desarrollador | Pruebas, validaciones y revision de Pull Requests |
| Bryan Enrique Alfaro Guzman | Desarrollador | Modulo Producto |
| Ruben Eduardo Estupinian Avila | Desarrollador | Modulo Venta |
| Carlos Javier Alfaro Viera  | Desarrollador | Modulo Usuario o Empleado |
| Kelly Alejandra Rodriguez Alvarado | Desarrollador / documentacion | Modulo Inventario y evidencias |

## Requisitos

- JDK 17 o superior.
- Maven 3.9 o superior (opcional si se compila directamente con `javac`).

## Estructura

```text
src/
|-- main/java/sv/edu/uees/programacion2/
|   `-- Main.java
`-- test/java/sv/edu/uees/programacion2/
```

Cada modulo debe ubicarse en un paquete propio dentro de
`sv.edu.uees.programacion2`. Por ejemplo, Cliente se encuentra en el paquete
`cliente`.

## Ejecutar el proyecto

Con Maven:

```bash
mvn clean package
mvn exec:java
```

Sin Maven:

```bash
javac -d out src/main/java/sv/edu/uees/programacion2/cliente/Cliente.java src/main/java/sv/edu/uees/programacion2/Main.java
java -cp out sv.edu.uees.programacion2.Main
```

Las comprobaciones del modulo Cliente no requieren bibliotecas externas y se
pueden ejecutar desde el IDE mediante la clase `ClienteTest`. Desde una
terminal, despues de compilar el proyecto:

```bash
javac -cp out -d out src/test/java/sv/edu/uees/programacion2/cliente/ClienteTest.java
java -cp out sv.edu.uees.programacion2.cliente.ClienteTest
```

## Flujo de trabajo

1. Actualizar `main` con `git pull origin main`.
2. Crear una rama con `git checkout -b feature/nombre-del-modulo`.
3. Hacer cambios pequenos y commits semanticos, por ejemplo
   `feat: crear modulo cliente`.
4. Publicar la rama con `git push -u origin feature/nombre-del-modulo`.
5. Abrir un Pull Request hacia `main`.
6. Esperar la revision del QA y del Git Master antes del merge.

No se deben enviar cambios directamente a `main`
