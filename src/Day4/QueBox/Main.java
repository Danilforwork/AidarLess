package Day4.QueBox;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<HeavyBox> heavyBoxes2 = new ArrayDeque<>();
        heavyBoxes2.offer(new HeavyBox(2.0, 3.0, 4.0, 10));
        heavyBoxes2.offer(new HeavyBox(5.0, 6.0, 7.0, 20));
        heavyBoxes2.offer(new HeavyBox(8.0, 9.0, 10.0, 30));
        for (HeavyBox box : heavyBoxes2) {
            System.out.println(box);
        }
        heavyBoxes2.pollLast();
        for (HeavyBox box : heavyBoxes2) {
            System.out.println(box);
        }


    }
}
