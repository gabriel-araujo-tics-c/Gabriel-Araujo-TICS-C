package arreglosymatrices.ensayo3.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20]; 
        
        int cantPares = 0;
        int cantImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        
        System.out.println("--- Ingreso de 20 Numeros Enteros ---");
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el numero entero para la posicion " + i + ": ");
            numeros[i] = scanner.nextInt();
        }
        
       
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                cantPares++; 
                sumaPares = sumaPares + numeros[i]; 
            } else {
                cantImpares++; 
                sumaImpares = sumaImpares + numeros[i]; 
            }
        }
        
        System.out.println("\n--- Resultados de Pares e Impares ---");
        System.out.println("Cantidad de numeros pares: " + cantPares);
        System.out.println("Cantidad de numeros impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
        
        scanner.close();
    }
}