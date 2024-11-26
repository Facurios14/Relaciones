import java.util.ArrayList;

public class Plato {
    String nombreCompleto;
    double precio;
    boolean esBebida;
    ArrayList<Ingrediente> ingredientes;

    // Constructor
    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    // Método para agregar ingredientes
    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    // Método para imprimir los detalles del plato
    public void imprimirPlato() {
        System.out.println("Plato: " + nombreCompleto + " - Precio: $" + precio);
        if (esBebida) {
            System.out.println("Este es una bebida, no contiene ingredientes.");
        } else {
            System.out.println("Ingredientes:");
            for (Ingrediente ingrediente : ingredientes) {
                ingrediente.imprimirIngrediente();
            }
        }
    }
}
