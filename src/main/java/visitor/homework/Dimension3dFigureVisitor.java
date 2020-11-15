package visitor.homework;

public class Dimension3dFigureVisitor extends Visitor{
    public Dimension3dFigureVisitor () {super("Получаем объемную фигуру");}
    @Override
    public void visit(VisRectangle rectangle) {
        System.out.println("Объемная фигура для прямоугольника - прямоугольний параллелепипед");
    }

    @Override
    public void visit(VisTriangle triangle) {
        System.out.println("Объемная фигура для треугольника - пирамида");
    }

    @Override
    public void visit(VisCircle circle) {
        System.out.println("Объемная фигура для круга - сфера");
    }
}
