import exception.CountingResult;
import exception.NullArrayException;
import exception.RandomArrayLengthBelowZeroException;

import java.util.Random;
import java.util.stream.IntStream;

public class CountingService {

    int[] createRandomArray(final int n) {
        if (n < 0) {
            throw new RandomArrayLengthBelowZeroException("array length can not be below zero");
        }
        Random random = new Random();
        return random.ints(n, 0, 100).toArray();
    }

    double countAverage(final int[] array) {
        if (array == null) {
            throw new NullArrayException("array can not be null");
        }
        return IntStream.of(array).average().orElse(0);
    }

    public CountingResult getCountingResult(final int[] array) {
        if (array == null) {
            throw new NullArrayException("array can not be null");
        }
        return new CountingResult(countEquals(array), countGreater(array), countLower(array));
    }

    private int countGreater(final int[] array) {
        int counter = 0;
        for (int value : array) {
            if(value > 0){
                counter++;
            }
        }
        return counter;
    }

    private int countLower(final int[] array) {
        int counter = 0;
        for (int value : array) {
            if(value < 0){
                counter++;
            }
        }
        return counter;
    }

    private int countEquals(final int[] array) {
        int counter = 0;
        for (int value : array) {
            if(value == 0){
                counter++;
            }
        }
        return counter;
    }
}
