package Day2;

import java.util.HashMap;
import java.util.Map;

public class MagazineFix {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("Chocolate",4.35);
        map.put("Milk",10.5);
        map.put("Bread",8.88);
        map.put("Beef",7.5);
        map.put("Potato",11.45);
        for (Map.Entry<String,Double> item : map.entrySet()) {
            System.out.println(item.getKey()+"-" + item.getValue());
        }
    }
}
