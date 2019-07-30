import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class b_File {
    public static void main(String[] args) throws IOException {
        Files.writeString(Path.of("Hello.txt"), "Hello");
        System.out.println(Files.readString(Path.of("Hello.txt")));
    }

}
