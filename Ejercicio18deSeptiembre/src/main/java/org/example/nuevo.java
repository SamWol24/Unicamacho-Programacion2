package org.example;

import java.util.Scanner;

public class nuevo {
    static void main(){
        // Creamos el Scanner para leer los datos que el usuario ingresa por consola.
        Scanner sc = new Scanner(System.in);

        // Declaramos el vector, pero todavía no lo creamos.
        // null significa que no hay ningún vector asignado a esta variable.
        int[] numeros = null;

        // Variable que guarda la opción seleccionada por el usuario.
        int opcion = 0;

        // Repetimos el menú mientras la opción sea diferente de 4.
        while (opcion != 4) {

            // Mostramos el título del menú.
            System.out.println("\n===== MENU DE VECTORES =====");

            // Mostramos las opciones disponibles.
            System.out.println("1. Ingresar un vector de N numeros");
            System.out.println("2. Mostrar suma y promedio");
            System.out.println("3. Mostrar valor mayor y menor");
            System.out.println("4. Salir");

            // Pedimos al usuario que seleccione una opción.
            System.out.print("Seleccione una opcion: ");

            // Leemos la opción ingresada por el usuario.
            opcion = sc.nextInt();

            // Ejecutamos el caso que corresponda a la opción seleccionada.
            switch (opcion) {

                case 1:

                    // Pedimos la cantidad de números que tendrá el vector.
                    System.out.print("Ingrese el tamaño del vector: ");

                    // Guardamos el tamaño ingresado por el usuario.
                    int n = sc.nextInt();

                    // Verificamos que el tamaño sea mayor que cero.
                    if (n <= 0) {

                        // Mostramos una advertencia si el tamaño no es válido.
                        System.out.println(
                                "Advertencia: el tamaño debe ser mayor que cero."
                        );

                        // Dejamos la variable sin un vector asignado.
                        numeros = null;

                    } else {

                        // Creamos un vector con la cantidad de posiciones indicada.
                        numeros = new int[n];

                        // Recorremos el vector para ingresar todos sus números.
                        for (int i = 0; i < n; i++) {

                            // Pedimos el número correspondiente a la posición actual.
                            System.out.print(
                                    "Ingrese el elemento " + i + ": "
                            );

                            // Leemos el número y lo guardamos en la posición i.
                            numeros[i] = sc.nextInt();
                        }

                        // Informamos que el vector se ingresó correctamente.
                        System.out.println("Vector ingresado correctamente.");
                    }

                    // Terminamos el caso 1.
                    break;

                case 2:

                    // Inicializamos la variable suma en cero.
                    // En ella acumularemos todos los números del vector.
                    int suma = 0;

                    // Recorremos el vector desde la posición 0 hasta la última.
                    // Si numeros sigue siendo null, esta instrucción causará un error.
                    for (int i = 0; i < numeros.length; i++) {

                        // Sumamos el elemento actual al acumulado.
                        suma = suma + numeros[i];
                    }

                    // Convertimos suma a double para calcular un promedio con decimales.
                    double promedio = (double) suma / numeros.length;

                    // Mostramos el resultado de la suma.
                    System.out.println("La suma es: " + suma);

                    // Mostramos el resultado del promedio.
                    System.out.println("El promedio es: " + promedio);

                    // Terminamos el caso 2.
                    break;

                case 3:

                    // Tomamos el primer elemento como valor inicial para mayor.
                    // Si el vector es null, acceder a numeros[0] causará un error.
                    int mayor = numeros[0];

                    // Tomamos el primer elemento como valor inicial para menor.
                    int menor = numeros[0];

                    // Recorremos los elementos restantes del vector.
                    // Comenzamos en 1 porque la posición 0 ya fue utilizada.
                    for (int i = 1; i < numeros.length; i++) {

                        // Si el elemento actual es mayor que mayor, lo actualizamos.
                        if (numeros[i] > mayor) {
                            mayor = numeros[i];
                        }

                        // Si el elemento actual es menor que menor, lo actualizamos.
                        if (numeros[i] < menor) {
                            menor = numeros[i];
                        }
                    }

                    // Mostramos el número mayor encontrado.
                    System.out.println("El valor mayor es: " + mayor);

                    // Mostramos el número menor encontrado.
                    System.out.println("El valor menor es: " + menor);

                    // Terminamos el caso 3.
                    break;

                case 4:

                    // Informamos que el programa va a finalizar.
                    System.out.println("Programa finalizado.");

                    // Terminamos el caso 4.
                    break;

                default:

                    // Se ejecuta cuando el usuario ingresa una opción no válida.
                    System.out.println(
                            "Opcion no valida. Intente nuevamente."
                    );
            }

            // Al terminar el switch, el while vuelve a comprobar su condición.
        }

        // Cerramos el Scanner al terminar el programa.
        sc.close();
    }
}