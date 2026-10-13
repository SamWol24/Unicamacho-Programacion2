package org.example;

import java.util.Scanner;

public class Suma_De_Diagonal {
    static void main() {

        // Creamos un objeto Scanner para leer los datos
        // que el usuario ingresa por teclado.
        Scanner sc = new Scanner(System.in);

        // Como la matriz debe ser cuadrada,
        // solamente necesitamos pedir un tamaño.
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = sc.nextInt();

        // Creamos la matriz.
        // Como es cuadrada, tendrá n filas y n columnas.
        int[][] matriz = new int[n][n];

        // Variable que utilizaremos para acumular
        // la suma de los elementos de la diagonal principal.
        int suma = 0;

        // PRIMER FOR:
        // Recorremos las filas de la matriz.
        for (int i = 0; i < n; i++) {

            // SEGUNDO FOR:
            // Recorremos las columnas de la matriz.
            for (int j = 0; j < n; j++) {

                // Pedimos al usuario cada elemento de la matriz.
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");

                // Guardamos el número ingresado
                // en la posición correspondiente.
                matriz[i][j] = sc.nextInt();
            }
        }

        // Recorremos la matriz para buscar los elementos
        // que pertenecen a la diagonal principal.
        for (int i = 0; i < n; i++) {

            // En la diagonal principal la fila y la columna
            // tienen siempre el mismo número.
            suma = suma + matriz[i][i];
        }

        // Mostramos el resultado de la suma.
        System.out.println("La suma de la diagonal principal es: " + suma);
    }
}
