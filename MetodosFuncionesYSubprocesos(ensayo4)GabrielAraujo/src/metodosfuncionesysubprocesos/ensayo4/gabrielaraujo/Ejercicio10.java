package metodosfuncionesysubprocesos.ensayo4.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();

        int resultado = mayor(a, b);

        System.out.println("El numero mayor es: " + resultado);

        scanner.close();
    }

    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}