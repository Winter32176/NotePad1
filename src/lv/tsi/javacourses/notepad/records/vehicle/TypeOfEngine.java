package lv.tsi.javacourses.notepad.records.vehicle;

import lv.tsi.javacourses.notepad.Asker;

public class TypeOfEngine extends Vehicle {
    private String typeOfEngine;

    @Override
    public void askInfo() {
        typeOfEngine = Asker.askString("Type of engine");
        super.askInfo();
    }

    public String stringContent() {
        return super.stringContent() +
                ", Type of engine='" + typeOfEngine + '\'';
    }

    @Override
    protected String type() {
        return "Type of engine";
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }
}
