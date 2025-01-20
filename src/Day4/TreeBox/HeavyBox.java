package Day4.TreeBox;

public class HeavyBox extends Box  implements Comparable<HeavyBox> {
    int weight;

    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }
    @Override
    public int compareTo(HeavyBox other) {
        return Integer.compare(this.weight, other.weight);
    }
    @Override
    public String toString() {
        return String.format("HeavyBox[Width: %.2f, Height: %.2f, Depth: %.2f, Weight: %d]", width, height, depth, weight);
    }

}
