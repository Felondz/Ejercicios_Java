import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la edad del infante cumpleañero: ");
    int edad = scanner.nextInt();
    int precios = 0;

    if (edad >= 0 && edad < 4){
        precios = 400000;
        System.out.println("La fiesta de cumpleaños tendrá incluido: ponque con cajita feliz y show de titeres "+" y tendrá un precio de "+precios);
    }else{
        if (edad >= 4 && edad <=10 ){
            precios=500000;
            System.out.println("La fiesta de cumpleaños tendrá incluido: ponque con cajita feliz y el show será animado por payasos"+" y tendrá un precio de "+precios);
        }else{
            precios = 600000;
            System.out.println("La fiesta de cumpleaños tendrá incluido: ponque con cajita feliz y el show será animado por cuentería"+" y tendrá un precio de "+precios);
        }
        
    }
    scanner.close();
    }
}