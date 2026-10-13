package org.example;

import java.util.Scanner;

public class Suma_De_Matrices {
    static void main() {

        // Creamos un objeto Scanner para leer los datos
        // que el usuario ingresa por teclado.
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario el número de filas de la matriz.
        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();

        // Pedimos al usuario el número de columnas de la matriz.
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        // Creamos la matriz utilizando las filas y columnas
        // que indicó el usuario.
        int[][] matriz = new int[filas][columnas];

        // Creamos una variable para acumular la suma
        // de todos los elementos de la matriz.
        int suma = 0;

        // PRIMER FOR:
        // Recorremos las filas de la matriz.
        for (int i = 0; i < filas; i++) {

            // SEGUNDO FOR:
            // Recorremos las columnas de la fila actual.
            for (int j = 0; j < columnas; j++) {

                // Pedimos al usuario el elemento que corresponde
                // a la posición actual de la matriz.
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");

                // Leemos el número y lo guardamos en la matriz.
                matriz[i][j] = sc.nextInt();

                // Sumamos el elemento actual a la variable suma.
                suma = suma + matriz[i][j];
            }
        }

        // Mostramos la suma total de todos los elementos.
        System.out.println("La suma total de la matriz es: " + suma);
    }
}
