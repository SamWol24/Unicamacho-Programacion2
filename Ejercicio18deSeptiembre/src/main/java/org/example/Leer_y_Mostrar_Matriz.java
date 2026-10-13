package org.example;

import java.util.Scanner;

public class Leer_y_Mostrar_Matriz {
    static void main() {

        // Creamos un objeto Scanner para leer los datos
        // que el usuario ingresa por teclado.
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario la cantidad de filas que tendrá la matriz.
        System.out.print("Ingrese el número de filas: ");

        // Leemos el número de filas y lo guardamos en la variable filas.
        int filas = sc.nextInt();

        // Pedimos al usuario la cantidad de columnas que tendrá la matriz.
        System.out.print("Ingrese el número de columnas: ");

        // Leemos el número de columnas y lo guardamos en la variable columnas.
        int columnas = sc.nextInt();

        // Creamos la matriz de números enteros utilizando
        // la cantidad de filas y columnas indicada por el usuario.
        int[][] matriz = new int[filas][columnas];

        // PRIMER FOR:
        // Este ciclo se utiliza para recorrer las filas de la matriz.
        for (int i = 0; i < filas; i++) {

            // SEGUNDO FOR:
            // Este ciclo se utiliza para recorrer las columnas
            // de la fila actual.
            for (int j = 0; j < columnas; j++) {

                // Pedimos al usuario el valor que se almacenará
                // en la posición actual de la matriz.
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");

                // Leemos el número ingresado y lo guardamos
                // en la posición correspondiente de la matriz.
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostramos un mensaje antes de imprimir la matriz.
        System.out.println("Matriz:");

        // PRIMER FOR:
        // Volvemos a recorrer las filas para mostrar la matriz.
        for (int i = 0; i < filas; i++) {

            // SEGUNDO FOR:
            // Recorremos todas las columnas de la fila actual.
            for (int j = 0; j < columnas; j++) {

                // Mostramos el elemento actual de la matriz.
                // Utilizamos un espacio para separar los números.
                System.out.print(matriz[i][j] + " ");
            }

            // Cuando terminamos una fila, hacemos un salto de línea
            // para comenzar a mostrar la siguiente fila.
            System.out.println();
        }
    }
}
