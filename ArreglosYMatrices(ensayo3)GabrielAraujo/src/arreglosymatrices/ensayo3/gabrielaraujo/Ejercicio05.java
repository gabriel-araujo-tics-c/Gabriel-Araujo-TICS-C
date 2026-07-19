package arreglosymatrices.ensayo3.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int numIngresado;
        
        System.out.println("--- Ingreso de 12 Numeros Positivos ---");
        
        for (int i = 0; i < 12; i++) {
            do {
                System.out.print("Ingrese un numero positivo para la posicion " + i + ": ");
                numIngresado = scanner.nextInt();
                
                if (numIngresado <= 0) {
                    System.out.println("Error: El numero debe ser mayor a cero. Intente de nuevo.");
                }
            } while (numIngresado <= 0);
            
            numeros[i] = numIngresado + i;
        }
        
        System.out.println("\n--- Arreglo Modificado Final ---");
        
        for (int i = 0; i < 12; i++) {
            System.out.println("Posicion " + i + " -> Valor almacenado: " + numeros[i]);
        }
        
        scanner.close();
    }
}