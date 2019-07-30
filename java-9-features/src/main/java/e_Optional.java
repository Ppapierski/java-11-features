import java.util.Optional;
import java.util.stream.Stream;

public class e_Optional {


    public static void main(String[] args) {
        Stream.of("a", "b", null, "c", null, "d")
                .map(Optional::ofNullable)
                .flatMap(Optional::stream)
                .forEach(System.out::println);

//        Optional.of("Galileo").ifPresentOrElse(System.out::println, () -> System.out.println("Figaro"));
//
//        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Figaro"));
//
//        Optional.of("Galileo").or(() -> Optional.of("Figaro"));
//        Optional.empty().or(() -> Optional.of("Magnifico"));
    }

}
