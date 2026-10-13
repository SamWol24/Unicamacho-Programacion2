package org.example;

import java.util.Scanner;

public class NotasDeEstudiantes {
    static void main() {

        // Creamos un objeto Scanner para leer los datos
        // que el usuario ingresa por teclado.
        Scanner sc = new Scanner(System.in);

        // 1. CAPTURAR ESTUDIANTES Y MATERIAS

        // Pedimos la cantidad de estudiantes.
        System.out.print("Ingrese el número de estudiantes: ");
        int estudiantes = sc.nextInt();

        // Pedimos la cantidad de materias.
        System.out.print("Ingrese el número de materias: ");
        int materias = sc.nextInt();

        // Creamos la matriz.
        // Las filas representan estudiantes
        // y las columnas representan materias.
        double[][] notas = new double[estudiantes][materias];

        // 2. CAPTURAR TODAS LAS CALIFICACIONES

        // Recorremos cada estudiante.
        for (int i = 0; i < estudiantes; i++) {

            // Recorremos cada materia del estudiante actual.
            for (int j = 0; j < materias; j++) {

                // Pedimos la calificación.
                System.out.print(
                        "Ingrese la nota del estudiante " + i +
                                " en la materia " + j + ": "
                );

                // Guardamos la calificación en la matriz.
                notas[i][j] = sc.nextDouble();
            }
        }


        // 3. PROMEDIO DE CADA ESTUDIANTE

        System.out.println("\nPromedio de cada estudiante:");

        // Recorremos cada estudiante.
        for (int i = 0; i < estudiantes; i++) {

            // Creamos un acumulador para sumar
            // las notas del estudiante actual.
            double suma = 0;

            // Recorremos todas las materias
            // del estudiante actual.
            for (int j = 0; j < materias; j++) {

                // Sumamos la nota actual.
                suma = suma + notas[i][j];
            }

            // Calculamos el promedio.
            double promedio = suma / materias;

            // Mostramos el promedio del estudiante.
            System.out.println(
                    "Estudiante " + i + ": " + promedio
            );
        }

        // 4. MATERIA CON EL PROMEDIO MÁS ALTO

        // Variable para guardar el promedio más alto
        // encontrado entre las materias.
        double mayorPromedioMateria = 0;

        // Variable para guardar la posición de la materia
        // que tiene el promedio más alto.
        int materiaMayorPromedio = 0;

        // Recorremos las materias.
        for (int j = 0; j < materias; j++) {

            // Acumulador para sumar las notas
            // de todos los estudiantes en esta materia.
            double sumaMateria = 0;

            // Recorremos todos los estudiantes.
            for (int i = 0; i < estudiantes; i++) {

                // Sumamos la nota del estudiante actual
                // en la materia actual.
                sumaMateria = sumaMateria + notas[i][j];
            }

            // Calculamos el promedio de esta materia.
            double promedioMateria = sumaMateria / estudiantes;

            // Comparamos el promedio de esta materia
            // con el mayor promedio encontrado.
            if (promedioMateria > mayorPromedioMateria) {

                // Guardamos el nuevo promedio mayor.
                mayorPromedioMateria = promedioMateria;

                // Guardamos la posición de la materia.
                materiaMayorPromedio = j;
            }
        }

        // Mostramos la materia con el promedio más alto.
        System.out.println(
                "\nLa materia con el promedio más alto es la materia "
                        + materiaMayorPromedio
        );

        System.out.println(
                "Su promedio es: " + mayorPromedioMateria
        );


        // 5. CALIFICACIÓN MÁS ALTA DE TODA LA MATRIZ


        // Inicializamos la calificación más alta
        // con la primera calificación de la matriz.
        double notaMayor = notas[0][0];

        // Guardamos la posición de la nota mayor.
        int estudianteNotaMayor = 0;
        int materiaNotaMayor = 0;

        // Recorremos todos los estudiantes.
        for (int i = 0; i < estudiantes; i++) {

            // Recorremos todas las materias.
            for (int j = 0; j < materias; j++) {

                // Comparamos la nota actual con la nota mayor.
                if (notas[i][j] > notaMayor) {

                    // Actualizamos la nota mayor.
                    notaMayor = notas[i][j];

                    // Guardamos el estudiante donde apareció.
                    estudianteNotaMayor = i;

                    // Guardamos la materia donde apareció.
                    materiaNotaMayor = j;
                }
            }
        }

        // Mostramos la calificación más alta.
        System.out.println(
                "\nLa calificación más alta es: " + notaMayor
        );

        System.out.println(
                "Estudiante: " + estudianteNotaMayor
        );

        System.out.println(
                "Materia: " + materiaNotaMayor
        );
    }
}
