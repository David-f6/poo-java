public class Circle extends Conic {
    private double radius;
    private final Point center;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    protected boolean congruent(Shape other) {
        return Double.compare(radius, ((Circle) other).radius) == 0;
    }

    @Override
    protected int hashi() {
        return Double.hashCode(radius);
    }

    @Override
    public void move(int dx, int dy) {
        center.move(dx, dy);
    }

    @Override
    public void resize(int scale) {
        radius = radius * Math.sqrt(scale / 100.0);
    }

    @Override
    public String toString() {
        return "Circle[center = " + center + ", radius = " + Math.round(radius * 100) / 100.0 + " ]";
    }

}
