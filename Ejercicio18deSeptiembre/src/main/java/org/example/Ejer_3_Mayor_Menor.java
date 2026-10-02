package org.example;

import java.util.Scanner;

public class Ejer_3_Mayor_Menor {
    static void main (){
        // Creamos un objeto Scanner para leer los datos por consola.
        Scanner sc = new Scanner(System.in);
        // Solicitamos el tamaño del vector.
        System.out.print("Inrese el amaño del vector: ");
        int n = sc.nextInt();

        // Creamos el vector con el tamaño indicado.
        int[] numeros = new int[n];
        // Solicitamos los números y los guardamos en el vector.
        for (int i = 0; i < n; i++){
            System.out.print("Ingrese el elemento " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        // Inicializamos el mayor y el menor con el primer elemento.
        int mayor = numeros[0];
        int menor = numeros[0];
        // Recorremos el vector desde la segunda posición.
        for ( int i = 1; i < n; i++){
            // Si el número actual es mayor, actualizamos mayor.
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            // Si el número actual es menor, actualizamos menor.
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

        }
        // Imprimimos el valor más grande .
        System.out.println("El valor mayor es: " + mayor);
        // Imprimimos el valor más pequeño.
        System.out.println("El valor menor es: " + menor);


    }
}
