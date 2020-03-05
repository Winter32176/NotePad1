package lv.tsi.javacourses.notepad.records.note;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;
import lv.tsi.javacourses.notepad.records.Expirable;


import java.time.LocalDate;
import java.time.LocalTime;

public class Alarm extends Note implements Expirable {
    private LocalTime time;
    private boolean dismissed;
    private boolean check;
    private LocalDate dismissedDate;

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
        if (dismissedDate != null && dismissedDate.equals(LocalDate.now())) {
            return false;
        }
        var now = LocalTime.now();
        return now.isAfter(time);

//        LocalDate date = LocalDate.now();
//
//
//        if (check == false) {
//            dismissedDate = date;
//        }
//        check = true;
//
//        if (date.isAfter(dismissedDate)) {
//            check = false;
//            dismissed = false;
//        }
//
//
//        if (dismissed) {
//            return false;
//        }
//
    }


    @Override
    public void dismiss() {
        LocalDate dismissedDate = LocalDate.now();
    }
}
