package org.example;

import java.util.Scanner;

public class Ejer_2_suma_promedio {
    // Este es el método principal del programa ejecuta el programa desde aqui.
    static void main(){
        // Creamos un objeto llamado "sc" de la clase Scanner.
        Scanner sc = new Scanner(System.in);

        // Pedimos el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");

        // nextInt() lee un número entero que el usuario escriba.
        // Ese número se guarda en la variable "n".
        int n = sc.nextInt();

        // creamos un vector llamado numeros, int[] significa que el vector solamente almacenará números enteros.
        int [] numeros = new int[n];
        // variable para acumular la suma
        int suma = 0;

        // Iniciamos un ciclo for para recorrer todas las posiciones
        // del vector y pedirle al usuario un número para cada posición.
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + i + ": ");
            numeros[i] = sc.nextInt();
            // sumamos el elemento actual a la varioble
            suma = suma + numeros[i];
        }
        // calculamos el promedio usando double
         double promedio =(double) suma / n;

        // Mostramos la suma de todos los elementos
        System.out.println("La suma es: " + suma);
        // Mostramos el promedio
         System.out.println("El promedio es: " + promedio);


        // mostrar los elementos del vector que estamos solicitando
        System.out.println("Elementos del vector:");
        // Creamos otro ciclo for para recorrer nuevamente
        // todas las posiciones del vector.
        for (int i = 0; i < n; i++){
            // Mostramos el valor almacenado en la posición "i".
            System.out.print(numeros[i] + " ");
        }
    }
}
