import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class c_Streams {

    public static void main(String[] args) {


        Stream.of(1, 2, 4, 6, 8, 13, 45, 12, 144, 4, 90)
                .limit(4)
                .forEach(System.out::println);
























//        Stream.of(1, 2, 4, 6, 8, 13, 45, 12, 144, 4, 90)
//                .filter(skipWhile(x -> x > 40))
//                .forEach(System.out::println);
//
//        Stream.of(1, 2, 4, 6, 8, 13, 45, 12, 144, 4, 90)
//                .dropWhile(x -> x < 40)
//                .forEach(System.out::println);

//        Stream.of(1, 2, 4, 6, 8, 13, 45, 12, 144, 4, 90)
//                .filter(limitAfter(x -> x < 40))
//                .forEach(System.out::println);

//        Stream.of(1, 2, 4, 6, 8, 13, 45, 12, 144, 4, 90)
//                .takeWhile(x -> x < 40)
//                .forEach(System.out::println);
//
//        Stream.of("a", "b", null, "c", null, "d")
//                .flatMap(Stream::ofNullable)
//                .forEach(System.out::println);
//
//        IntStream.iterate(1, i -> i < 20, i -> i + 2)
// //                .limit(10)
//                .forEach(System.out::println);
    }


    private static <T> Predicate<T> limitAfter(Predicate<T> test) {
        boolean[] found = {true};
        // once found, always false
        return t -> found[0] && (found[0] = test.test(t));
    }

    private static <T> Predicate<T> skipWhile(Predicate<T> test) {
        boolean[] found = {false};
        // once found, always true
        return t -> found[0] || (found[0] = test.test(t));
    }


}
