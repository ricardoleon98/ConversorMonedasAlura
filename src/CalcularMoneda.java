import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CalcularMoneda {
    public Monedas buscarMoneda(String monedaFrom, String monedaTo){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c3646cd3410715d1a16b0b71/pair/" +monedaFrom+ "/" +monedaTo + "/" );

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }
         catch (Exception e) {
            throw new RuntimeException("No encontre esa moneda");
        }
    }
}
