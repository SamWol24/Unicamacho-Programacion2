package org.example;

import java.util.Scanner;

public class Suma_Filas_Columnas {

    static void main() {

        // Creamos un objeto Scanner para leer los datos
        // que el usuario ingresa por teclado.
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario el número de filas que tendrá la matriz.
        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();

        // Pedimos al usuario el número de columnas que tendrá la matriz.
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        // Creamos la matriz utilizando la cantidad de filas
        // y columnas que indicó el usuario.
        int[][] matriz = new int[filas][columnas];

        // PRIMER FOR:
        // Recorremos cada una de las filas de la matriz.
        for (int i = 0; i < filas; i++) {

            // SEGUNDO FOR:
            // Recorremos cada columna de la fila actual.
            for (int j = 0; j < columnas; j++) {

                // Pedimos al usuario el número que corresponde
                // a la posición actual de la matriz.
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");

                // Guardamos el número ingresado en la posición
                // correspondiente de la matriz.
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostramos la matriz que el usuario ingresó.
        System.out.println("\nMatriz:");

        // Recorremos nuevamente todas las filas.
        for (int i = 0; i < filas; i++) {

            // Recorremos todas las columnas de la fila actual.
            for (int j = 0; j < columnas; j++) {

                // Mostramos el elemento actual de la matriz.
                System.out.print(matriz[i][j] + " ");
            }

            // Después de terminar una fila, hacemos un salto de línea.
            System.out.println();
        }

        // --------------------------------------------------
        // SUMA DE CADA FILA
        // --------------------------------------------------

        System.out.println("\nSuma de cada fila:");

        // Recorremos cada fila de la matriz.
        for (int i = 0; i < filas; i++) {

            // Creamos un acumulador para la fila actual.
            // Cada fila debe comenzar su suma desde cero.
            int sumaFila = 0;

            // Recorremos todas las columnas de la fila actual.
            for (int j = 0; j < columnas; j++) {

                // Sumamos el elemento actual al acumulador.
                sumaFila = sumaFila + matriz[i][j];
            }

            // Mostramos la suma de la fila actual.
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        // --------------------------------------------------
        // SUMA DE CADA COLUMNA
        // --------------------------------------------------

        System.out.println("\nSuma de cada columna:");

        // Recorremos cada columna de la matriz.
        for (int j = 0; j < columnas; j++) {

            // Creamos un acumulador para la columna actual.
            // Cada columna debe comenzar su suma desde cero.
            int sumaColumna = 0;

            // Recorremos todas las filas de la columna actual.
            for (int i = 0; i < filas; i++) {

                // Sumamos el elemento actual al acumulador.
                sumaColumna = sumaColumna + matriz[i][j];
            }

            // Mostramos la suma de la columna actual.
            System.out.println("Columna " + j + ": " + sumaColumna);
        }
    }
}
