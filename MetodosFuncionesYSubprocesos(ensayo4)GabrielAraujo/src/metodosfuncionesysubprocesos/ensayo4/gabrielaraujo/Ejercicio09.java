package metodosfuncionesysubprocesos.ensayo4.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Ingrese nota 2: ");
        double n2 = scanner.nextDouble();
        System.out.print("Ingrese nota 3: ");
        double n3 = scanner.nextDouble();

        double promedio = calcularPromedio(n1, n2, n3);

        System.out.println("Promedio: " + promedio);

        if (promedio >= 7) {
            System.out.println("El estudiante aprobo");
        } else {
            System.out.println("El estudiante reprobo");
        }

        scanner.close();
    }

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}