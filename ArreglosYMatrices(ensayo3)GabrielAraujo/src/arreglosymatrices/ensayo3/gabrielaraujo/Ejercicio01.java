package arreglosymatrices.ensayo3.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; 
        
        System.out.println("--- Ingreso de Datos ---");
        
       
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero entero para la posicion " + i + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\n--- Valores Almacenados ---");
        
     
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
        
        scanner.close();
    }
}