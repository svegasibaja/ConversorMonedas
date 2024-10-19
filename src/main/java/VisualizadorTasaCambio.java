import java.io.IOException;
import java.util.Scanner;

public class VisualizadorTasaCambio {

    public static void mostrarTasaCambio(Scanner scanner) {
        System.out.println("\nMonedas disponibles: USD (DOLAR), EUR (EURO), COP, MXN, PEN, BRL");

        String monedaOrigen = ValidadorMoneda.validarMoneda(scanner, "origen");
        String monedaDestino = ValidadorMoneda.validarMoneda(scanner, "destino");

        try {
            double tasaCambio = APIManager.obtenerTasaCambio(monedaOrigen, monedaDestino);
            System.out.printf("1 %s = %.2f %s\n", monedaOrigen, tasaCambio, monedaDestino);
        } catch (IOException e) {
            System.out.println("Error al obtener las tasas de cambio. Verifica tu conexión o API key.");
        }
    }
}
