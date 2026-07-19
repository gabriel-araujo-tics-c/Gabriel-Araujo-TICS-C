package estructurasdecontrol.ensayo2.gabrielaraujo;
/**
 * @author GABRIEL ARAUJO TICS C
 */
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese su carrera: ");
        String carrera = entrada.nextLine();

        System.out.print("Ingrese su estatura (en metros, ej: 1.75): ");
        double estatura = entrada.nextDouble();

        System.out.println("--- Datos Ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");
        
        entrada.close();
    }
}