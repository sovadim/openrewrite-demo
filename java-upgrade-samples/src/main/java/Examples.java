
import java.util.ArrayList;
import java.util.HashMap;

public class Examples {

    void example1() {
        System.out.println(
                """
                abc
                def
                hig"""
        );
    }

    void example2(Object obj) {
        if (obj instanceof String string && string.length() > 10) {
            // ...
        }
    }

    void example3(ArrayList<Integer> list) {
        list.addFirst(123);
        list.getFirst();
    }

}
