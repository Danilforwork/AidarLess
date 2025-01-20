package Day4.QueBox;

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
        return String.format("HeavyBox[Width: , Height: , Depth: , Weight: %d]", weight);
    }

}
