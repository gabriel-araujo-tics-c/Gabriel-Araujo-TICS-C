package metodosfuncionesysubprocesos.ensayo4.gabrielaraujo;

public class Ejercicio06 {

    public static void main(String[] args) {
        int numero = obtenerNumero();
        System.out.println("El numero generado es: " + numero);
    }

    public static int obtenerNumero() {
        return (int) (Math.random() * 100) + 1;
    }
}