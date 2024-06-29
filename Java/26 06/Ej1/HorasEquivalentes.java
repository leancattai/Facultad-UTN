import java.util.Scanner;

public class HorasEquivalentes {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número total de horas
        System.out.print("Ingresa el número total de horas: ");
        int totalHoras = scanner.nextInt();

        // Calcular el número de semanas, días y horas
        int semanas = totalHoras / (7 * 24); // 1 semana tiene 7 días y cada día tiene 24 horas
        int dias = (totalHoras % (7 * 24)) / 24; // el resto de horas dividido entre 24 da los días
        int horas = totalHoras % 24; // el resto de horas son las horas restantes

        // Mostrar los resultados
        System.out.println(totalHoras + " horas son equivalentes a:");
        System.out.println(semanas + " semanas, " + dias + " días, y " + horas + " horas.");
        scanner.close();
    }
}