package visitor.homework;

public class DrawVisitor extends Visitor{
    public DrawVisitor() {super("Рисуем");}

    @Override
    public void visit(VisRectangle rectangle) {
        System.out.println("Рисуем квадрат с точками: \n" +
                rectangle.getCoordinates() +
                "\nX: " + rectangle.x + ",Y: " + (rectangle.x+rectangle.getHeight()) +
                "\nX: " + (rectangle.x+rectangle.getWidth()) + ",Y: " + (rectangle.y + rectangle.getHeight()) +
                "\nX: " + (rectangle.x+rectangle.getWidth()) + ",Y: " + rectangle.y);
    }

    @Override
    public void visit(VisTriangle triangle) {
        System.out.println("Рисуем треугольник с точками: \n" +
                triangle.getCoordinates() +
                "\nX: " + triangle.x + ",Y: " + (triangle.y + triangle.getHeight()) +
                "\nX: " + (triangle.x+ triangle.getWidth()) + ",Y: " + triangle.y);
    }

    @Override
    public void visit(VisCircle circle) {
        System.out.println("Рисуем круг с центром " + circle.getCoordinates() +
                " и радиусом - " + circle.getRadius());
    }
}
