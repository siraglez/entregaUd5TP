package ejercicio6;

public class AnalisisAlgoritmoMatricesModificado {
    public static void main(String[] args) {
        llenarMatriz();
    }

    public static void llenarMatriz() {
        int[][] matriz = new int[4][4];
        int val = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (i % 2 == 0) ? val++ : ((i + 1) * 4 - j);
            }
        }

        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
