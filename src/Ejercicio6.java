import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner consulta = new Scanner(System.in);
        double suma = 0;
        int totalNotas = 5;

        for (int i = 1; i <= totalNotas; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            double nota = consulta.nextDouble();

            while (nota < 1.0 || nota > 5.0) {
                System.out.print("Nota inválida. Ingrese un valor entre 1.0 y 5.0: ");
                nota = consulta.nextDouble();
            }

            suma += nota;
        }

        double promedio = suma / totalNotas;

        String escala;
        if (promedio >= 1.0 && promedio <= 2.0) {
            escala = "Deficiente";
        } else if (promedio >= 2.1 && promedio <= 2.9) {
            escala = "Insuficiente";
        } else if (promedio >= 3.0 && promedio <= 3.9) {
            escala = "Aceptable";
        } else if (promedio >= 4.0 && promedio <= 4.9) {
            escala = "Sobresaliente";
        } else {
            escala = "Excelente";
        }

        System.out.printf("\nPromedio: %.2f - Nivel: %s\n", promedio, escala);

        consulta.close();
    }
}
