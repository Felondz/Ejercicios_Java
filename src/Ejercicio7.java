import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner consulta = new Scanner(System.in);

        System.out.print("Ingrese el presupuesto anual del hospital en dolares americanos: ");
        double presupuestoTotal = consulta.nextDouble();

        double porcentajeGinecologia = 0.40;
        double porcentajeTraumatologia = 0.15;
        double porcentajePediatria = 0.15;
        double porcentajeUrgencias = 0.30;

        double presupuestoGinecologia = presupuestoTotal * porcentajeGinecologia;
        double presupuestoTraumatologia = presupuestoTotal * porcentajeTraumatologia;
        double presupuestoPediatria = presupuestoTotal * porcentajePediatria;
        double presupuestoUrgencias = presupuestoTotal * porcentajeUrgencias;

        System.out.println("\nDistribución del presupuesto:");
        System.out.printf("Ginecología: $%.2f%n", presupuestoGinecologia);
        System.out.printf("Traumatología: $%.2f%n", presupuestoTraumatologia);
        System.out.printf("Pediatría: $%.2f%n", presupuestoPediatria);
        System.out.printf("Urgencias: $%.2f%n", presupuestoUrgencias);

        consulta.close();
    }
}
