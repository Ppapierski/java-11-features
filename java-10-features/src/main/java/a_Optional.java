import java.util.Optional;

public class a_Optional {
    public static void main(String[] args) {

        System.out.println(Optional.of("").orElseThrow());
        System.out.println(Optional.ofNullable(null).orElseThrow());
//        System.out.println(Optional.ofNullable(null).orElseThrow(IllegalArgumentException::new));

    }
}
