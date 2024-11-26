import java.util.ArrayList;

public class Alumno {
    String nombreCompleto;
    long legajo;
    ArrayList<Nota> notas;

    // Constructor
    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    // Método para agregar una nota al alumno
    public void agregarNota(Nota nota) {
        this.notas.add(nota);
    }

    // Método para calcular el promedio de las notas del alumno
    public double calcularPromedio() {
        double sumaNotas = 0;
        for (Nota nota : notas) {
            sumaNotas += nota.notaExamen;
        }
        return notas.size() > 0 ? sumaNotas / notas.size() : 0;
    }

    // Método para imprimir los datos del alumno y las notas
    public void imprimirDatos() {
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Legajo: " + legajo);
        System.out.println("Notas:");
        for (Nota nota : notas) {
            nota.imprimirNota();
        }
        System.out.println("Promedio de Notas: " + calcularPromedio());
    }
}

