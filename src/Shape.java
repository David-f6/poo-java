import java.util.*;

abstract class Shape implements Mobile, Comparable<Shape> {
    public abstract double area();
    public abstract double perimeter();
    protected abstract boolean congruent(Shape other);
    protected abstract int hashi();

    @Override
    public final int compareTo(Shape other) {
        return Double.compare(this.area(), other.area());
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return congruent((Shape) o);
    }

    @Override
    public final int hashCode() {
        return hashi();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }



}