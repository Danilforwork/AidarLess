package Day2;

import java.util.*;

public class MonthFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = 0;
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Winter");
        map.put(2,"Winter");
        map.put(3,"Spring");
        map.put(4,"Spring");
        map.put(5,"Spring");
        map.put(6,"Summer");
        map.put(7,"Summer");
        map.put(8,"Summer");
        map.put(9,"Autumn");
        map.put(10,"Autumn");
        map.put(11,"Autumn");
        map.put(12,"Winter");
        while (true) {
            n = sc.nextInt();
            if (n <= 12 && n >= 1) {
                break;
            }
        }
        String season = map.get(n);
        System.out.println(season);
    }
}
