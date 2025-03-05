import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio1 {
    // Conversor de divisas tener en cuenta usar siempre la coma como punto decimal,
    // por cuestiones regionales
    public static void main(String[] args) {
        Boolean funcionando = true;
        Scanner consulta = new Scanner(System.in);
        do {
            System.out.println("Ingrese la moneda que necesita cambiar: ");
            System.out.println("a. => USD Dolares Norteamericanos");
            System.out.println("b. => EUR Euros");
            System.out.println("c. => JPY Yenes");
            System.out.println("d. => GBP Libras Esterlinas");
            System.out.println("e. => CHF Franco Suizo");
            System.out.println("f. => RUB Rublo Ruso");
            System.out.println("q. => Cerrar programa");

            String moneda = consulta.nextLine().trim().toLowerCase();
            if (!moneda.equals("q")) {
                double cantidad = 0;
                System.out.println("Cuantos pesos desea cambiar?: ");
                while (!consulta.hasNextDouble()) {
                    System.out.println("Por favor, ingrese un número válido para la cantidad.");
                    consulta.next();
                }

                cantidad = consulta.nextDouble();
                consulta.nextLine();
                System.out.println("Ingrese la tasa de cambio actual en valores de pesos: ");
                double conversor = 0;
                while (!consulta.hasNextDouble()) {
                    System.out.println("Por favor, ingrese un número válido para la tasa de cambio.");
                    consulta.next();
                }

                conversor = consulta.nextDouble();
                consulta.nextLine();
                DecimalFormat df = new DecimalFormat("#.##");
                String resultado = df.format(cantidad * (1 / conversor));

                switch (moneda) {
                    case "a":
                        System.out.println("La cantidad de Dolares a cambiar son " + " " + resultado);

                        break;
                    case "b":
                        System.out.println("La cantidad de Euros a cambiar son " + " " + resultado);

                        break;
                    case "c":
                        System.out.println("La cantidad de Yenes a cambiar son " + " " + resultado);

                        break;
                    case "d":
                        System.out.println("La cantidad de Libras a cambiar son " + " " + resultado);

                        break;
                    case "e":
                        System.out.println("La cantidad de Francos Suizos a cambiar son " + " " + resultado);

                        break;
                    case "f":
                        System.out.println("La cantidad de Rublos a cambiar son " + " " + resultado);

                        break;

                    default:
                        System.out.println(
                                "Opcion seleccionada no reconocida, por favor ingrese un valor de la (a) a la (f)");
                        break;
                }
                System.out.println();
            } else {
                System.out.println("Cerrando programa...");
                funcionando = false;
            }

        } while (funcionando);
        consulta.close();

    }
}