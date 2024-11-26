public class Nota {
    String catedra;
    double notaExamen;

    // Constructor
    public Nota(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }

    // Método para imprimir los detalles de la nota
    public void imprimirNota() {
        System.out.println("Cátedra: " + catedra + " - Nota: " + notaExamen);
    }
}

