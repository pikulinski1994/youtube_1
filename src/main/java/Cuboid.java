public class Cuboid {

    int weight;
    int height;
    int depth;

    public Cuboid(int weight, int height, int depth) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    Cuboid greg = new Cuboid(12,14,16);

}
