package Day15.generics;



import java.util.List;

public class UnBoundedWildCard {

    void printList(List<?> list) {
        for (Object val : list) {
            System.out.println(val);
        }
    }
}
