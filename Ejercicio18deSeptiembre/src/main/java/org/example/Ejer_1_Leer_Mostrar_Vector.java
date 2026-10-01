package org.example;

// Importamos la clase Scanner.
// Scanner nos permite leer datos que el usuario escribe por el teclado.
import java.util.Scanner;

// Creamos una clase llamada Ejer_1_Leer_Mostrar_Vector
public class Ejer_1_Leer_Mostrar_Vector {

    // Este es el método principal del programa ejecuta el programa desde aqui.
    static void main(){
        // Creamos un objeto llamado "sc" de la clase Scanner.
        Scanner sc = new Scanner(System.in);

        // Pedimos el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");

        // nextInt() lee un número entero que el usuario escriba.
        // Ese número se guarda en la variable "n".
        int n = sc.nextInt();

        // creamos un vector llamado numeros, int[] significa que el vector solamente almacenará números enteros.
        int [] numeros = new int[n];

        // Iniciamos un ciclo for para recorrer todas las posiciones
        // del vector y pedirle al usuario un número para cada posición.
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        // mostrar los elementos del vector que estamos solicitando
        System.out.println("Elementos del vector:");
        // Creamos otro ciclo for para recorrer nuevamente
        // todas las posiciones del vector.
               for (int i = 0; i < n; i++){
                   // Mostramos el valor almacenado en la posición "i".
            System.out.print(numeros[i] + " ");
        }
    }
}
