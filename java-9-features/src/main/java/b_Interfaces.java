import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public interface b_Interfaces {

    default String processAndReturn(String input) {
        System.out.println("Processing");
        System.out.println("More Processing");
        return input;
    }

    default String processMapAndReturn(String input, Function<String, String> mapper) {
        System.out.println("Processing");
        System.out.println("More Processing");
        return mapper.apply(input);
    }

    default List<String> processSplitAndReturn(String input) {
        System.out.println("Processing");
        System.out.println("More Processing");
        return Arrays.asList(input.split(""));
    }

}
