package lv.tsi.javacourses.notepad;

public class Car extends Record {
    private String carBrand;
    private String carType;

    @Override
    public void askInfo() {
        carBrand = Asker.askString("Enter car brand");
        carType = Asker.askString("Enter car type");
    }


    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
