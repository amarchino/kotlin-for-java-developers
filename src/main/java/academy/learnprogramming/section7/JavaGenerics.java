package academy.learnprogramming.section7;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        //list.add(new BigDecimal(10.5));
        list.getFirst().toUpperCase();

        List list1 = new ArrayList<>();
        list.add("Goodbye");

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        boolean b = strings instanceof List<String>;
    }
}
