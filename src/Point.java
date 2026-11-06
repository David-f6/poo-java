import java.util.Objects;

public class Point implements Mobile {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0.0, 0.0);
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}
