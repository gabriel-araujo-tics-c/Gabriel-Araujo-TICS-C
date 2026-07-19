package arreglosymatrices.ensayo3.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio06Matriz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        
        System.out.println("--- Ingreso de datos para la matriz 3x4 ---");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor para la fila " + (i+1) + ", columna " + (j+1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\n--- Matriz resultante ---");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}