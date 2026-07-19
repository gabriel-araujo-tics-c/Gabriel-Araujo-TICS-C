package estructurasdecontrol.ensayo2.gabrielaraujo;

/**
 * @author GABRIEL ARAUJO TICS C
 */
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una calificacion entre 0 y 10: ");
    
        double calificacion = entrada.useLocale(java.util.Locale.US).nextDouble();

    
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Excelente");
        } else if (calificacion >= 8 && calificacion <= 8.99) {
            System.out.println("Muy Bueno");
        } else if (calificacion >= 7 && calificacion <= 7.99) {
            System.out.println("Bueno");
        } else if (calificacion >= 5 && calificacion <= 6.99) {
            System.out.println("Regular");
        } else if (calificacion >= 0 && calificacion <= 4.99) {
            System.out.println("Deficiente");
        } else {
            System.out.println("Calificación fuera de rango");
        }

        entrada.close();
    }
}