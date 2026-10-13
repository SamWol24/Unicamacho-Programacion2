package org.example;

import java.util.Scanner;

public class Matriz_Transpuesa {
    static void main() {

        // Creamos un objeto Scanner para leer los datos
        // que el usuario ingresa por teclado.
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario el número de filas
        // de la matriz original.
        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();

        // Pedimos al usuario el número de columnas
        // de la matriz original.
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        // Creamos la matriz original con las filas
        // y columnas indicadas por el usuario.
        int[][] matriz = new int[filas][columnas];

        // Capturamos los elementos de la matriz original.
        // El primer for recorre las filas.
        for (int i = 0; i < filas; i++) {

            // El segundo for recorre las columnas.
            for (int j = 0; j < columnas; j++) {

                // Pedimos cada elemento al usuario.
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");

                // Guardamos el elemento en la matriz original.
                matriz[i][j] = sc.nextInt();
            }
        }

        // Creamos la matriz transpuesta.
        // La cantidad de FILAS de la transpuesta será igual
        // a la cantidad de COLUMNAS de la matriz original.
        //
        // La cantidad de COLUMNAS de la transpuesta será igual
        // a la cantidad de FILAS de la matriz original.
        int[][] transpuesta = new int[columnas][filas];

        // Recorremos la matriz original para construir
        // la matriz transpuesta.
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                // Cambiamos la fila por la columna
                // y la columna por la fila.
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostramos la matriz original.
        System.out.println("\nMatriz original:");

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            // Saltamos a la siguiente línea después
            // de terminar cada fila.
            System.out.println();
        }

        // Mostramos la matriz transpuesta.
        System.out.println("\nMatriz transpuesta:");

        for (int i = 0; i < columnas; i++) {

            for (int j = 0; j < filas; j++) {

                System.out.print(transpuesta[i][j] + " ");
            }

            // Saltamos a la siguiente línea después
            // de terminar cada fila.
            System.out.println();
        }
    }
}
