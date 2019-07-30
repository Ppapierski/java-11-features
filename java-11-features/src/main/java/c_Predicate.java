import java.util.Objects;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class c_Predicate {
    public static void main(String[] args) {
        var pattern = Pattern.compile("text");

        System.out.println(pattern.asPredicate().test("text"));
        System.out.println(pattern.asPredicate().test("tttxttt"));


        System.out.println(IntStream.range(0, 10)
                .boxed()
                .filter(Predicate.not(i -> i % 2 == 0))
                .map(Objects::toString)
                .collect(Collectors.joining(",")));

        //IntPredicate
        IntPredicate isEven = i -> i % 2 == 0;

    }


}
