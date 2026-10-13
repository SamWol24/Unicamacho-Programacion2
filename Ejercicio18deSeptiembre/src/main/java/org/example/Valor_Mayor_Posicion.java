package org.example;

import java.util.Scanner;

public class Valor_Mayor_Posicion {

    static void main() {

        // Creamos un objeto Scanner para leer los datos
        // que el usuario ingresa por teclado.
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario el número de filas.
        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();

        // Pedimos al usuario el número de columnas.
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        // Creamos la matriz utilizando las filas y columnas
        // indicadas por el usuario.
        int[][] matriz = new int[filas][columnas];

        // PRIMER FOR:
        // Recorremos las filas de la matriz.
        for (int i = 0; i < filas; i++) {

            // SEGUNDO FOR:
            // Recorremos las columnas de cada fila.
            for (int j = 0; j < columnas; j++) {

                // Pedimos el valor que corresponde
                // a la posición actual.
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");

                // Guardamos el valor ingresado en la matriz.
                matriz[i][j] = sc.nextInt();
            }
        }

        // Inicializamos el mayor con el primer elemento de la matriz.
        int mayor = matriz[0][0];

        // Guardamos la fila donde está el mayor.
        int filaMayor = 0;

        // Guardamos la columna donde está el mayor.
        int columnaMayor = 0;

        // Recorremos nuevamente todas las filas.
        for (int i = 0; i < filas; i++) {

            // Recorremos todas las columnas.
            for (int j = 0; j < columnas; j++) {

                // Comparamos el elemento actual con el mayor.
                if (matriz[i][j] > mayor) {

                    // Si encontramos un número más grande,
                    // actualizamos la variable mayor.
                    mayor = matriz[i][j];

                    // Guardamos la fila donde encontramos
                    // el nuevo valor mayor.
                    filaMayor = i;

                    // Guardamos la columna donde encontramos
                    // el nuevo valor mayor.
                    columnaMayor = j;
                }
            }
        }

        // Mostramos el resultado final.
        System.out.println("\nEl valor mayor es: " + mayor);
        System.out.println("Se encuentra en la fila: " + filaMayor);
        System.out.println("Se encuentra en la columna: " + columnaMayor);
    }
}
