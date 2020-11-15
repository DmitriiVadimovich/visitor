package visitor.homework;

public class VisCircle extends VisFigure{
    private int radius;

    public VisCircle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getRadius() {
        return radius;
    }
}
