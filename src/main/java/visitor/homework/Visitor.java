package visitor.homework;

public abstract class Visitor {
    private String operation;

    protected Visitor(String operation) {
        this.operation = operation;
    }

    public abstract void visit(VisRectangle rectangle);

    public abstract void visit(VisTriangle triangle);

    public abstract void visit(VisCircle circle);


    public String getOperation() {
        return operation;
    }
}
