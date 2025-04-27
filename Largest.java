import java.util.Arrays;

public class Largest {
    public Integer findLargest(Integer num1, Integer num2, Integer num3) {
        Integer[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        Integer lastIndex= numbers.length - 1;
        return numbers[lastIndex];
    }
}