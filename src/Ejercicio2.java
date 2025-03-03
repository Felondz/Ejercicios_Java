import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Ingrese que producto necesita: ");
        Map<String, Double> productos = new HashMap<>();

        productos.put("Manzana", 2000.0);
        productos.put("Pan", 4000.0);
        productos.put("Leche", 5000.0);
        productos.put("Arroz", 8000.0);
        productos.put("Pollo", 20000.0);
        productos.put("Queso", 12000.0);
        productos.put("Jugo de Naranja", 3500.0);
        productos.put("Cereal", 6000.0);
        productos.put("Yogurt", 2500.0);
        productos.put("Huevos", 3000.0);

        // Creamos una canasta
        Map<String, Integer> canasta = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        System.out.println("Bienvenido a la tuienda mi ACA POO");

        while (continuar) {
            // Imprimir los productos y sus precios
            System.out.println("Productos disponibles en la tienda:");
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                System.out.println(entry.getKey() + " - Precio: $" + entry.getValue());
            }
            System.out.println("\nIngrese el nombre del producto que desea agregar (o 'fin' para terminar)");
            String productoSeleccionado = scanner.nextLine().trim();

            if (productoSeleccionado.equalsIgnoreCase("fin")) {
                continuar = false;
                break;
            }

            if (productos.containsKey(productoSeleccionado)) {
                System.out.println("Ingrese la cantidad de " + productoSeleccionado + " que desea llevar: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine();

                canasta.put(productoSeleccionado, canasta.getOrDefault(productoSeleccionado, 0) + cantidad);
                System.out.println("Producto agregado a la canasta");

            } else {
                System.out.println("Producto seleccionado no disponible, revisar bien la digitación");
            }

            System.out.println("\n¿Desea agregar otro porducto a la canasta? (s/n: )");
            String masProductos = scanner.nextLine().trim();
            if (masProductos.equalsIgnoreCase("n")) {
                continuar = false;
            }

        }
        double total = 0;
        double iva = 0;
        double descuento = 0;

        System.out.println("\nTIENDA MI ACA POO");

        for (Map.Entry<String, Integer> entry : canasta.entrySet()) {
            String producto = entry.getKey();
            int cantidad = entry.getValue();
            double precio = productos.get(producto);
            double subtotal = precio * cantidad;
            total += subtotal;

            System.out.println("Producto: \t" + producto);
            System.out.println("Precio: \t" + precio + " COP");
            System.out.println("Cantidad: \t" + cantidad);
            System.out.println("Subtotal: \t" + subtotal + " COP");
            System.out.println();
        }
        iva = total * 0.19;

        if (total > 200000) {
            descuento = total * 0.10;
        }
        double totalConIvaYDescuento = total + iva - descuento;

        System.out.println("IVA (19%): \t" + iva + " COP");
        System.out.println("Descuento: \t" + descuento + " COP");
        System.out.println("Total a pagar: \t" + totalConIvaYDescuento + " COP");
        scanner.close();
    }
}
