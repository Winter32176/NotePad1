package lv.tsi.javacourses.notepad;

public class Note extends Record {
    private String text;


    @Override
    public void askInfo() {
        text = Asker.askString("Enter text");

    }


    @Override
    public String toString() {
        return "Note{" +
                "Id='" + getId() + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
