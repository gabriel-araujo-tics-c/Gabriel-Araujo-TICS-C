package metodosfuncionesysubprocesos.ensayo4.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();

        double area = calcularArea(base, altura);

        System.out.println("El area del rectangulo es: " + area);

        scanner.close();
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
}