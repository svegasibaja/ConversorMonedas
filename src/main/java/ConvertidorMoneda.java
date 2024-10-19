import java.io.IOException;
import java.util.Scanner;

public class ConvertidorMoneda {

    public static void convertirMoneda(Scanner scanner) {
        System.out.println("\nMonedas disponibles: USD (DOLAR), EUR (EURO), COP, MXN, PEN, BRL");

        String monedaOrigen = ValidadorMoneda.validarMoneda(scanner, "origen");
        String monedaDestino = ValidadorMoneda.validarMoneda(scanner, "destino");

        System.out.print("Introduce la cantidad a convertir: ");
        double cantidad = ValidadorMoneda.validarCantidad(scanner);

        try {
            double tasaCambio = APIManager.obtenerTasaCambio(monedaOrigen, monedaDestino);
            double resultado = cantidad * tasaCambio;

            System.out.printf("\n%.2f %s equivalen a %.2f %s\n", cantidad, monedaOrigen, resultado, monedaDestino);
        } catch (IOException e) {
            System.out.println("Error al obtener las tasas de cambio. Verifica tu conexión o API key.");
        }
    }
}
