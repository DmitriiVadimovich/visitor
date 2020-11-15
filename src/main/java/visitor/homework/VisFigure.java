package visitor.homework;

public abstract class VisFigure {

    public int x;
    public int y;

    public VisFigure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void accept(Visitor visitor);

    public String getCoordinates() {
        return "X: " + x + ", Y: " +y;
    }
}
