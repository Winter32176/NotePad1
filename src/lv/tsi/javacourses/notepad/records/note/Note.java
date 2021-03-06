package lv.tsi.javacourses.notepad.records.note;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.records.AbstractRecord;

public class Note extends AbstractRecord {
    private String text;


    @Override
    public void askInfo() {
        text = Asker.askString("Enter text");

    }


    @Override
    public String stringContent() {
        return super.stringContent() +
                ", text='" + text + '\'';
    }

    @Override
    public boolean contains1(String substr) {
        var tmp = substr.toLowerCase();
        return super.contains1(substr)
                ||text.contains(tmp);
    }

    @Override
    protected String type() {
        return "Note";
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
