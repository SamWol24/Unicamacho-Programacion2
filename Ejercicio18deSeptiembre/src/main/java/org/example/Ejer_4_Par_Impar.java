package org.example;

import java.util.Scanner;

public class Ejer_4_Par_Impar {
    static void main (){
        // Creamos un objeto Scanner para leer los datos por consola.
        Scanner sc = new Scanner(System.in);
        // Solicitamos el tamaño del vector.
        System.out.print("Inrese el tamaño del vector: ");
        // nextInt() lee el número entero ingresado por el usuario
        // y lo guarda en la variable n, que indica el tamaño del vector.
        int n = sc.nextInt();

        // Creamos un vector llamado numeros con n posiciones
        // para almacenar todos los números ingresados.
        int[] numeros = new int[n];
        // Creamos dos contadores que comienzan en cero:
        // pares contará los números pares e impares contará los impares. elementos.
        int pares = 0;
        int impares = 0;
        // Utilizamos este ciclo para repetir la solicitud de números
        // hasta llenar todas las posiciones del vector.
        // i comienza en 0, aumenta de uno en uno y termina cuando i llega a n.
        for (int i = 0; i < n; i++) {

            // Pedimos al usuario el número que se guardará en la posición actual.
            System.out.print("Ingrese el elemento " + i + ": ");

            // nextInt() lee el número ingresado y lo almacena
            // en la posición actual del vector, identificada por numeros[i]
            numeros[i] = sc.nextInt();
        }
        // Utilizamos otro ciclo para recorrer todos los números
        // que ya guardamos y determinar si cada uno es par o impar.
        for (int i = 0; i < n; i++) {

            // El operador % obtiene el residuo de la división entre 2.
            // Si el residuo es 0, el número es par
            if (numeros[i] % 2 == 0) {

                // Aumentamos en uno el contador de números pares.
                pares++;

            } else {
                // Si no es par, aumentamos el contador de números impares.
                impares++;
            }
        }

        // Mostramos la cantidad total de números pares encontrados.
        System.out.println("Cantidad de números pares: " + pares);

        // Mostramos la cantidad total de números impares encontrados.
        System.out.println("Cantidad de números impares: " + impares);

    }
}
