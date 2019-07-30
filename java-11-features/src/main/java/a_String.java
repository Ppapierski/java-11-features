import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class a_String {
    public static void main(String[] args) {
        var string = "Kopytko";
        string.isEmpty();
        string.isBlank();


        var string2 = " Kopytko     ";

//        System.out.println(string2 +"koniec");
//        System.out.println(string2.strip()+ "koniec");
//        System.out.println(string2.stripLeading()+"koniec");
//        System.out.println(string2.stripTrailing()+"koniec");
//        System.out.println(string.repeat(12));


        var stringWithLines = IntStream.range(0,10)
                .mapToObj(i -> string)
                .collect(Collectors.joining("\n"));


//        System.out.println(stringWithLines);

//        System.out.println(stringWithLines.lines().collect(Collectors.toList()));


    }
}
