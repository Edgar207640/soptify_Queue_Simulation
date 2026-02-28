Sistema de Reproducción de Playlist con Cola de Prioridad
Este proyecto implementa un sistema de reproducción de canciones utilizando una estructura de datos tipo cola (Queue) desarrollada manualmente. El sistema permite gestionar canciones con diferentes niveles de prioridad y simula su reproducción segundo a segundo desde la consola.
Estructura del Proyecto
•	data-structure-queue → Librería que contiene la implementación de la cola personalizada.
•	queueHandler → Proyecto principal que utiliza la librería para simular la playlist.
•	evidencias/ → Carpeta que contiene capturas de ejecución solicitadas.
Cómo compilar la librería
1. Abrir una terminal en la carpeta data-structure-queue.
2. Ejecutar el siguiente comando:
   mvn clean install
Cómo instalar en local
El comando 'mvn clean install' compila el proyecto y lo instala en el repositorio local de Maven, permitiendo que otros proyectos lo utilicen como dependencia.
Cómo compilar el handler
1. Abrir una terminal en la carpeta queueHandler.
2. Ejecutar:
   mvn clean package

Explicación del Diseño
Se implementó una estructura de cola personalizada utilizando nodos enlazados. La cola sigue el principio FIFO (First In, First Out).
Decisiones Técnicas
- Se desarrolló la estructura sin utilizar colecciones predefinidas de Java.
- Se utilizó Maven para la gestión de dependencias y empaquetado.
- Se separó el proyecto en librería y handler para mantener modularidad.
Implementación de Prioridad
La prioridad se manejó utilizando tres colas diferentes: HIGH, MEDIUM y LOW. Al momento de reproducir, el sistema verifica primero la cola HIGH, luego MEDIUM y finalmente LOW.
Simulación de Duración
La reproducción se simula utilizando Thread.sleep(1000), permitiendo mostrar en consola el avance segundo a segundo de cada canción. También se muestra una barra de progreso y mensajes de inicio y finalización.
Evidencias
La carpeta evidencias/ contiene capturas de:
- mvn clean install ejecutado en la librería.
- mvn clean package ejecutado en el handler.
- Ejecución del programa desde consola.
- Logs mostrando la reproducción segundo a segundo.

