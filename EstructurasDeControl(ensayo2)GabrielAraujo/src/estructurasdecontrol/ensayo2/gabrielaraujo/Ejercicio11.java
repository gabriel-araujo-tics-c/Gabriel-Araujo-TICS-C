package estructurasdecontrol.ensayo2.gabrielaraujo;

/**
 * @author GABRIEL ARAUJO TICS C
 */
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
   
        System.out.print("Ingrese el numero 1: ");
        int primerNumero = entrada.nextInt();
        
        int mayor = primerNumero;
        int menor = primerNumero;

       
        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = entrada.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

        entrada.close();
    }
}