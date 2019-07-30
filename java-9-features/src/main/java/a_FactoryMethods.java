import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a_FactoryMethods {


    // java 8
    private static List<Integer> baseIntegerList8 = Arrays.asList(1, 2, 3, 4, 5);
    private static List<Integer> integerList8 = Collections.unmodifiableList(baseIntegerList8);


    //java 9
    private static List<Integer> integerList9 = List.of(1, 2, 3, 4, 5);

    public static void main(String[] args) {


//        System.out.println("\nJava 8: ");
//        integerList8.add(6);
//        integerList8.forEach(System.out::print);
//
//        System.out.println("\nJava 9: ");
//        integerList9.add(6);
//        integerList9.forEach(System.out::print);

        baseIntegerList8.add(6);
//        baseIntegerList8.set(0,6);
        System.out.println(integerList8);

//
//        Set<String> stringSet = Set.of();
//        System.out.println(stringSet);
//
//        Map<String, Integer> map = Map.of("One", 1, "Two", 2, "Three", 3);
//        System.out.println(map);
    }

}
