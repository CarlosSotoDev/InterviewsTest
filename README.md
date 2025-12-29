# Simulación de viajes de IDA y VUELTA

Descripción
1. Este programa simula viajes de IDA y VUELTA desde la posición 0 hasta una serie de objetivos enteros positivos.
2. Valida que el arreglo de objetivos no contenga valores inválidos (<= 0). Si encuentra valores inválidos, informa y termina.
3. Para cada objetivo válido realiza:
    1. IDA: incrementa la posición hasta alcanzar el objetivo, imprimiendo cada paso.
    2. VUELTA: decrementa la posición hasta regresar a 0, imprimiendo cada paso.

Archivo principal
- `src/main/java/org/example/Main.java`

Requisitos
1. Java 11 (o superior).
2. Maven 3.x.

Compilar
1. Abrir una terminal en la raíz del proyecto.
2. Ejecutar:
    1. `mvn clean compile`

Ejecutar
1. Ejecutar con Maven:
    1. `mvn exec:java -Dexec.mainClass="org.example.Main"`
2. O generar el jar y ejecutar:
    1. `mvn package`
    2. `java -cp target/<nombre-del-jar>.jar org.example.Main`

Comportamiento y salida esperada
1. El programa imprime un mensaje inicial con los objetivos.
2. Si hay números inválidos (<= 0), imprime un error por `System.err` indicando los valores inválidos y termina.
3. Para cada objetivo válido imprime:
    1. `Comenzando Viaje de IDA y vuelta para el objetivo: X`
    2. La secuencia de posiciones durante la IDA (desde 0 hasta X).
    3. La secuencia de posiciones durante la VUELTA (desde X hasta 0).
4. Mensaje final: `Viajes completados para todo los objetivos`

Ejemplo (cuando el arreglo contiene valores válidos)
1. Entrada: `[1, 2, 3]`
2. Salida (resumen):
    1. Mensaje inicial con los objetivos.
    2. Para cada objetivo muestra la IDA y la VUELTA paso a paso.
    3. Mensaje final indicando que se completaron todos los viajes.

Notas
1. El programa considera inválidos los valores `<= 0`. Si existen, no se procesa ningún objetivo.
2. Para cambiar los objetivos editar el arreglo dentro de `src/main/java/org/example/Main.java`.

Licencia
1. Incluya la licencia deseada en `LICENSE` si aplica.
