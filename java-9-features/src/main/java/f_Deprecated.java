import util.My_Deprecated;

public class f_Deprecated {
    @Deprecated(since = "Java worshop", forRemoval = true)
    public static void someMethod(){
        System.out.println("Who wants to live forever?");
    }

    public static void main(String[] args) {
        someMethod();
        new Boolean(true);

        new My_Deprecated();
    }


}
