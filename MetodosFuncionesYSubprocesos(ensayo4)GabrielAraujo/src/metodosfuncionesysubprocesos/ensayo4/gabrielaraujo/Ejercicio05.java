package metodosfuncionesysubprocesos.ensayo4.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double b = scanner.nextDouble();

        operaciones(a, b);

        scanner.close();
    }

    public static void operaciones(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}