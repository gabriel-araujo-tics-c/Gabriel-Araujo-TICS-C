package arreglosymatrices.ensayo3.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio09Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        System.out.println("--- Ingreso de datos para la matriz 5x5 ---");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el valor para la fila " + (i+1) + ", columna " + (j+1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\n--- Matriz ingresada ---");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
        
        scanner.close();
    }
}