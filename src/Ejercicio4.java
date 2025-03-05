import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner consulta = new Scanner(System.in);
        System.out.println("Bienvenido al programa de conversiones de magnitudes");

        do {
            System.out.println("Seleccione el tiopo de conversion que desea realizar: ");
            System.out.println("a. => Millas a Kilometros");
            System.out.println("b. => Kilometros a Millas");
            System.out.println("c. => Celsius a Farenheit");
            System.out.println("d. => Farenheit a Celsius");
            System.out.println("e. => Libras a Kilogramos");
            System.out.println("f. => Kilogramos a Libras");
            System.out.println("q. => Salir del programa");

            String seleccion = consulta.nextLine().toLowerCase();

            double cantidad, conversor;

            switch (seleccion) {
                case "a":
                    System.out.println("Ingrese la cantidad de Millas a convertir a Kilometros: ");
                    cantidad = consulta.nextDouble();
                    conversor = Longitud.kmToMill(cantidad);
                    System.out.println(cantidad + " Millas equivalen a " + conversor + " Kilometros.\n");
                    break;
                case "b":
                    System.out.println("Ingrese la cantidad de Kilometros a convertir a Millas: ");
                    cantidad = consulta.nextDouble();
                    conversor = Longitud.millToKm(cantidad);
                    System.out.println(cantidad + " Kilometros equivalen a " + conversor + " Millas.\n");

                    break;
                case "c":
                    System.out.println("Ingrese la cantidad de Celsius a convertir a Farenheit: ");
                    cantidad = consulta.nextDouble();
                    conversor = Temperatura.celToFarenh(cantidad);
                    System.out.println(cantidad + " Celsius equivalen a " + conversor + " Farenheit.\n");

                    break;
                case "d":
                    System.out.println("Ingrese la cantidad de Farenheit a convertir a Celsius: ");
                    cantidad = consulta.nextDouble();
                    conversor = Temperatura.farenhToCel(cantidad);
                    System.out.println(cantidad + " Farenheit equivalen a " + conversor + " Celsius.\n");

                    break;
                case "e":
                    System.out.println("Ingrese la cantidad de Libras a convertir a Kilogramos: ");
                    cantidad = consulta.nextDouble();
                    conversor = Masa.libraToKg(cantidad);
                    System.out.println(cantidad + " Libras equivalen a " + conversor + " Kilogramos.\n");

                    break;
                case "f":
                    System.out.println("Ingrese la cantidad de Kilogramos a convertir a Libras: ");
                    cantidad = consulta.nextDouble();
                    conversor = Masa.kgToLibra(cantidad);
                    System.out.println(cantidad + " Kilogramos equivalen a " + conversor + " Libras.\n");

                    break;
                case "q":
                    continuar = false;
                    System.out.println("Saliendo del programa...");

                    break;

                default:
                    System.out.println("Caractér ingresado no válido...");
                    continue;

            }
            consulta.nextLine();
        } while (continuar);
        consulta.close();

    }
}

class Longitud {
    static double millToKm(double milla) {
        return milla * 1.6;
    }

    static double kmToMill(double km) {
        return (km / 1.6);
    }
}

class Temperatura {
    static double celToFarenh(double celsius) {
        return ((celsius * 1.8) + 32);
    }

    static double farenhToCel(double farenheit) {
        return ((farenheit - 32) / 1.8);
    }
}

class Masa {
    static double libraToKg(double libra) {
        return (libra / 2.2046);
    }

    static double kgToLibra(double kg) {
        return kg * 2.2046;
    }
}
