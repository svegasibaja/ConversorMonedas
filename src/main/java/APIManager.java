import org.json.JSONObject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class APIManager {

    private static final String API_KEY = "4d7d10e06c84ba8322876119";  // Reemplaza esto con tu propia API key
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static double obtenerTasaCambio(String monedaOrigen, String monedaDestino) throws IOException {
        String urlStr = BASE_URL + monedaOrigen;
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("Error en la conexión: " + responseCode);
        }

        Scanner scanner = new Scanner(url.openStream());
        StringBuilder jsonResponse = new StringBuilder();
        while (scanner.hasNext()) {
            jsonResponse.append(scanner.nextLine());
        }
        scanner.close();

        JSONObject data = new JSONObject(jsonResponse.toString());
        JSONObject conversionRates = data.getJSONObject("conversion_rates");

        return conversionRates.getDouble(monedaDestino);
    }
}

