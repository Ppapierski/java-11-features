import java.util.concurrent.*;

public class i_CompletableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {


        CompletableFuture<String> cf = CompletableFuture.completedFuture("My completed future");

        //copying a CF of the given type
        CompletableFuture<String> incompleteString = cf.newIncompleteFuture();

        CompletableFuture<String> copy = incompleteString.copy();
        incompleteString.complete("Completed incomplete String");
        System.out.println(incompleteString.get());
        System.out.println(copy.get());

        //failed future
//        CompletableFuture<String> failed = CompletableFuture.failedFuture(new IllegalArgumentException());
//        failed.get();



        // complete async
//        CompletableFuture<String> withValue = new CompletableFuture<>();
//        withValue.completeAsync(() -> {
//            System.out.println("Dupa");
//            return "End after timeout";}, CompletableFuture.delayedExecutor(1, TimeUnit.SECONDS));
//        System.out.println("Przed async!");
//
//        Thread.sleep(2000);
//
//        System.out.println(withValue.get());


    }
}
