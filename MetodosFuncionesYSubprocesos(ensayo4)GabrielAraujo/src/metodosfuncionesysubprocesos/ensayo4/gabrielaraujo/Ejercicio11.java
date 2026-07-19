package metodosfuncionesysubprocesos.ensayo4.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (esPar(numero)) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }

        scanner.close();
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}