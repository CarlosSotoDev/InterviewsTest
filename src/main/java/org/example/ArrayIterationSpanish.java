package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIterationSpanish {
    public static void main(String[] args) {

        // Arreglo de objetivos a alcanzar en cada viaje (pueden contener objetivos inválidos)
        int[] targets = {1, 2, 3, -5, 5, -6};

        // Posición inicial desde donde se comienzan los viajes
        int startPosition = 0;

        // Mensaje inicial con los objetivos
        System.out.println("Comenzando viajes de IDA y de VUELTA para los elementos: " + Arrays.toString(targets));

        // Lista para acumular números inválidos encontrados en el arreglo
        List<Integer> invalidNumbers = new ArrayList<>();

        // Recorre los objetivos y agrega a la lista los que sean <= 0 (se consideran inválidos)
        for (int number : targets) {
            if (number <= 0) {
                invalidNumbers.add(number);
            }
        }

        // Si se encontraron números inválidos, se reportan y se termina la ejecución
        if (!invalidNumbers.isEmpty()) {
            System.err.println("El arreglo  de números contienen números negativos");
            System.err.println("Los números negativos dentro del programa son: " + invalidNumbers);
            return;
        }

        // Para cada objetivo válido realiza un viaje de IDA y VUELTA
        for (int target : targets) {

            System.out.println("Comenzando Viaje de IDA y vuelta para el objetivo: " + target);

            // IDA: incrementar la posición hasta alcanzar el objetivo
            System.out.println("IDA");
            while (startPosition < target) {
                System.out.println(startPosition); // muestra la posición actual antes de moverse
                startPosition++; // avanza una unidad hacia el objetivo
            }

            // Muestra la posición cuando se alcanza el objetivo
            System.out.println(startPosition);

            // VUELTA: decrementar la posición hasta regresar a 0
            System.out.println("VUELTA");
            while (startPosition > 0) {
                System.out.println(startPosition); // muestra la posición actual antes de retroceder
                startPosition--; // retrocede una unidad hacia 0
            }

            // Muestra la posición final después de la vuelta (debería ser 0)
            System.out.println(startPosition + "\n");
        }

        // Mensaje final indicando que se completaron todos los viajes
        System.out.println("Viajes completados para todo los objetivos");
    }
}
