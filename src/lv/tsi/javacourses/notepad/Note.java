package lv.tsi.javacourses.notepad;

public class Note extends Record {
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
