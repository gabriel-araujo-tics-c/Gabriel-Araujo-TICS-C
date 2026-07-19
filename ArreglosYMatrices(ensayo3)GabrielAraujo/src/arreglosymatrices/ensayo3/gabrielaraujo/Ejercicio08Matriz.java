package arreglosymatrices.ensayo3.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio08Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;
        
        System.out.println("--- Ingreso de datos para la matriz 4x4 ---");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor para la fila " + (i+1) + ", columna " + (j+1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\n--- Matriz con diagonal principal ---");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                    sumaDiagonal = sumaDiagonal + matriz[i][j];
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
        
        System.out.println("\n--- Resultado ---");
        System.out.println("La suma de la diagonal principal es: " + sumaDiagonal);
        
        scanner.close();
    }
}