package lr13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Example5and6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int arraySize = 1_000_000_000;
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt();
        }

        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cores);
        List<Future<Integer>> maxFutures = new ArrayList<>();
        List<Future<Long>> sumFutures = new ArrayList<>();
        int blockSize = arraySize / cores;
        for (int i = 0; i < cores; i++) {
            int start = i * blockSize;
            int end = (i == cores - 1) ? arraySize : (i + 1) * blockSize;
            maxFutures.add(executor.submit(new ArrayMaxTask(array, start, end)));
            sumFutures.add(executor.submit(new ArraySumTask(array, start, end)));
        }
        int max = Integer.MIN_VALUE;
        for(Future<Integer> future : maxFutures) {
            int value = future.get();
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Array max value: " + max);
        long sum = 0;
        for (Future<Long> future : sumFutures) {
            sum += future.get();
        }
        System.out.println("Array sum: " + sum);
        executor.shutdown();
    }
}
