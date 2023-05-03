package lr13;

import java.util.concurrent.Callable;

public class ArraySumTask implements Callable<Long> {
    long sum;
    int start, end;
    int[] array;

    public ArraySumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }
    @Override
    public Long call() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
