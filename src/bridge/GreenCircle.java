package bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius);
    }
}