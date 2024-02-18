package ejercicio9;

import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {
        jugarTresEnRaya();
    }

    public static void jugarTresEnRaya() {
        char[][] tablero = crearTablero(3, 3);
        char jugador_actual = 'X';

        while (!hayGanador(tablero) && !hayEmpate(tablero)) {
            mostrarTablero(tablero);
            realizarMovimiento(tablero, jugador_actual);
            jugador_actual = cambiarJugador(jugador_actual);
        }

        mostrarResultado(tablero);
    }

    public static char[][] crearTablero(int filas, int columnas) {
        return new char[filas][columnas];
    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println("Tablero actual:");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.println(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void realizarMovimiento(char[][] tablero, char jugador) {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;

        do {
            System.out.println("Turno del jugador " + jugador + ":");
            System.out.println("Ingrese fila (0-2): ");
            fila = scanner.nextInt();
            System.out.println("Ingrese columna (0-2): ");
            columna = scanner.nextInt();
        } while (!esMovimientoValido(tablero, fila, columna));

        tablero[fila][columna]=jugador;
    }

    public static boolean esMovimientoValido(char[][] tablero, int fila, int columna) {
        return fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero[0].length && tablero[fila][columna] == 0;
    }

    public static char cambiarJugador(char jugador) {
        return (jugador == 'X') ? 'O' : 'X';
    }

    public static boolean hayGanador(char[][] tablero) {
        //Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != 0 && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
                System.out.println("¡El jugador " + tablero[i][0] + " ha ganado!");
                return true;
            }
            if (tablero[0][i] != 0 && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]) {
                System.out.println("¡El jugador " + tablero[0][i] + " ha ganado!");
                return true;
            }
        }

        //Verificar diagonales
        if (tablero[0][0] != 0 && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            System.out.println("¡El jugador " + tablero[0][0] + " ha ganado!");
            return true;
        }
        if (tablero[0][2] != 0 && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
            System.out.println("¡El jugador " + tablero[0][2] + " ha ganado!");
            return true;
        }
        return false;
    }

    public static boolean hayEmpate(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    return false; //Todavía hay casillas vacías, no hay empate
                }
            }
        }

        System.out.println("¡El juego ha terminado en empate!");
        return true;
    }

    public static void mostrarResultado(char[][] tablero) {
        System.out.println("Tablero final:");
        mostrarTablero(tablero);
        System.out.println("Gracias por jugar.");
    }
}


