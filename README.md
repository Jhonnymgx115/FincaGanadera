# FincaGanadera

Este proyecto consiste en una aplicación que simula el manejo de una finca ganadera con diferentes razas de animales, potreros, vacunación y ventas. El objetivo es facilitar el control y la administración de la finca, así como generar reportes gráficos sobre la ocupación y el estado de salud de los animales.

## Características

- La finca tiene 250 cabezas de ganado de 6 razas diferentes y 8 potreros en total.
- Por cada potrero se deben tener máximo 2 animales de cada raza.
- Los animales se pueden ir moviendo de un potrero a otro.
- El ganado está marcado según la raza y un número, que se generan aleatoriamente, y se indica si están vacunados o no.
- La finca tiene 4 potreros libres para el movimiento de los animales.
- Se debe controlar la vacunación de los animales, en una jornada se vacunan 10 reses.
- Se debe manejar las ventas de los animales, que van a un potrero especial y de allí se despachan a la feria.
- Para cada animal a vender se debe tener el peso con el que sale y revisar cuántos carros se deben tener disponibles para la venta, cada carro puede transportar 6 toneladas de peso y máximo 8 reses.
- Se usa la librería JFreechart para mostrar la ocupación y la cantidad de reses vacunadas y sin vacunar de cada potrero.

## Requisitos

- Java 11
- JFreechart 

## Instalación

- Descargar el código fuente del proyecto desde este repositorio.
- Importar el proyecto en un IDE de Java (Eclipse, Netbeans, etc.).
- Añadir la librería JFreechart al classpath del proyecto.
- Ejecutar la clase principal del proyecto.

## Uso

- Al iniciar la aplicación, se mostrará una ventana con el menú principal, donde se pueden elegir las siguientes opciones:

  - Historial: muestra una tabla con los datos de cada potrero, como el número, la capacidad, la ocupación, el porcentaje de vacunación y el botón para ver el gráfico correspondiente.

  - Mover: permite seleccionar un potrero de origen y uno de destino, y mover uno o más animales entre ellos, respetando las restricciones de capacidad y raza.

  - Agregar: permite agregar nuevos animales a los potreros libres, indicando la raza, el número y el estado de vacunación.

  - Vacunación : permite seleccionar un potrero y vacunar hasta 10 animales que no lo estén, actualizando el porcentaje de vacunación del potrero.

  - Vender: permite seleccionar un potrero y enviar uno o más animales al potrero de ventas, indicando el peso de cada animal. También muestra el número de carros necesarios para transportar los animales a la feria.
  - Salir: cierra la aplicación con botón.

