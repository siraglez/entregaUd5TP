package ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnalisisFrecuenciaCaracteres {

    public static void main(String[] args) {
        analizarFrecuenciaCaracteres();
    }

    public static void analizarFrecuenciaCaracteres() {
        Map<Character, Integer> frecuencias = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto: ");
        String texto = scanner.nextLine();

        for (char caracter : texto.toCharArray()) {
            if (frecuencias.containsKey(caracter)) {
                frecuencias.put(caracter, frecuencias.get(caracter) + 1);
            } else {
                frecuencias.put(caracter, 1);
            }
        }

        System.out.println("Frecuencia de caracteres:");
        for (Map.Entry<Character, Integer> entry : frecuencias.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
