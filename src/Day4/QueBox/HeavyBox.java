package Day4.QueBox;

public class HeavyBox extends Box {
    int weight;

    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }
    @Override
    public String toString() {
        return String.format("HeavyBox[Width: , Height: , Depth: , Weight: %d]", weight);
    }

}
