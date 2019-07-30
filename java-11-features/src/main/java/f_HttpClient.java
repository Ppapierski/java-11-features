import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class f_HttpClient {


    private static final HttpClient CLIENT = HttpClient.newBuilder().build();

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        URI uri = new URI("https://pl.wikipedia.org/wiki/HTTP/2");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println();
        System.out.println(response.headers());


        // this cute client is immutable!
        HttpClient client = HttpClient.newBuilder()
                //don't really need this line, HTTP/2 is default!
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(5))
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();


        URI chuckUri = URI.create("https://api.chucknorris.io/jokes/random");
        HttpRequest chuckRequest = HttpRequest.newBuilder()
                .GET()
                .uri(chuckUri)
                .build();

        HttpResponse<String> chuckResponse = client.send(chuckRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(chuckResponse.body());

    }

}
