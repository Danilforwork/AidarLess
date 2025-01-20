package Day4.Box;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(2.0, 3.0, 4.0, 10));
        heavyBoxes.add(new HeavyBox(5.0, 6.0, 7.0, 20));
        heavyBoxes.add(new HeavyBox(8.0, 9.0, 10.0, 30));
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box);
        }

        if (!heavyBoxes.isEmpty()) {
        heavyBoxes.get(0).weight += 1;
    }
        if (!heavyBoxes.isEmpty()) {
        heavyBoxes.remove(heavyBoxes.size() - 1);
    }//1
        System.out.println("\nСодержимое массива через toArray():");
        HeavyBox[] heavyBoxArray1 = heavyBoxes.toArray(new HeavyBox[0]);
        for (HeavyBox box : heavyBoxArray1) {
            System.out.println(box);
        }

        //2
        System.out.println("\nСодержимое массива по индексам:");
        for (int i = 0; i < heavyBoxes.size(); i++) {
            System.out.println(heavyBoxes.get(i));
        }
        heavyBoxes.clear();
        if (heavyBoxes.isEmpty()) {
            System.out.println("Коллекция пуста.");
        }
    }
}
