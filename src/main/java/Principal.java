import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Conversor de Monedas ---");
            System.out.println("1. Convertir moneda");
            System.out.println("2. Ver tasa de cambio actual");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ConvertidorMoneda.convertirMoneda(scanner);
                    break;
                case 2:
                    VisualizadorTasaCambio.mostrarTasaCambio(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
}
