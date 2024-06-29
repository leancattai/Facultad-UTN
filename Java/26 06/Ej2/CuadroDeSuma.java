import java.util.Scanner;

public class CuadroDeSuma {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de a
        System.out.print("Ingresa el valor de a: ");
        double a = scanner.nextDouble();

        // Pedir al usuario que ingrese el valor de b
        System.out.print("Ingresa el valor de b: ");
        double b = scanner.nextDouble();

        // Calcular (a + b)^2 utilizando la fórmula
        double resultado = Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;

        // Mostrar el resultado
        System.out.println("El resultado de (" + a + " + " + b + ")^2 es: " + resultado);
    }
}