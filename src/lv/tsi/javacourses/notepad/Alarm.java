package lv.tsi.javacourses.notepad;

public class Alarm extends Note {
    private String time;

    @Override
    public void askInfo() {
        time = Asker.askString("Time");
        super.askInfo();
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                ", time='" + time + '\'' +
                ", Text='" + getText() + '\'' +
                '}';
    }

    public String getTime() {
        return time;
    }

    public void setTime(String date) {
        this.time = time;
    }


}
