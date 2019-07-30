import util.Handler;

public class g_AnonymousInnerClass {
    public static void main(String[] args) {

        Handler<String> handler = new Handler<>() {
            @Override
            public void handle(String s) {
                System.out.println("Handled " + s);
            }

            @Override
            public void dontHandle(String s) {
                System.out.println("Not handled");
            }
        };
        handler.handle("request");
    }

}
