package lv.tsi.javacourses.notepad;

public class TypeOfEngine extends Vehicle {
    private String typeOfEngine;

    @Override
    public void askInfo() {
        typeOfEngine = Asker.askString("Type of engine");
        super.askInfo();
    }




    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }
}
