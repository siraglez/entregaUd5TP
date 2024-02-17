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


# Ejercicio 3: Sistema de Análisis de Calificaciones

Este código en Java representa un programa simple que recopila calificaciones de estudiantes, calcula su media y luego muestra todas las calificaciones junto con la media.

## 1. Estructura del Código

### 1.1 Paquete y Clase:

El código se encuentra en el paquete "ejercicio3" y define una clase llamada "SistemaAnalisisCalificaciones".

### 1.2 Método principal (`main`):

El método `main` es el punto de entrada del programa y simplemente llama al método `calcularMediaCalificaciones`.

### 1.3 Método `calcularMediaCalificaciones`:

- Crea un objeto de la clase `ArrayList` para almacenar las calificaciones como valores de punto flotante (`Double`).
- Utiliza un bucle `while` para solicitar al usuario ingresar calificaciones mediante el método `obtenerNota()` hasta que se ingrese -1.
- Calcula la media de las calificaciones utilizando el método `calcularMedia`.
- Imprime todas las calificaciones y su media en la consola.

### 1.4 Método `obtenerNota`:

- Utiliza la clase `Scanner` para obtener una calificación del usuario desde la entrada estándar (teclado).
- Imprime un mensaje solicitando la calificación y devuelve el valor ingresado.

### 1.5 Método `calcularMedia`:

- Recibe un `ArrayList` de calificaciones como parámetro.
- Utiliza un bucle `for-each` para sumar todas las calificaciones.
- Calcula la media dividiendo la suma por la cantidad de calificaciones y la devuelve.

En resumen, este programa permite al usuario ingresar calificaciones de estudiantes hasta que decide finalizar ingresando -1. Luego, muestra todas las calificaciones ingresadas junto con su media. Utiliza las clases `ArrayList` y `Scanner` para gestionar la entrada y almacenamiento de datos.

# Pseudocódigo

```java
función calcularMediaCalificaciones():
    calificaciones = []
    nota = obtenerNota()

    mientras nota ≠ -1:
        calificaciones.agregar(nota)
        nota = obtenerNota()

    media = calcularMedia(calificaciones)

    imprimir("Calificaciones: ")
    para cada calificación en calificaciones:
        imprimir(calificacion + " ")

    imprimir("-Media: " + media)

calcularMediaCalificaciones()
```

# Diagrama UML

El diagrama se encuentra dentro del paquete del ejercicio, en un archivo.puml (`diagramaUML.puml`).


# Ejercicio 4: Simulador de Elecciones Electrónicas

Este código Java implementa un simulador simple de elecciones electrónicas. Aquí hay una explicación detallada:

## 1. Paquete y Clase

- El código está contenido en el paquete `ejercicio4`.
- La clase principal se llama `SimuladorEleccionesElectronicas`.

## 2. Método `main`

- El método `main` es el punto de entrada del programa.
- Llama al método `simularElecciones` para iniciar la simulación de las elecciones.

## 3. Método `simularElecciones`

- Declara un `HashMap` llamado `votos` para almacenar los votos de los candidatos. La clave es el nombre del candidato (representado como una cadena) y el valor es el número de votos que ha recibido ese candidato.
- Establece un `codigoEspecial` con el valor `68753421`, que se utilizará como criterio de salida del bucle de votación.
- Utiliza un bucle `while` para permitir que los usuarios voten hasta que ingresen el código especial.
- Dentro del bucle, verifica si el voto ya está en el `HashMap`. Si es así, incrementa el número de votos para ese candidato; de lo contrario, agrega un nuevo candidato con un voto.
- Después de salir del bucle, llama al método `mostrarResultados` para mostrar los resultados de la votación.

## 4. Método `obtenerVoto`

- Crea un objeto `Scanner` para obtener la entrada del usuario desde la consola.
- Muestra las opciones de voto ("Opciones de voto: A, B, C, D, E.") y solicita al usuario que ingrese su voto o el código especial para finalizar.
- Convierte la entrada del usuario a mayúsculas antes de devolverla.

## 5. Método `mostrarResultados`

- Muestra los resultados de las elecciones utilizando un bucle `for` que itera sobre las entradas del `HashMap` que contiene los votos.
- Imprime en la consola el nombre del candidato, seguido por la cantidad de votos que ha recibido.

En resumen, este programa simula elecciones electrónicas donde los usuarios pueden votar por candidatos (representados por letras A, B, C, D, E) hasta que ingresen un código especial, y luego muestra los resultados de la votación.

# Pseudocódigo

```java
fución simularElecciones():
    votos = diccionario vacío
    código_especial = 68753421
    voto = obtenerVoto()

    mientras voto ≠ coódigo_especial:
        si voto en votos:
            votos[voto] += 1
        si no:
            votos[voto] = 1
        voto = obtenerVoto()

    mostrarResultados(votos)

función obtenerVoto():
    imprimir("Opciones de voto: A, B, C, D, E.")
    imprimir("Ingrese el voto (o ingrese el código especial para finalizar): ")
    returnar entrada_del_usuario().convertit_a_mayúsculas()

función mostrarResultados(votos):
    imprimir("Resultados de las elecciones:")
    para cada candidato, cantidad_votos en votos:
        imprimir("Candidato " + candidato + ": " + cantidad_votos + " votos")

simularElecciones()
```

# Diagrama UML

El diagrama se encuentra dentro del paquete del ejercicio, en un archivo.puml (`diagramaUML.puml`).
