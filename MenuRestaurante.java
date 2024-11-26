import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<>();
        int cantidadPlatos;

        // Solicitar la cantidad de platos a cargar
        System.out.print("Ingrese la cantidad de platos en el menú: ");
        cantidadPlatos = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        // Cargar los platos en el menú
        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.println("\nIngrese los datos del plato " + (i + 1));

            System.out.print("Nombre del plato: ");
            String nombreCompleto = scanner.nextLine();

            System.out.print("Precio del plato: ");
            double precio = scanner.nextDouble();

            System.out.print("¿Es una bebida? (true/false): ");
            boolean esBebida = scanner.nextBoolean();
            scanner.nextLine();  // Limpiar el buffer

            Plato plato = new Plato(nombreCompleto, precio, esBebida);

            if (!esBebida) {
                // Si el plato no es una bebida, solicitar los ingredientes
                int cantidadIngredientes;
                System.out.print("Ingrese la cantidad de ingredientes para " + nombreCompleto + ": ");
                cantidadIngredientes = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer

                // Validación para asegurar que se ingrese al menos un ingrediente
                if (cantidadIngredientes < 1) {
                    System.out.println("Debe ingresar al menos un ingrediente.");
                    cantidadIngredientes = 1;  // Forzar al menos un ingrediente
                }

                // Cargar los ingredientes del plato
                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.print("Ingrese el nombre del ingrediente " + (j + 1) + ": ");
                    String nombreIngrediente = scanner.nextLine();

                    System.out.print("Ingrese la cantidad del ingrediente " + (j + 1) + ": ");
                    double cantidad = scanner.nextDouble();
                    scanner.nextLine();  // Limpiar el buffer

                    System.out.print("Ingrese la unidad de medida del ingrediente " + (j + 1) + ": ");
                    String unidadDeMedida = scanner.nextLine();

                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidad, unidadDeMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }

            // Agregar el plato al menú
            platosMenu.add(plato);
        }

        // Imprimir el menú del restaurante
        System.out.println("\nMenú del Restaurante:");
        for (Plato plato : platosMenu) {
            plato.imprimirPlato();
            System.out.println();
        }

        scanner.close();
    }
}
