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

El diagrama se encuentra dentro del paquete del ejercicio, en un archivo.puml (`diagramaUML.puml`).


# Ejercicio 2: Análisis de Frecuencia de Carácteres

Este código Java pertenece a una clase llamada `AnalisisFrecuenciaCaracteres` que se encarga de analizar la frecuencia de caracteres en un texto ingresado por el usuario. Aquí está una explicación línea por línea:

## 1. Paquete y Clase

* El código está en el paquete `ejercicio2`
* La clase principal se llama `AnalisisFrecuenciaCaracteres`

## 2. Método Principal

* La ejecución comienza con el método `main`.
* El método `main` llama a la función `analizarFrecuenciaCaracteres()` para iniciar el análisis de frecuencia de carácteres.

## 3. Función `analizarFrecuenciaCaracteres()`:

* Se crea un objeto `HashMap<Character, Integer>` llamado `frecuencias` para almacenar la frecuencia de cada carácter. La clave es el carácter y el valor es la cantidad de veces que aparece en el texto.
* Se crea un objwto `Scanner` para leer la entrada del usuario desde la consola.
* Se solicita al usuario que ingrese un texto mediante la impresión "Ingrese un texto:".
* Se lee la línea de texto ingresada por el usuario utilizando `scanner.nextLine()` y se almacena en la variable `texto`.
* Se utiliza un bucle `for-each` para recorrer cada carácter en el texto utilizando `texto.toCharArray()`.
* Dentro del bucle, se verifica si el carácter ya está presente en el mapa de frecuencias. Si está presente, se incrementa el valor asociado a ese carácter en 1. Si no está presente, se agrega el carácter al mapa con un valor de 1.
* Despues de recorrer todo el texto, se imprime la frecuencia de cada carácter almacenada en el mapa. Se utiliza otr bucle `for-each` para iterar sobre las entradas del mapa de frecuencias y se imprime cada clave(carácter) junto con su valor(frecuencia).

En resumen, este código solicita al usuario un texto, analiza la frecuencia de cada carácter en ese texto y muestra la frecuencia de cada carácter en la consola.

# Pseudocódigo

```java
función analizarFrecuenciaCaracteres():
    frecuencias = diccionario vacío
    texto = obtenerTexto()

    para cada cáracter en texto:
        si cáracter está en frecuencias:
            frecuencias[carácter] += 1
        si no:
            frecuencias[carácter] = 1

    imprimir("Frecuencia de caracteres:")
    para cada entrada en frecuencias:
        imprimir(entrada.clave + ": " + entrada.valor)

analizarFrecuenciaCaracteres()
```

# Diagrama UML

El diagrama se encuentra deltro del paquete del ejercicio, en un archivo.puml (`diagramaUML.puml`).
