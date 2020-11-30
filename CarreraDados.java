//Archivo de trabajo de Mateo Borja, Stiven Lopez, Stephanie Muñoz
import java.util.Scanner;


public class CarreraDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se desea saber cual es el numero de meta
        System.out.println("Ingrese el numero de meta que desee: ");
        int meta = Integer.valueOf(scanner.nextLine());
        
        String entrada = "";
        //Se declaran variables de jugadores, suma de puntajes y demas auxiliares que se necesitan
        int sumjug1 = 0, sumjug2 = 0, jug1, jug2, i, aux1, aux2;

        System.out.print(0);
<<<<<<< Updated upstream
        //A cada jugador se le asigna un caracter especial
        System.out.print(" x   o");
=======
        System.out.print(" x   o"); // jugadores posicion inicial
>>>>>>> Stashed changes
        System.out.println("");
        for (int j = 1; j <= meta; j++) {
            System.out.println(j);
        }
        do {
            System.out.println("Primer jugador presione enter para lanzar los dados ");
            entrada = scanner.nextLine();
            jug1 = monopolyRoll();
            System.out.println("Suma de dados: " + jug1);
            System.out.println("Segundo jugador presione enter para lanzar los dados ");
            entrada = scanner.nextLine();
            jug2 = monopolyRoll();
            System.out.println("Suma de dados: " + jug2);
            System.out.println("Presione para continuar");
            entrada = scanner.nextLine();
            sumjug1 += jug1;
            sumjug2 += jug2;

            for (i = 0; i <= meta; i++) {
                System.out.print(i);
                if (sumjug1 % 10 == 0) {
                    //Jugador 1 en la base, jugador dos pierde el turno y no avanza
                    if (sumjug1 == sumjug2) {
                        sumjug2 = sumjug2 - jug2;
                    }
                }
                if (sumjug1 == sumjug2) {
                    //el jugador 2 llega a la misma posicion que 1, 1 regresa al inicio
                    sumjug1 = 0;
                }
                if (jug1 == 0) {
                    sumjug1 = 0;
                }
                if (sumjug1 == meta) {
                    break;
                }
                if (sumjug1 > meta) {
                    aux1 = sumjug1;
                    aux1 -= jug1;
                    sumjug1 = aux1;
                    if (aux1 % 10 == 0) {
                        //Jugador 1 en la base, jugador dos pierde el turno y no avanza
                        if (aux1 == sumjug2) {
                            sumjug2 = sumjug2 - jug2;
                        }
                    }
                    if (aux1 == sumjug2) {
                        //el jugador 2 llega a la misma posicion que 1, 1 regresa al inicio
                        aux2 = 0;
                    }
                    if (aux1 == i) {
                        System.out.print(" x");
                    } else if (sumjug1 == meta) {
                        System.out.print(" x");
                        break;
                    }

                }
                if (sumjug1 == i) {
                    System.out.print(" x");
                }

                if (sumjug2 % 10 == 0) {
                    //Jugador 1 en la base, jugador dos pierde el turno y no avanza
                    if (sumjug1 == sumjug2) {
                        sumjug1 = sumjug1 - jug1;
                    }
                }
                if (sumjug2 == sumjug1) {
                    //el jugador 2 llega a la misma posicion que 1, 1 regresa al inicio
                    sumjug2 = 0;
                }
                if (jug2 == 0) {
                    sumjug2 = 0;
                }
                if (sumjug2 > meta) {
                    aux2 = sumjug2;
                    aux2 -= jug2;
                    sumjug2 = aux2;
                    if (aux2 % 10 == 0) {
                        //Jugador 1 en la base, jugador dos pierde el turno y no avanza
                        if (sumjug1 == aux2) {
                            sumjug1 = sumjug1 - jug1;
                        }
                    }
                    if (sumjug1 == aux2) {
                        //el jugador 2 llega a la misma posicion que 1, 1 regresa al inicio
                        aux1 = 0;
                    }
                    if (aux2 == i) {
                        System.out.print(" o");
                    } else if (sumjug2 == meta) {
                        break;
                    }

                }
                // Posicion actual del jugador2
                if (sumjug2 == i) {
                    System.out.print(" o");
                }
                System.out.println("");
            }
        } while ((sumjug1 < meta) && (sumjug2 < meta)); //  posicion de jugadores menor que la posicion final
        if (sumjug1 == meta) {
            System.out.println("\nEl ganador es el jugador 1"); //Si  posicion jugador1 es igual al de la meta

        } else if (sumjug2 == meta) {
            System.out.println("\nEl ganador es eljugador 2"); // Si posicion jugador2 es igual al de la meta
        }
    }

    //Funcion para obtener numeros randomicos de 1 a 6 incluidos
    public static int dice() {
        int value = (int) Math.floor(Math.random() * 6 + 1);
        return value;
    }

    //Funcion que realiza el lanzamiento de dos dados
    public static int monopolyRoll() {
        int sum = 0, count = 0, x, y;
        do {
            x = dice();
            y = dice();
            sum = sum + x + y;
            count++;
            if (count == 3) {
                System.out.println("Triple dobles. A la CARCEL. Vuelve al inicio");
                return 0;
            }
            System.out.println("Dado1: " + x);
            System.out.println("Dado2: " + y);
        } while (x == y);
        return sum;
    }
}
