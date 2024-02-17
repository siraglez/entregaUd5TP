package ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimuladorEleccionesElectronicas {

    public static void main(String[] args) {
        simularElecciones();
    }

    public static void simularElecciones() {
        Map<String, Integer> votos = new HashMap<>();
        int codigoEspecial = 68753421;
        String voto = obtenerVoto();

        while (!voto.equals(String.valueOf(codigoEspecial))) {
            if (votos.containsKey(voto)) {
                votos.put(voto, votos.get(voto) + 1);
            } else {
                votos.put(voto, 1);
            }
            voto = obtenerVoto();
        }

        mostrarResultados(votos);
    }

    public static String obtenerVoto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opciones de voto: A, B, C, D, E.");
        System.out.println("Ingrese el voto (o ingrese el código especial para finalizar): ");
        return scanner.nextLine().toUpperCase();
    }

    public static void mostrarResultados(Map<String, Integer> votos) {
        System.out.println("Resultados de las elecciones:");
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            System.out.println("Candidato " + entry.getKey() + ": " + entry.getValue() + " votos");
        }
    }
}
