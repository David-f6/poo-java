public class Counter {
    private int c = 0;

    public Counter() {
    }

    public Counter(int c) {
        this.c = c;
    }

    public void inc() {
        this.c++;
    }

    public int getC() {
        return c;
    }

    public String toString() {
        return String.valueOf(c);
    }
}