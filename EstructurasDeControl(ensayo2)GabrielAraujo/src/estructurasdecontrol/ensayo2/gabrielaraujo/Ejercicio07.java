package estructurasdecontrol.ensayo2.gabrielaraujo;

/**
 * @author GABRIEL ARAUJO TICS C
 */
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int suma = 0;
        int contador = 0;
        int numero;

        System.out.print("Ingrese un numero positivo (o un negativo para salir): ");
        numero = entrada.nextInt();

     
        while (numero >= 0) {
            contador = contador + 1;  
            suma = suma + numero;     
            
 
            System.out.print("Ingrese otro numero positivo (o un negativo para salir): ");
            numero = entrada.nextInt();
        }

        System.out.println("--- Resultados ---");
        System.out.println("Cantidad de numeros ingresados: " + contador);
        System.out.println("Suma total: " + suma);
       

        entrada.close();
    }
}