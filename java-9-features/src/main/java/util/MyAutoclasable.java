package util;

public class MyAutoclasable implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("In the close method");
    }

    public void doStuff(){
        System.out.println("Im doing stuff");
    }
}
