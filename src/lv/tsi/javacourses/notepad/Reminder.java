package lv.tsi.javacourses.notepad;

public class Reminder extends Alarm {
    private String date;

    @Override
    public void askInfo() {
        date = Asker.askString("Date");
        super.askInfo();
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", Date='" + getDate() + '\'' +
                ", time='" + getTime() + '\'' +
                ", Text='" + getText() + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
