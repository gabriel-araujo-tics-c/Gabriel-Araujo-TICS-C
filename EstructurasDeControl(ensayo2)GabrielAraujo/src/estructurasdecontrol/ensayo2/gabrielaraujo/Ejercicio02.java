package estructurasdecontrol.ensayo2.gabrielaraujo;

/**
 * @author GABRIEL ARAUJO TICS C
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = entrada.nextInt();

        System.out.println("--- Resultados ---");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("Division: " + ((double)num1 / num2));
            System.out.println("Residuo: " + (num1 % num2));
        } else {
            System.out.println("División: No se puede dividir entre cero.");
            System.out.println("Residuo: No se puede calcular (división por cero).");
        }

        entrada.close();
    }
}