package Day4;

import java.util.HashSet;
import java.util.Set;

public class SetPovt {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);integerSet.add(2);integerSet.add(3);integerSet.add(4);integerSet.add(5);integerSet.add(5);
        integerSet.add(10);integerSet.add(11);
        System.out.println(integerSet);
    }
}
