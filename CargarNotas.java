import java.util.ArrayList;
import java.util.Scanner;

public class CargarNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        int cantidadAlumnos;

        System.out.print("Ingrese la cantidad de alumnos: ");
        cantidadAlumnos = scanner.nextInt();

        // Bucle para cargar los alumnos
        for (int i = 0; i < cantidadAlumnos; i++) {
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese el nombre completo del alumno " + (i + 1) + ": ");
            String nombreCompleto = scanner.nextLine();

            System.out.print("Ingrese el legajo del alumno " + (i + 1) + ": ");
            long legajo = scanner.nextLong();

            Alumno alumno = new Alumno(nombreCompleto, legajo);

            // Cargar las notas del alumno
            int cantidadNotas;
            System.out.print("Ingrese la cantidad de notas para el alumno " + nombreCompleto + ": ");
            cantidadNotas = scanner.nextInt();

            // Validación de que haya al menos una nota
            if (cantidadNotas < 1) {
                System.out.println("Debe ingresar al menos una nota.");
                cantidadNotas = 1; // Forzar al menos una nota
            }

            for (int j = 0; j < cantidadNotas; j++) {
                scanner.nextLine(); // Limpiar el buffer
                System.out.print("Ingrese la cátedra de la nota " + (j + 1) + ": ");
                String catedra = scanner.nextLine();

                System.out.print("Ingrese la nota del examen para la cátedra " + catedra + ": ");
                double notaExamen = scanner.nextDouble();

                Nota nota = new Nota(catedra, notaExamen);
                alumno.agregarNota(nota);
            }

            // Agregar el alumno a la lista de alumnos
            alumnos.add(alumno);
        }

        // Mostrar los datos cargados
        System.out.println("\nInformación de los Alumnos:");
        for (Alumno alumno : alumnos) {
            alumno.imprimirDatos();
            System.out.println();
        }

        scanner.close();
    }
}
