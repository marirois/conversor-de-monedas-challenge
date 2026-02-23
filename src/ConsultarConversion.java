import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarConversion {

    public ConversionOmd convertirMoneda(String eleccion, double cantidadAConvertir) {
        String apikey = "efe9d0c2c20360fc785a9def";
        String url = "https://v6.exchangerate-api.com/v6/" + apikey + "/pair/" + eleccion + cantidadAConvertir;
        URI direccion = URI.create(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConversionOmd.class);
        } catch (Exception e) {
            throw new RuntimeException("No enconrtré esa película");
        }

        // --->>> FALTA QUE RETORNE EL RESULTADO
    }
}
