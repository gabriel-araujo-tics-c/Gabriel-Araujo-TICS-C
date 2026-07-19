package arreglosymatrices.ensayo3.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio07Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaTotal = 0;
        
        System.out.println("--- Ingreso de datos para la matriz 4x4 ---");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor para la fila " + (i+1) + ", columna " + (j+1) + ": ");
                matriz[i][j] = scanner.nextInt();
                sumaTotal = sumaTotal + matriz[i][j];
            }
        }
        
        System.out.println("\n--- Matriz ingresada ---");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\n--- Resultado ---");
        System.out.println("La suma total es: " + sumaTotal);
        
        scanner.close();
    }
}