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

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                '}';
    }
}
