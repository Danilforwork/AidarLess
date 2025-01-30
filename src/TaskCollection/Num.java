package TaskCollection;

import java.util.HashSet;
import java.util.Set;

public class Num {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(18);
        System.out.println(nums);
    }
}
