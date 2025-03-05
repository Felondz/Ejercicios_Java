import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner consulta = new Scanner(System.in);
        System.out.println("Ingrese un número entero para que sea el límite: ");
        int limite = consulta.nextInt();

        System.out.println("Imprimiento números primos hasta " + limite + ":");
        consulta.close();

        for (int num = 2; num <= limite; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " \n");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
