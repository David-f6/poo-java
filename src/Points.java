public class Points {

    public static double angle(Point A, Point center, Point B) {
        return Math.toDegrees(Math.atan2(A.getX() - center.getX(),
                A.getY() - center.getY())
                - Math.atan2(B.getX() - center.getX(),
                B.getY() - center.getY()));
    }

    public static double distance(Point A, Point B) {
        double a = Math.pow(A.getX() - B.getX(), 2);
        double b = Math.pow(A.getY() - B.getY(), 2);
        return Math.sqrt(a + b);
    }

    public static Point intersect(Point p1, Point p2, Point p3, Point p4) {
        double x1 = p1.getX(), y1 = p1.getY(), x2 = p2.getX(), y2 = p2.getY(),
                x3 = p3.getX(), y3 = p3.getY(), x4 = p4.getX(), y4 = p4.getY();
        double denom = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1);
        if (denom == 0.0) {
            return null;
        }
        double ua = ((x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3)) / denom;
        double ub = ((x2 - x1) * (y1 - y3) - (y2 - y1) * (x1 - x3)) / denom;
        if (ua >= 0.0f && ua <= 1.0f && ub >= 0.0f && ub <= 1.0f) {
            return new Point(x1 + ua * (x2 - x1), y1 + ua * (y2 - y1));
        }
        return null;
    }
}
