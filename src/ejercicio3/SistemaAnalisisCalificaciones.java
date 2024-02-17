package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAnalisisCalificaciones {

    public static void main(String[] args) {
        calcularMediaCalificaciones();
    }

    public static void calcularMediaCalificaciones() {
        ArrayList<Double> calificaciones = new ArrayList<>();
        double nota = obtenerNota();

        while (nota != -1) {

            calificaciones.add(nota);
            nota = obtenerNota();
        }

        double media = calcularMedia(calificaciones);

        System.out.println("Calificaciones: ");
        for (double calificacion : calificaciones) {
            System.out.println(calificacion + " ");
        }

        System.out.println("-Media: " + media);
    }

    public static double obtenerNota() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una nota (-1 para finalizar): ");
        return scanner.nextDouble();
    }

    public static double calcularMedia(ArrayList<Double> calificaciones) {
        double suma = 0;

        for (double calificacion : calificaciones) {
            suma += calificacion;
        }

        return suma / calificaciones.size();
    }
}
