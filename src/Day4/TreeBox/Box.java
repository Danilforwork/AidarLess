package Day4.TreeBox;

public class Box {
    int weight;
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    @Override
    public String toString() {
        return String.format("HeavyBox[Width: %.2f, Height: %.2f, Depth: %.2f, Weight: %d]", width, height, depth, weight);
    }

}
