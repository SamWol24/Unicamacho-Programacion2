package org.example;

import java.util.Scanner;

public class MenuConVectores {
static void main (){
    // Creamos el Scanner para leer los datos por consola.
    Scanner sc = new Scanner(System.in);

    // Declaramos el vector de numeros enteros llamado numeros sin crearlo todavía.
    // null quiere decir que no esta creado
    int[] numeros = null;

    // Esta variable opcion controla si el menú debe continuar.
    int opcion = 0;

    // El menú se repite mientras la opción sea diferente de 4.
    // Cuando opcion sea igual a 4, la condición será falsa y el ciclo terminará.
    while (opcion != 4) {

        // imprimimos el título para identificar el menú.
        // El \n genera un salto de línea antes del título.
        System.out.println("\n===== MENU DE VECTORES =====");
        System.out.println("1. Ingresar un vector de N numeros");
        System.out.println("2. Mostrar suma y promedio");
        System.out.println("3. Mostrar valor mayor y menor");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");

        // Leemos el número que escribe el usuario y lo guardamos en opcion.
        // nextInt() permite leer un número entero.
        opcion = sc.nextInt();

        // switch revisa el valor de opcion y ejecuta el caso que coincida con ese valor.
        switch (opcion) {

            // Si opcion vale 1, se ejecuta este bloque para crear y llenar el vector.
            case 1:
                // Pedimos el tamaño del vector.
                System.out.print("Ingrese el tamaño del vector: ");

                // Leemos el tamaño que escribe el usuario y lo guardamos en n.
                int n = sc.nextInt();

                // Verificamos que el tamaño sea positivo.
                if (n <= 0) {
                    System.out.println(
                            "Advertencia: el tamaño debe ser mayor que cero."
                    );
                    numeros = null;
                } else {
                    // Creamos el vector con el tamaño indicado.
                    // Si n es positivo, creamos un vector con n posiciones.
                    // Por ejemplo, si n es 4, se crean las posiciones 0, 1, 2 y 3.
                    numeros = new int[n];

                    // Capturamos los números del vector.
                    // El ciclo for recorre todas las posiciones del vector para llenarlas.
                    // int i = 0: comienza en la posición 0.
                    // i < n: continúa mientras i sea menor que el tamaño del vector.
                    // i++: aumenta i en uno después de cada repetición.
                    for (int i = 0; i < n; i++) {
                        System.out.print(
                                "Ingrese el elemento " + i + ": "
                        );
                        // Leemos el número escrito por el usuario.
                        // Guardamos el número ingresado en esa posición.
                        numeros[i] = sc.nextInt();
                    }


                }
                break;  // break termina el caso 1 para que no continúe con otros casos del switch.

            // Si opcion vale 2, se ejecuta este bloque para calcular la suma y el promedio.
            case 2:
                // Verificamos que el vector ya exista.
                // numeros == null significa que no tenemos un vector disponible.
                if (numeros == null) {
                    // Si el vector no existe, mostramos una advertencia y no hacemos cálculos.
                    System.out.println(
                            "Advertencia: primero debe ingresar el vector usando la opcion 1."
                    );
                } else {
                    int suma = 0;

                    // Sumamos todos los elementos del vector.
                    for (int i = 0; i < numeros.length; i++) {
                        // Sumamos el elemento actual al valor que ya tiene suma.
                        // Por ejemplo, si suma vale 5 y el elemento es 3, suma pasa a valer 8.
                        suma = suma + numeros[i];
                    }

                    // Convertimos la suma a double para calcular
                    // un promedio que pueda tener decimales.
                    double promedio = (double) suma / numeros.length;

                    // Mostramos en pantalla el resultado de la suma.
                    System.out.println("La suma es: " + suma);
                    // Mostramos en pantalla el promedio calculado.
                    System.out.println("El promedio es: " + promedio);
                }
                break;  // Terminamos el caso 2 y regresamos al menú.

            // Si opcion vale 3, se ejecuta este bloque para encontrar el mayor y el menor.
            case 3:
                // Verificamos que el vector ya exista.
                if (numeros == null) {
                    System.out.println(
                           "Advertencia: primero debe ingresar el vector usando la opcion 1."
                    );
                }else {
                    // Inicializamos mayor y menor con el primer elemento.
                    int mayor = numeros[0];
                    int menor = numeros[0];

                    // Comparamos los demás elementos del vector.
                    for (int i = 1; i < numeros.length; i++) {

                        if (numeros[i] > mayor) {
                            mayor = numeros[i];
                        }

                        if (numeros[i] < menor) {
                            menor = numeros[i];
                        }
                    }

                    System.out.println("El valor mayor es: " + mayor);
                    System.out.println("El valor menor es: " + menor);
                }
                break;

            case 4:
                // El usuario eligió salir del menú.
                System.out.println("Programa finalizado.");
                break;

        }
    }

    // Cerramos el Scanner al terminar el programa.
    sc.close();
}
}
