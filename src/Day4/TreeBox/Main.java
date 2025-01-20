package Day4.TreeBox;


import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<HeavyBox> heavyBoxes1 = new TreeSet<>();
        heavyBoxes1.add(new HeavyBox(2.0, 3.0, 4.0, 10));
        heavyBoxes1.add(new HeavyBox(5.0, 6.0, 7.0, 20));
        heavyBoxes1.add(new HeavyBox(8.0, 9.0, 10.0, 30));
        for (HeavyBox box : heavyBoxes1) {
            System.out.println(box);
        }

        }
    }

