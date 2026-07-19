package estructurasdecontrol.ensayo2.gabrielaraujo;

/**
 * @author GABRIEL ARAUJO TICS C
 */
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = entrada.nextInt();


        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
           
        }

        entrada.close();
    }
}