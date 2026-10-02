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
        // Creamos una variable para acumular la suma.
        int suma = 0;
        // Solicitamos los números y los guardamos en el vector mas la suma.
        for (int i = 0; i < n; i++){
            System.out.print("Ingrese el elemento " + i + ": ");
            numeros[i] = sc.nextInt();
            // sumamos el numero ingresado al acumulador.
            suma = suma + numeros[i];

        }
        // se calcula el promedio usando double para permitir decimales.
        double promedio = (double) suma / n;

        // Inicializamos el mayor y el menor con el primer elemento.
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorremos el vector desde la segunda posición por que la primera posicion esta inicializada para las variables mayor y menor.
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
        // Imprimimos la suma de los elementos
        System.out.println("La suma es: " + suma);
        // imprimimos el promedio
        System.out.println("El promedio es: " + promedio);
        // Imprimimos el valor más grande .
        System.out.println("El valor mayor es: " + mayor);
        // Imprimimos el valor más pequeño.
        System.out.println("El valor menor es: " + menor);
        // imprimimos todos los elementos del vector
        System.out.println("Los elementos del vector son: ");
        // Recorremos el vector desde la posición 0 hasta la última posición.
        // La variable i aumenta de uno en uno mientras sea menor que n.
        for (int i = 0; i < n; i++) {
            // Mostramos el número almacenado en la posición actual del vector.
            System.out.print(numeros[i] + " ");
        }

    }
}
