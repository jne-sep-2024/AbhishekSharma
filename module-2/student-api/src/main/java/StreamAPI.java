
import java.util.List;
import java.util.Arrays;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> value = Arrays.asList(2, 5, 4, 2, 1, 5, 8);

        value.stream().forEach(System.out::println);

    }
}
