import java.util.Optional;

public class practice {

    public static void main(String[] args) {

        String str = "Coco";
        String str1 = null;

        Optional<String> val = Optional.ofNullable(str);
        Optional<String> val1 = Optional.ofNullable(str1);

        System.out.println(val);
        System.out.println(val.isPresent());

        System.out.println(val.orElse("Empty"));
        System.out.println(val1.orElse("EMpty"));
    }
}
