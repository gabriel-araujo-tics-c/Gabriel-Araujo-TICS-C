package arreglosymatrices.ensayo3.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10]; 
        double suma = 0.0;
        double promedio = 0.0;
        
        System.out.println("--- Ingreso de Numeros Reales ---");
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero real para la posicion " + i + ": ");
            numeros[i] = scanner.nextDouble();
        }
        
       
        for (int i = 0; i < 10; i++) {
            suma = suma + numeros[i];
        }
        
        promedio = suma / 10.0;
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        
        scanner.close();
    }
}