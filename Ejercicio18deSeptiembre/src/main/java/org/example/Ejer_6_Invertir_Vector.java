package org.example;

import java.util.Scanner;

public class Ejer_6_Invertir_Vector {
    static void main() {

        // Creamos un objeto Scanner para leer los datos
        // que el usuario ingresa por teclado.
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario la cantidad de elementos
        // que tendrá el vector.
        System.out.print("Ingrese el tamaño del vector: ");

        // nextInt() lee el número ingresado y lo guarda
        // en la variable n.
        int n = sc.nextInt();

        // Creamos el vector con el tamaño indicado por el usuario.
        int[] numeros = new int[n];

        // Utilizamos este ciclo para recorrer las posiciones
        // del vector y solicitar cada uno de sus elementos.
        for (int i = 0; i < n; i++) {

            // Pedimos al usuario el número correspondiente
            // a la posición actual.
            System.out.print("Ingrese el elemento " + i + ": ");

            // Leemos el número ingresado y lo guardamos
            // en la posición actual del vector.
            numeros[i] = sc.nextInt();
        }

        // Mostramos un mensaje para indicar que ahora
        // vamos a mostrar el vector en orden inverso.
        System.out.println("Elementos del vector en orden inverso:");


        // Comenzamos desde la última posición del vector
        // y vamos retrocediendo hasta llegar a la posición 0.
        for (int i = n - 1; i >= 0; i--) {

            // Mostramos el elemento que se encuentra
            // en la posición actual del vector.
            System.out.print(numeros[i] + " ");
        }

        // Dejamos el cursor en una nueva línea después
        // de mostrar todos los elementos.
        System.out.println();
    }
}
