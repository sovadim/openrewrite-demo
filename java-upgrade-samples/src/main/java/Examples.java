
import java.util.HashMap;
import java.util.ArrayList;

public class Examples {

    void example1() {
        System.out.println(
                "abc\n" +
                "def\n" +
                "hig"
        );
    }

    void example2(Object obj) {
        if (obj instanceof String && ((String) obj).length() > 10) {
            // ...
        }
    }

    void example3(ArrayList<Integer> list) {
        list.add(0, 123);
        list.get(0);
    }

}
