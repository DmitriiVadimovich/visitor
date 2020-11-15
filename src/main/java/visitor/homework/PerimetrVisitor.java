package visitor.homework;

public class PerimetrVisitor extends Visitor {

    public PerimetrVisitor() {super("Вычисляем периметр");}

    @Override
    public void visit(VisRectangle rectangle) {
        System.out.println("Периметр прямоугольника: " + ((rectangle.getHeight() + rectangle.getWidth())*2));
    }

    @Override
    public void visit(VisTriangle triangle) {
        System.out.println("Периметр треугольника: " +
                ((triangle.getWidth() + triangle.getHeight() + (Math.sqrt(Math.pow(triangle.getHeight(),2)+Math.pow(triangle.getWidth(), 2))))));
    }

    @Override
    public void visit(VisCircle circle) {
        System.out.println("Длина окружности: " + (2*3.14* circle.getRadius()));
    }
}
