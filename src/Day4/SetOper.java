package Day4;

import java.util.HashSet;
import java.util.Set;

public class SetOper {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Объединение множеств: " + unionSet);

        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println("Пересечение множеств: " + intersectSet);
    }
}

