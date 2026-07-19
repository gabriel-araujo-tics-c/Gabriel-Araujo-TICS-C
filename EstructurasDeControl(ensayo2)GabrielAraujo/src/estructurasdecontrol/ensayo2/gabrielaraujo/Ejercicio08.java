package estructurasdecontrol.ensayo2.gabrielaraujo;

/**
 * @author GABRIEL ARAUJO TICS C
 */
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String contrasena = "";


        do {
            System.out.print("Ingrese la contrasena: ");
            contrasena = entrada.nextLine();
        } while (!contrasena.equals("java2026")); 

        System.out.println("Acceso concedido.");

        entrada.close();
    }
}