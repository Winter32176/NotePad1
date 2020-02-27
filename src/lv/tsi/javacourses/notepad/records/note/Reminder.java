package lv.tsi.javacourses.notepad.records.note;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.records.note.Alarm;

public class Reminder extends Alarm {
    private String date;

    @Override
    public void askInfo() {
        date = Asker.askString("Date");
        super.askInfo();
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", Date='" + date + '\'';
    }

    @Override
    protected String type() {
        return "Reminder";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
