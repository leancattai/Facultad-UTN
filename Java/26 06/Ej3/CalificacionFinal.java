import java.util.Scanner;

public class CalificacionFinal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la calificación de participación
        System.out.print("Ingresa la calificación de participación (10%): ");
        double participacion = scanner.nextDouble();

        // Pedir al usuario que ingrese la calificación del primer examen parcial
        System.out.print("Ingresa la calificación del primer examen parcial (25%): ");
        double primerParcial = scanner.nextDouble();

        // Pedir al usuario que ingrese la calificación del segundo examen parcial
        System.out.print("Ingresa la calificación del segundo examen parcial (25%): ");
        double segundoParcial = scanner.nextDouble();

        // Pedir al usuario que ingrese la calificación del examen final
        System.out.print("Ingresa la calificación del examen final (40%): ");
        double examenFinal = scanner.nextDouble();

        // Calcular la calificación final
        double calificacionFinal = (participacion * 0.10) + (primerParcial * 0.25) + 
                                   (segundoParcial * 0.25) + (examenFinal * 0.40);

        // Mostrar la calificación final
        System.out.println("La calificación final del estudiante es: " + calificacionFinal);
    scanner.close();
    }
}