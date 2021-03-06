package lv.tsi.javacourses.notepad.records.note;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;
import lv.tsi.javacourses.notepad.records.Expirable;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reminder extends Alarm implements Expirable {
    private LocalDate date;
    private boolean dismissed;

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
    public boolean contains1(String substr) {
        return super.contains1(substr)
                || StringDateTime.dateToString(date).contains(substr);
    }

    @Override
    public boolean isExpirred() {
        if (dismissed) {
            return false;
        }
        var now = LocalDateTime.now();
        var dt = LocalDateTime.of(date, getTime());
        return now.isAfter(dt);
    }

    @Override
    public void dismiss() {
        dismissed = true;
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
