package lv.tsi.javacourses.notepad.records.note;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;

import java.time.LocalDate;

public class Reminder extends Alarm {
    private LocalDate date;

    @Override
    public void askInfo() {
        date = Asker.askDate("Date ");
        super.askInfo();
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", Date='" + StringDateTime.dateToString(date) + '\'';
    }

    @Override
    protected String type() {
        return "Reminder";
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
