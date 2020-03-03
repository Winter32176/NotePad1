package lv.tsi.javacourses.notepad.records.note;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;
import lv.tsi.javacourses.notepad.records.Expirable;

import java.time.LocalTime;
import java.util.Locale;

public class Alarm extends Note implements Expirable {
    private LocalTime time;
    private boolean dismissed;

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
        if (dismissed) {
            return false;
        }
        var now = LocalTime.now();
        return now.isAfter(time);
    }

    @Override
    public void dismis() {
        dismissed = true;
    }
}
