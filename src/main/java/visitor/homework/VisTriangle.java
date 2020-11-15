package visitor.homework;

public class VisTriangle extends VisFigure{
    private int height;
    private int width;

    public VisTriangle (int height, int width, int x, int y) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
