package visitor.homework;

public class AreaVisitor extends Visitor{
    public AreaVisitor() {super("Вычисляем площадь");}
    @Override
    public void visit(VisRectangle rectangle) {
        System.out.println("Площадь прямоугольника: " + (rectangle.getHeight()*rectangle.getWidth()));
    }

    @Override
    public void visit(VisTriangle triangle) {
        System.out.println("Площадь треугольника: " + (triangle.getHeight()*triangle.getWidth()/2));
    }

    @Override
    public void visit(VisCircle circle) {
        System.out.println("Площадь круга: " + (3.14* circle.getRadius()* circle.getRadius()));
    }
}
