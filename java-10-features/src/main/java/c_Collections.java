import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class c_Collections {

    public static void main(String[] args) {

        List<Integer>  list= List.of(1,2,3,4,5,6);
        List<Integer> copiedList = List.copyOf(list);
        Set<Integer> copiedSet = Set.copyOf(list);

        System.out.println(copiedList);
        System.out.println(copiedSet);


        var map = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toMap(String::valueOf , i -> i ));

        System.out.println(map);

        map.putIfAbsent("10", 10);

        System.out.println(map);

        var copyOfMap = Map.copyOf(map);

        copyOfMap.put("10", 10);

    }
}
