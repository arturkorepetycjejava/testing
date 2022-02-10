package exception;

import lombok.Value;

@Value
public class CountingResult {
    int valuesEquals;
    int valuesGreater;
    int valuesLower;
}
