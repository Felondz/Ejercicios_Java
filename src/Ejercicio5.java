import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner consulta = new Scanner(System.in);
        System.out.println("Bienvenido al programa de cálculo de áreas");

        do {
            System.out.println("Seleccione el tipo de área a calcular: ");
            System.out.println("a. => Área de un Rombo.");
            System.out.println("b. => Área de un Pentágono.");
            System.out.println("c. => Área de un Trapecio.");
            System.out.println("d. => Área de un Cilindro.");
            System.out.println("q. => Salir del programa");

            String seleccion = consulta.nextLine().toLowerCase();

            double a, b, c, area;

            switch (seleccion) {
                case "a":
                    System.out.println("Ingrese la diagonal mayor del rombo en centimetros: ");
                    a = consulta.nextDouble();
                    consulta.nextLine();
                    System.out.println("Ingrese la diagonal del rombo menor en centimetros: ");
                    b = consulta.nextDouble();
                    area = Areas.rombo(a, b);
                    System.out.println("El área del rombo son " + area + " centimetros cuadrados.\n");
                    break;
                case "b":
                    System.out.println("Ingrese la longitud de un lado del pentágono en centimetros: ");
                    a = consulta.nextDouble();
                    consulta.nextLine();
                    System.out.println("Ingrese la longitud de la apotema del pentágono en centimetros: ");
                    b = consulta.nextDouble();
                    area = Areas.pentagono(a, b);
                    System.out.println("El área del pentágono son " + area + " centimetros cuadrados.\n");

                    break;
                case "c":
                    System.out.println("Ingrese la longitud de la base mayor del trapecio en centimetros: ");
                    a = consulta.nextDouble();
                    consulta.nextLine();
                    System.out.println("Ingrese la longitud de la base menor del trapecio en centimetros: ");
                    b = consulta.nextDouble();
                    consulta.nextLine();
                    System.out.println("Ingrese la longitud de la altura del trapecio en centimetros: ");
                    c = consulta.nextDouble();
                    area = Areas.trapecio(a, b, c);
                    System.out.println("El área del trapecio son " + area + " centimetros cuadrados.\n");

                    break;
                case "d":
                    System.out.println("Ingrese la longitud del radio del cilindro en centimetros: ");
                    a = consulta.nextDouble();
                    consulta.nextLine();
                    System.out.println("Ingrese la longitud de la altura del cilindro en centimetros: ");
                    b = consulta.nextDouble();
                    area = Areas.cilindro(a, b);
                    System.out.println("El área del pentágono son " + area + " centimetros cuadrados.\n");

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

class Areas {
    static double rombo(double diagMayor, double diagMenor) {
        return (diagMayor * diagMenor) / 2;
    }

    static double pentagono(double lado, double apotema) {
        return (5 * lado * apotema) / 2;
    }

    static double trapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    static double cilindro(double radio, double altura) {
        double pi = 3.1416;
        return 2 * pi * radio * (altura + radio);
    }
}
