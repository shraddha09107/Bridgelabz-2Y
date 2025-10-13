public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Running background job...");
        new Thread(job).start();
    }
}
