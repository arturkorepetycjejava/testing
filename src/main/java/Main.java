import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final CountingService countingService = new CountingService();
        System.out.println(Arrays.toString(countingService.createRandomArray(0)));
    }
}
