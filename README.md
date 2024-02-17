Link al repositorio: https://github.com/siraglez/entregaUd5TP.git


# Ejercicio 1: Simulación de Lanzamiento de Cohetes

Este código Java es un simulador simple de cuenta regresiva para el lanzamiento de un cohete. Aquí está una explicación detallada:

## 1. Paquete y Clase:

- El código está en el paquete `ejercicio1`.
- La clase principal se llama `SimuladorLanzamientoCohetes`.

## 2. Método Principal `main`:

- La ejecución comienza con el método `main`.
- El método `main` llama a la función `cuentaAtrasLanzamineto()` para iniciar la simulación del lanzamiento.

## 3. Función `cuentaAtrasLanzamineto`:

- Se crea una instancia de la clase `Timer`, que se utiliza para programar tareas a intervalos regulares.
- Se declara un array de enteros `segundos` con un único elemento inicializado en 10. Este array se utiliza para mantener el tiempo restante en la cuenta regresiva.
- Se define una tarea (`TimerTask`) anónima que implementa el método `run`.
- En el método `run`, se verifica si los segundos restantes son mayores que 0. Si es así, imprime la cuenta regresiva y decrementa el valor de segundos. Si llega a cero, se cancela el timer y se imprime "¡Despegue!".
- La tarea se programa para ejecutarse cada segundo (`1000` milisegundos) con `timer.scheduleAtFixedRate(tarea, 0, 1000)`.

En resumen, el programa utiliza un temporizador para realizar una cuenta regresiva desde 10 hasta 0 con intervalos de 1 segundo, simulando así un lanzamiento de cohete. La cuenta atrás se imprime en la consola, y cuando llega a cero, se muestra el mensaje "¡Despegue!" y se detiene el temporizador.

# Pseudocódigo

```java
función cuentaAtrasLanzamiento():

    función principal main():
        cuentaAtrasLanzamiento()

    timer = nuevo Timer()
    segundos = [10]

    tarea = nuevo TimerTask():
        función run():
            si segundos[0] > 0 entonces
                imprimir "Cuenta atrás: ", segundos[0]
                segundos[0] = segundos[0] -1
            sino
                timer.cancel()
                imprimir "¡Despegué!"

            timer.scheduleAtFixedRate(tarea, 0, 1000)
```

# Diagrama UML

El diagrama se encuentra dentro del paquete del ejercicio, en un archivo.puml (`diagramaUML.puml`)
