package ejercicio8;

import java.util.Random;
import java.util.Scanner;

public class JuegoBatallaNaval {

    public static void main(String[] args) {
        jugarBatallaNaval();
    }

    public static void jugarBatallaNaval() {
        char[][] tablero = crearTablero(4, 4);
        int[] ubicacionBarco = elegirUbicacionAleatoria(tablero);
        int[] intento;

        while (true) {
            mostrarTablero(tablero);
            intento = obtenerIntento();

            if (esIgual(intento, ubicacionBarco)) {
                marcarTocadoYHundido(tablero, intento);
                mostrarTablero(tablero);
                System.out.println("Tocado y hundido - ¡Has ganado!");
                break;
            } else {
                marcarAgua(tablero, intento);
            }
        }
    }

    public static char[][] crearTablero(int filas, int columnas) {
        return new char[filas][columnas];
    }

    public static int[] elegirUbicacionAleatoria(char[][] tablero) {
        Random random = new Random();
        int fila = random.nextInt(tablero.length);
        int columna = random.nextInt(tablero[0].length);
        return new int[]{fila, columna};
    }

    public static int[] obtenerIntento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese fila (0-3): ");
        int fila = scanner.nextInt();
        System.out.println("Ingrese columna (0-3): ");
        int columna = scanner.nextInt();
        return new int[]{fila, columna};
    }

    public static void marcarAgua(char[][] tablero, int[] coordenadas) {
        tablero[coordenadas[0]][coordenadas[1]] = 'O';
        System.out.println("Agua - Intenta de nuevo.");
    }

    public static void marcarTocadoYHundido(char[][] tablero, int[] coordenadas) {
        tablero[coordenadas[0]][coordenadas[1]] = 'X';
    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println("Tablero:");
        for (char[] fila : tablero) {
            for (char celda : fila) {
                System.out.println(celda + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean esIgual(int[] coordenadas1, int[] coordenadas2) {
        return coordenadas1[0] == coordenadas2[0] && coordenadas1[1] == coordenadas2[1];
    }
}
