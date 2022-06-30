package facade;

public class ShapeMaker {
    private final ShapeDrawer circle;
    private final ShapeDrawer rectangle;
    private final ShapeDrawer square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}