public class Ingrediente {
    String nombre;
    double cantidad;
    String unidadDeMedida;

    // Constructor
    public Ingrediente(String nombre, double cantidad, String unidadDeMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDeMedida = unidadDeMedida;
    }

    // Método para imprimir el ingrediente
    public void imprimirIngrediente() {
        System.out.println("Ingrediente: " + nombre + " - " + cantidad + " " + unidadDeMedida);
    }
}
