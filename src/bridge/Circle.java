package bridge;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, Draw draw) {
        super(draw);
        this.radius = radius;
    }

    public void draw() {
        draw.drawCircle(radius);
    }
}