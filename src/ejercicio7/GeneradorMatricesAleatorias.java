package ejercicio7;

import java.util.Random;

public class GeneradorMatricesAleatorias {

    public static void main(String[] args) {
        generarMatrizAleatoria();
    }

    public static void generarMatrizAleatoria() {
        char [][] matriz = new char[20][30];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 30; j++) {
                matriz[i][j] = generarCaracterAleatorio();
            }
        }

        mostrarMatriz(matriz);
    }

    public static char generarCaracterAleatorio() {
        Random random = new Random();
        //Generar un carácter aleatorio entre 'A' y 'Z'
        return (char) (random.nextInt(26) + 'A');
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
