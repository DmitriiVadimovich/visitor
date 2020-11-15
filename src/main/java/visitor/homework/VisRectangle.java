package visitor.homework;

public class VisRectangle extends VisFigure{
    private int height;
    private int width;

    public VisRectangle (int height, int width, int x, int y) {
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
