package lv.tsi.javacourses.notepad.records.note;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;
import lv.tsi.javacourses.notepad.records.Expirable;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

public class Alarm extends Note implements Expirable {
    private LocalTime time;
    private boolean dismissed;
    private boolean check;
    private LocalDate date1;

    @Override
    public void askInfo() {
        time = Asker.askTime("Time ");
        super.askInfo();
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", time='" + StringDateTime.timeToString(time) + '\'';
    }

    @Override
    public boolean contains1(String substr) {
        return super.contains1(substr)
                || StringDateTime.timeToString(time).contains(substr);
    }

    @Override
    protected String type() {
        return "Alarm";
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean isExpirred() {
        LocalDate date = LocalDate.now();

        if (check == false) {
            date1 = date;
        }
        check = true;

        if (date.isAfter(date1)) {
            dismissed = false;
        }


        if (dismissed) {
            return false;
        }
        if (date == date1) {
            dismissed = true;
        }
        var now = LocalTime.now();
        return now.isAfter(time);
    }

    @Override
    public void dismis() {
        dismissed = true;
    }
}
