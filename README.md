Pequeña aplicación de consola que permite visualizar el avance de dos jugadores en un tablero de longitud a elección
los jugadores rodarán dados por turnos y avanzarán según el número obtenido aleatoriamente
Si un jugador obtiene el mismo número en ambos dados, puede rodar de nuevo
Si un jugador obtiene el mismo número tres veces, regresará al inicio
Si un jugador llega a la posición del otro luego de rodar, el jugador que rodó volverá al inicio
El juego termina cuando algún jugador llega al fin del tablero, el número final no tiene que ser exacto

---Funciones---
main: contiene la ejecución principal: el dibujo del tablero con las posiciones de los jugadores y las condiciones de regreso al inicio
dice: utiliza la función Math.random para obtener un número aleatorio del 1 al 6
monopolyRoll: suma los valores de los dados y los retorna, contiene la condición para anular el turno si los dados se repiten 3 veces