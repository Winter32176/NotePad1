package lv.tsi.javacourses.notepad.records;

public abstract class AbstractRecord {
    private static int count;
    private int id;

    public AbstractRecord() {
        count++;
        this.id = count;
    }


    public boolean contains1(String substr){
        String strId = String.valueOf(id);
        return strId.contains(substr);
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
