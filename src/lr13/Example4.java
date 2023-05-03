package lr13;

public class Example4 {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        for (int i = 0; i < coreCount; i++) {
            Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
            thread.start();
        }
    }
}
