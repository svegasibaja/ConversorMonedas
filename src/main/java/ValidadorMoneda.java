import java.util.Scanner;
import java.util.Set;

public class ValidadorMoneda {

    private static final Set<String> MONEDAS_VALIDAS = Set.of("USD", "EUR", "COP", "MXN", "PEN", "BRL");

    public static String validarMoneda(Scanner scanner, String tipo) {
        String moneda;
        while (true) {
            System.out.printf("Introduce la moneda %s (ejemplo: USD): ", tipo);
            moneda = scanner.next().toUpperCase();
            if (MONEDAS_VALIDAS.contains(moneda)) {
                break;
            } else {
                System.out.println("Moneda inválida. Intenta de nuevo.");
            }
        }
        return moneda;
    }

    public static double validarCantidad(Scanner scanner) {
        double cantidad;
        while (true) {
            try {
                cantidad = Double.parseDouble(scanner.next());
                if (cantidad <= 0) {
                    System.out.print("La cantidad debe ser mayor a 0. Inténtalo de nuevo: ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Introduce un número válido: ");
            }
        }
        return cantidad;
    }
}
