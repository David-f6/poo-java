import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Polygon extends Shape {
    private List<Point> vertices;

    public Polygon(Point... points) {
        vertices = new ArrayList<>(Arrays.asList(points));
    }

    @Override
    public double perimeter() {
        double sum = 0;
        for (int i = 0; i < vertices.size(); i++) {
            Point a = vertices.get(i);
            Point b = vertices.get((i + 1) % vertices.size());
            sum += Points.distance(a, b);
        }
        return sum;
    }

    @Override
    public void move(int dx, int dy) {
        for (Point p : vertices) {
            p.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        return "Polygon" + vertices;
    }
}