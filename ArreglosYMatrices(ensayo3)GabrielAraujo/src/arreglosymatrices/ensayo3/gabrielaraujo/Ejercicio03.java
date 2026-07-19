package arreglosymatrices.ensayo3.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15]; 
        
        System.out.println("--- Ingreso de Numeros ---");
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese un numero entero para la posicion " + i + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int mayor = numeros[0];
        int menor = numeros[0];
        int posMayor = 0;
        int posMenor = 0;
        
        for (int i = 1; i < 15; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i; 
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Posicion del mayor: " + posMayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion del menor: " + posMenor);
        
        scanner.close();
    }
}