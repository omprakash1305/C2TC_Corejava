package Day15.generics;


import java.util.*;

public class LowerBoundedWildCardDemo {

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        for (Object val : list) {
            System.out.println(val);
        }
    }

    public static void main(String[] args) {

        List<Number> list1 = new ArrayList<Number>();

        addNumbers(list1);
    }
}
