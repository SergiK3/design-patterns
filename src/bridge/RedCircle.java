package bridge;

public class RedCircle implements Draw {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Drawing Circle color: red, radius: " + radius);
    }
}
