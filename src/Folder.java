import java.util.*;

class Folder {
    private final String name;
    private final int capacity;
    private final List<Shape> shapes = new ArrayList<>();
    private int next = 0; // index de la prochaine forme à remplacer quand le dossier est plein

    public Folder(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public boolean add(Shape s) {
        if (capacity <= 0) return false;

        if (shapes.size() < capacity) {
            shapes.add(s);
        } else {
            shapes.set(next, s);
        }
        next = (next + 1) % capacity;
        return true;
    }

    public void moveShapes(int dx, int dy) {
        for (Shape s : shapes) {
            s.move(dx, dy);
        }
    }

    public void resizeShapes(int scale) {
        for (Shape s : shapes) {
            if (s instanceof Resizable r) {
                r.resize(scale);
            }
        }
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public int size() { return shapes.size(); }

    @Override
    public String toString() {
        return "Folder{name=" + name + ", shapes=" + shapes + "}";
    }
}