class MemoryFolder extends Folder {
    private final Counter counter;

    public MemoryFolder() {
        this(new Counter());
    }

    public MemoryFolder(Counter counter) {
        super("No name", 10);
        this.counter = counter;
    }

    @Override
    public void moveShapes(int dx, int dy) {
        super.moveShapes(dx, dy);
        counter.inc();

    }

    public int getNbMoves() {
        return counter.getC();
    }

    @Override
    public String toString() {
        return super.toString() + "[moveCount=" + getNbMoves() + "]";
    }
}