package arreglosymatrices.ensayo3.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio10Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        
        System.out.println("--- Ingreso de datos para la matriz 3x5 ---");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el valor para la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                int valor = scanner.nextInt();
                matriz[i][j] = valor + ((i + 1) * (j + 1));
            }
        }
        
        System.out.println("\n--- Matriz resultante modificada ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}