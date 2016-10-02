
public enum OUT {
    CONSOLE(0),
    FILE(1);
    private final int id;
    private OUT(final int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
};