package lv.tsi.javacourses.notepad;

public class TypeOfEngine extends Car {
    private String typeOfEngine;

    @Override
    public void askInfo() {
        typeOfEngine = Asker.askString("Type of engine");
        super.askInfo();
    }

    @Override
    public String toString() {
        return "TypeOfEngine{" +
                "typeOfEngine='" + typeOfEngine + '\'' +
                "carBrand='" + getVehicleBrand() + '\'' +
                ", carType='" + getVehicleType() + '\'' +
                '}';
    }


    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }
}
