package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Programa que simula viajes de IDA y VUELTA desde la posición 0 hasta una serie de objetivos.
 * - Valida que el arreglo de objetivos no contenga valores inválidos (<= 0).
 * - Para cada objetivo, realiza la "IDA" incrementando la posición hasta el objetivo
 *   y luego la "VUELTA" decrementando la posición hasta 0.
 * - Imprime en consola el recorrido paso a paso.
 */
public class Main{
    public static void main(String[] args) {

        int[] targets = {1, 2, 3, 4, 5, 6};
        int startPosition = 0;


        //ELista para evaluar números invalidos
        List<Integer> invalidNumbers = new ArrayList<>();

        System.out.println("Evaluando los elementos dentro del arreglo: " + Arrays.toString(targets));

        //Evalua cada uno de los elementos del arreglo, se deja de ejecutar si hay un valor invalido
        for(int number : targets){
            if(number < startPosition){
                invalidNumbers.add(number);
            }
        }

        //Verificar si hay la lista a evaluar contiene numeros negativos
        if(!invalidNumbers.isEmpty()){
            System.err.println("El arreglo de números tiene valores invalidos");
            System.err.println("Los valores invalidos son: " + invalidNumbers);
            return;
        }

        //Si no hay numeros positivos continua la ejecución del programa y realiza la evaluación
        for(int target : targets){

            System.out.println("Evaluando el elemento: " + target);

            System.out.println("IDA");
            while(startPosition < target){
                System.out.println(startPosition);
                startPosition++;
            }
            System.out.println(startPosition);

            System.out.println("VUELTA");
            while(startPosition > 0){
                System.out.println(startPosition);
                startPosition--;
            }
            System.out.println(startPosition + "\n");
        }


    }
}
