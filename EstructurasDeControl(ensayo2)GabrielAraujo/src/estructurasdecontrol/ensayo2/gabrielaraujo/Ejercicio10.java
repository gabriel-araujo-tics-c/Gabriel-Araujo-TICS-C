package estructurasdecontrol.ensayo2.gabrielaraujo;

/**
 * @author GABRIEL ARAUJO TICS C
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int suma = 0;
        int numero;
        double promedio;

        System.out.println("Por favor, ingrese 10 numeros enteros.");

      
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = entrada.nextInt();
            
      
            suma = suma + numero; 
        }

        promedio = (double) suma / 10;

        System.out.println("\n--- Resultados ---");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        entrada.close();
    }
}