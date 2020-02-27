package lv.tsi.javacourses.notepad;

public abstract class Record {
    private static int count;
    private int id;

    public Record() {
        count++;
        this.id = count;
    }

    public int getId() {
        return id;
    }

    public abstract void askInfo();

    protected String stringContent() {
        return "id=" + id;
    }

    protected abstract String type();


    @Override
    public final String toString() {
        return type() + "{" + stringContent() + '}';
    }

}
