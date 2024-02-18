package ejercicio10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Empleado {
    String nombre;
    int numeroEmpleado;
    String numeroSeguridadSocial;

    public Empleado(String nombre, int numeroEmpleado, String numeroSeguridadSocial) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}

class SistemaBusqueda {
    Map<Integer, Empleado> tablaHash;

    public SistemaBusqueda() {
        tablaHash = new HashMap<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        //Utilizamos el número de empleado como clave
        int clave = empleado.numeroEmpleado;

        //Verificamos si ya existe un empleado con la misma clave
        if (!tablaHash.containsKey(clave)) {
            tablaHash.put(clave, empleado);
            System.out.println("Empleado agregado correctamente.");
        } else {
            System.out.println("Ya existe un empleado con el mismo número de empleado. No se puede duplicar.");
        }
    }

    public Empleado buscarEmpleado(int numeroEmpleado) {
        return tablaHash.get(numeroEmpleado);
    }
}

public class SistemaBusquedaEmpleados {
    public static void main(String[] args) {
        SistemaBusqueda sistema = new SistemaBusqueda();
        Scanner scanner = new Scanner(System.in);

        //Permitir al usuario agregar empleados
        System.out.println("Añadir empleados: ");
        while (true) {
            System.out.println("Ingrese el nombre del empleado (o 'fin' para salir): ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.println("Ingrese el número de empleado: ");
            int numeroEmpleado = scanner.nextInt();
            scanner.nextLine(); //Limpiar el buffer de entrada
            System.out.println("Ingrese el número de seguridad social: ");
            String numeroSeguridadSocial = scanner.nextLine();

            Empleado nuevoEmpleado = new Empleado(nombre, numeroEmpleado, numeroSeguridadSocial);
            sistema.agregarEmpleado(nuevoEmpleado);
        }

        //Buscar empleado por número de empleado
        System.out.println("Ingrese el número de empleado que desea buscar: ");
        int numeroBusqueda = scanner.nextInt();

        Empleado empleadoEncontrado = sistema.buscarEmpleado(numeroBusqueda);

        if (empleadoEncontrado != null) {
            System.out.println("Empleado encontrado: " + empleadoEncontrado.nombre);
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
}
