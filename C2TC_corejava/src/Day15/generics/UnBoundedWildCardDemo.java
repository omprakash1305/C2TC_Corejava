package Day15.generics;



import java.util.*;

public class UnBoundedWildCardDemo {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<String> list2 = Arrays.asList("One", "Two", "Three", "Four");

        UnBoundedWildCard obj = new UnBoundedWildCard();

        obj.printList(list1);
        obj.printList(list2);
    }
}
