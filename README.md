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


# Ejercicio 5: Verificador de Palíndromos

El código Java proporcionado es un programa que verifica si una palabra ingresada por el usuario es un palíndromo. Un palíndromo es una palabra o frase que se lee igual de izquierda a derecha que de derecha a izquierda.

## 1. Importación de paquetes:

- Se especifica el paquete al que pertenece la clase y se importa la clase `Scanner` del paquete `java.util`, que se utilizará para leer la entrada del usuario.

## 2. Declaración de la clase principal:

- La clase principal se llama `VerificadorPalindromos`.

## 3. Método principal (main):

- Este método es el punto de entrada del programa. Aquí se solicita al usuario que ingrese una palabra, se lee la entrada y se llama a la función `esPalindromo` para verificar si es un palíndromo. Luego, se imprime el resultado.

## 4. Lectura de la palabra del usuario:

- Se crea un objeto `Scanner` para leer la entrada del usuario. Se muestra un mensaje solicitando al usuario que ingrese una palabra, y la entrada se almacena en la variable `palabra`.

## 5. Verificación de palíndromo:

- Se utiliza un condicional (`if`) para verificar si la palabra ingresada es un palíndromo utilizando la función `esPalindromo`. Dependiendo del resultado, se imprime un mensaje indicando si la palabra es o no un palíndromo.

## 6. Función `esPalindromo`:

- Esta función elimina espacios y convierte la palabra a minúsculas para evitar problemas de comparación. Luego, verifica si la palabra es igual a su versión invertida utilizando la función `invertir`.

## 7. Función `invertir`:

- La función `invertir` toma una cadena y la invierte caracter por caracter, utilizando un bucle `for` que comienza desde el último índice hasta el primero. La cadena invertida se devuelve como un objeto `String`.

En resumen, este programa verifica si una palabra ingresada por el usuario es un palíndromo, teniendo en cuenta la eliminación de espacios y la insensibilidad a mayúsculas y minúsculas.

# Pseudocódigo

```java
función esPalíndromo(palabra):
    palabra = eliminarEspacios(palabra)
    palabra = convertirAMinusculas(palabra)
    returnar palabra == invertir(palabra)

función eliminarEspacios(palabra):
    retornar palabra sin espacios


función convertirAMinusculas(palabra):
    returnar palabra en minúsculas

función invertir(cadena):
    invertida = cadena vacía
    para cada índice de i desde longitud(cadena) - 1 hasta 0 hacer
        agregar cadena[i] a invertida
    returnar invertida

procedimiento verificarPalindromo():
    palabra = obtenerPalabra()
    si esPalindromo(palabra):
        imprimir(palabra, " es un palíndromo.")
    si no:
        imprimir(palabra, " no es un palíndromo.")

procedimiento obtenerPalabra():
    imprimir("Ingrese una palabra: ")
    palabra = leerEntrada()
    retornar palabra

verificarPalindromo()
```

# Diagrama UML

El diagrama se encuentra dentro del paquete del ejercicio, en un archivo.puml (`diagramaUML.puml`).


# Ejercicio 6: Análisis de Algoritmo de Matrices

Este código Java es un programa simple que realiza operaciones básicas con matrices. Aquí está la explicación paso a paso:

## 1. Paquete y Clase:

El código está contenido en el paquete `ejercicio6` y define una clase llamada `AnalisisAlgoritmoMatrices`.

## 2. Método `main`:

El método `main` es el punto de entrada del programa. En este caso, simplemente llama al método `llenarMatriz()`.

## 3. Método `llenarMatriz`:

Este método crea una matriz bidimensional (`int[4][4]`) y la llena con valores ascendentes empezando desde 1. Utiliza dos bucles anidados (`for`) para recorrer las filas y columnas de la matriz, asignando el valor `val` a cada posición y aumentando `val` en 1 después de cada asignación. Luego, llama al método `imprimirMatriz` para mostrar la matriz en la consola.

## 4. Método `imprimirMatriz`:

Este método toma una matriz como parámetro y utiliza dos bucles anidados para recorrer las filas y columnas de la matriz. Imprime cada elemento de la matriz seguido por una tabulación (`\t`), lo que genera una presentación en forma de matriz. Después de imprimir una fila completa, agrega una nueva línea para pasar a la siguiente fila.

En resumen, este programa crea y llena una matriz 4x4 con valores ascendentes, y luego imprime esta matriz en la consola. Es un ejemplo básico de manipulación de matrices en Java.

# Pseudocódigo

```java
función llenarMatriz():
    matriz = crearMatriz(4, 4)
    val = 1

    para i de 0 a 3:
        para j de 0 a 3:
            matriz[i][j] = val
            val += 1

    imprimirMatriz(matriz)

función imprimirMatriz(matriz):
    para i de 0 a longitud(matriz) -1:
        para j de 0 a longitud(matriz[0]) -1:
            imprimir(matriz[i][j] + "\t")
        imprimir("\n")

llenarMatriz()
```

# Diagrama UML

El diagrama se encuentra dentro del paquete del ejercicio, en un archivo.puml (`diagramaUML.puml`).


# Ejercicio 7: Generador de Matrices Aleatorias

Este código Java genera una matriz de caracteres aleatorios de tamaño 20x30 y luego la muestra en la consola. Aquí está la explicación detallada del código:

## 1. Clase y Paquete

La clase se llama `GeneradorMatricesAleatorias` y está contenida en el paquete `ejercicio7`.

## 2. Método `main`

El método `main` es el punto de entrada del programa. En este caso, simplemente llama al método `generarMatrizAleatoria()`.

## 3. Método `generarMatrizAleatoria`

- Declara una matriz bidimensional de caracteres (`char`) de tamaño 20x30 llamada `matriz`.
- Utiliza dos bucles anidados (`for`) para iterar sobre cada posición de la matriz.
- En cada posición, llama al método `generarCaracterAleatorio()` para obtener un carácter aleatorio y lo asigna a la posición correspondiente en la matriz.
- Después de llenar la matriz, llama al método `mostrarMatriz(matriz)` para imprimir la matriz en la consola.

## 4. Método `generarCaracterAleatorio`

- Crea una instancia de la clase `Random` para generar números aleatorios.
- Utiliza `random.nextInt(26)` para obtener un número aleatorio entre 0 y 25 (inclusive), y luego le suma 'A' para obtener un valor entre 'A' y 'Z'. Devuelve este carácter aleatorio.

## 5. Método `mostrarMatriz`

- Utiliza bucles anidados para iterar sobre cada elemento de la matriz y lo imprime en la consola.
- Imprime un espacio después de cada carácter.
- Imprime una nueva línea después de cada fila para formar una matriz visualmente coherente en la consola.

En resumen, este programa crea y muestra una matriz de caracteres aleatorios, donde cada carácter es una letra mayúscula entre 'A' y 'Z'.

# Pseudocódigo

```java
función generarMatrizAleatoria():
    matriz = crearMatriz(20, 30)
    para i de 0 a 19:
        para j de 0 a 29:
            matriz[i][j] = generarCaracterAleatorio()
        mostrarMatriz(matriz)

función crearMatriz(filas, columnas):
    //Crea una matriz vacía con el tamaño especificado
    retornar nueva matriz de tamaño[filas, columnas]

función generarCaracterAleatorio():
    //Genera un carácter aleatorio entre 'A' y 'Z'
    retornar carácter aleatorio entre 'A' y 'Z'

función mostrarMatriz(matriz):
    para i de 0 a longitud de matriz - 1:
        para j de 0 a longitud de matriz [0] - 1:
            imprimir matriz[i][j] + " "
        imprimir nueva línea
```

# Diagrama UML

El diagrama se encuentra dentro del paquete del ejercicio, en un archivo.puml (`diagramaUML.puml`).


# Ejercicio 8: Juego de Batalla Naval Simplificado

Este código en Java implementa un juego de batalla naval simplificado para un solo jugador con un tablero de 4x4. A continuación, se proporciona una explicación detallada de cada parte del código:

## 1. Clase `JuegoBatallaNaval`

- **Método `main`:** Este método es el punto de entrada principal del programa. Llama al método `jugarBatallaNaval()` para iniciar el juego.
- **Método `jugarBatallaNaval`:** Contiene la lógica principal del juego. Inicia creando un tablero de 4x4 y eligiendo aleatoriamente la ubicación del barco. Entra en un bucle que solicita intentos al jugador hasta que este acierta la ubicación del barco. En cada iteración, se muestra el tablero, se toma un nuevo intento y se realiza la verificación correspondiente.
- **Método `crearTablero`:** Devuelve una matriz vacía de caracteres (char) con las dimensiones especificadas.
- **Método `elegirUbicacionAleatoria`:** Elige aleatoriamente una fila y una columna en el tablero y devuelve estas coordenadas como un arreglo de enteros.
- **Método `obtenerIntento`:** Solicita al jugador que ingrese las coordenadas del intento y devuelve estas coordenadas como un arreglo de enteros.
- **Método `marcarAgua`:** Marca la casilla del tablero con un 'O' indicando que el intento del jugador fue agua.
- **Método `marcarTocadoYHundido`:** Marca la casilla del tablero con un 'X' indicando que el intento del jugador acertó la ubicación del barco.
- **Método `mostrarTablero`:** Muestra el estado actual del tablero en la consola.
- **Método `esIgual`:** Compara dos conjuntos de coordenadas y devuelve true si son iguales, indicando que el intento del jugador coincide con la ubicación del barco.

## 2. Lecturas y Salidas

- Se utiliza la clase `Scanner` para leer las entradas del usuario desde la consola.
- Se utilizan diversas instrucciones de impresión (`System.out.println`) para mostrar mensajes en la consola.

## 3. Random

- Se utiliza la clase `Random` para generar números aleatorios y así elegir aleatoriamente la ubicación del barco.

## 4. Ejecución

- El programa comienza ejecutando el método `main`, que a su vez llama al método `jugarBatallaNaval()`.
- El juego continúa hasta que el jugador acierte la ubicación del barco.

Este código constituye una implementación básica de un juego de batalla naval en Java, con un enfoque interactivo y aleatorio para generar la ubicación del barco.

# Pseudocódigo

```java
función jugarBatallaNaval():
    tablero = crearTablero(4, 4)
    ubicacionBarco = elegirUbicacionAleatoria(tablero)
    intento = obtenerIntento()

    mientreas noEsIgual(intento, ubicacionBarco) hacer
        marcarAgua(tablero, intento)
        mostrarTablero(tablero)
        intento = obtenerIntento()

    marcarTocadoYHundido(tablero, intento)
    mostrarTablero(tablero)
    imprimir("Tocado y hundido - ¡Has ganado!")

función crearTablero(filas, columnas):
    retornar una matriz vacía de dimensiones filas x columnas

función elegirUbicacionAleatoria(tablero):
    fila = obtenerNumeroAleatorio(0, longitud(tablero) - 1)
    columna = obtenerNumeroAleatorio(0, longitud(tablero[0]) - 1)
    retornar una lista [fila, columna]

función obtenerIntento():
    imprimir("Ingrese una fila (0-3): ")
    fila = leerEnteroDesdeConsola()
    imprimir("Ingrese una columna (0-3): ")
    columna = leerEnteroDesdeConsola()
    retornar una lista [fila, columna]

función marcarAgua(tablero, coordenadas):
    tablero[coordenadas[0]][coordenadas[1]] = 'O'
    imprimir("Agua - Intenta de nuevo.")

función marcarTocadoYHundido(tablero, coordenadas):
    tablero[coordenadas[0]][coordenadas[1]] = 'X'

función mostrarTablero(tablero):
    imprimir("Tablero:")
    para cada fila en tablero hacer:
        para cada celda en fila hacer:
            imprimir(celda + " ")
        imprimir()

función esIgul(coordenadas1, coordenadas2):
retornar coordenadaas1[0] == coordenadas2[0] y coordenadas1[1] == coordenadas2[1]
```

# Diagrama UML

El diagrama se encuentra dentro del paquete del ejercicio, en un archivo.puml (`diagramaUML.puml`).
