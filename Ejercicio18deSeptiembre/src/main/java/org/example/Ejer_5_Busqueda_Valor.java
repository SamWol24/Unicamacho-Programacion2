package org.example;

import java.util.Scanner;

public class Ejer_5_Busqueda_Valor {

    static void main() {

        // Creamos un objeto Scanner para leer los datos
        // que el usuario ingresa por teclado.
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario la cantidad de elementos
        // que tendrá el vector.
        System.out.print("Ingrese el tamaño del vector: ");

        // nextInt() lee el número ingresado por el usuario
        // y lo guarda en la variable n.
        int n = sc.nextInt();

        // Creamos el vector con la cantidad de posiciones
        // indicada por el usuario.
        int[] numeros = new int[n];

        // Utilizamos este ciclo para recorrer todas las posiciones
        // del vector y solicitar cada uno de sus elementos.
        for (int i = 0; i < n; i++) {

            // Pedimos al usuario el número correspondiente
            // a la posición actual del vector.
            System.out.print("Ingrese el elemento " + i + ": ");

            // Leemos el número ingresado y lo guardamos
            // en la posición actual del vector.
            numeros[i] = sc.nextInt();
        }

        // Pedimos al usuario el valor que desea buscar
        // dentro del vector.
        System.out.print("Ingrese el valor que desea buscar: ");
        int buscado = sc.nextInt();

        // Inicializamos posicion con -1.
        // -1 significa que todavía no hemos encontrado
        // el valor que estamos buscando.
        int posicion = -1;

        // SEGUNDO FOR:
        // Recorremos el vector para buscar el valor solicitado.
        for (int i = 0; i < n; i++) {

            // Comparamos el elemento actual del vector
            // con el valor que el usuario desea buscar.
            if (numeros[i] == buscado) {

                // Si encontramos el valor, guardamos su posición.
                posicion = i;

                // Detenemos el ciclo porque el ejercicio
                // solo necesita encontrar la primera posición.
                break;
            }
        }

        // Comprobamos si encontramos el valor.
        if (posicion != -1) {

            // Si posicion es diferente de -1, significa
            // que el valor sí existe en el vector.
            System.out.println("El valor existe.");

            // Mostramos la primera posición donde fue encontrado.
            System.out.println("Se encuentra en la posición: " + posicion);

        } else {

            // Si posicion continúa siendo -1, significa
            // que el valor no fue encontrado.
            System.out.println("El valor no existe en el vector.");
        }
    }
}
