package lr13;

import java.util.concurrent.Callable;

public class ArrayMaxTask implements Callable<Integer> {
    int start, end;
    int max;
    int[] array;

    public ArrayMaxTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.max = Integer.MIN_VALUE;
    }

    @Override
    public Integer call() {
        for (int i = start; i < end; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
