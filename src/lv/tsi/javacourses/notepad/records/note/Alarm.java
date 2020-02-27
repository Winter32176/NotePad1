package lv.tsi.javacourses.notepad.records.note;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;

import java.time.LocalTime;

public class Alarm extends Note {
    private LocalTime time;

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
    protected String type() {
        return "Alarm";
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
