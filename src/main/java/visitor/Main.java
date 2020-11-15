package visitor;

import visitor.homework.*;

public class Main {
    public static void main(String[] args) {

        VisFigure[] figures = {
                new VisRectangle(10, 15, 0, 0),
                new VisTriangle(9, 5, 0, 0),
                new VisCircle(15, 10,10)};

        var draw = new DrawVisitor();
        var area = new AreaVisitor();
        var perimetr = new PerimetrVisitor();
        var figure3d = new Dimension3dFigureVisitor();
        for (VisFigure figure : figures) {
            figure.accept(draw);
            figure.accept(area);
            figure.accept(perimetr);
            figure.accept(figure3d);
        }

    }
}
