package ejercicio5;

import java.util.Scanner;

public class VerificadorPalindromos {

    public static void main(String[] args) {
        //Obtener la palabra del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        //Verificar si es un palíndromo
        if (esPalindromo(palabra)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }

    //Función para verificar si la palabra es un palíndromo
    public static boolean esPalindromo(String palabra) {
        //Eliminar espacios y convertir a minúsculas para evitar problemas
        palabra = palabra.replaceAll("\\s", "").toLowerCase();

        //Comprobar la palabra con su inversa
        return palabra.equals(invertir(palabra));
    }

    //Función para invertir una palabra
    public static String invertir(String cadena) {
        StringBuilder invertida = new StringBuilder();
        for (int i = cadena.length() -1; i >= 0; i--) {
            invertida.append(cadena.charAt(i));
        }
        return invertida.toString();
    }
}
