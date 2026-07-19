package metodosfuncionesysubprocesos.ensayo4.gabrielaraujo;

import java.util.Scanner;

/**
 * @author Gabriel Araujo
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        saludar(nombre);
        
        scanner.close();
    }

    public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre + ".");
    }
}
