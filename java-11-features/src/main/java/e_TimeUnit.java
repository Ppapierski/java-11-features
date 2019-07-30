import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class e_TimeUnit {
    public static void main(String[] args) {

        TimeUnit days = TimeUnit.DAYS;
        System.out.println(days.convert(Duration.ofMinutes(123455)));

    }
}
