import exception.RandomArrayLengthBelowZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingServiceTest {

    private final CountingService countingService = new CountingService();

    @Test
    void shouldThrowRandomArrayLengthBelowZeroExceptionWhenLengthIsLowerThanZero() {
        assertThrows(RandomArrayLengthBelowZeroException.class,
                () -> countingService.createRandomArray(-5));
    }

}