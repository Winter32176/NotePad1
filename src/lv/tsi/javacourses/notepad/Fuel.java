package lv.tsi.javacourses.notepad;

public class Fuel extends TypeOfEngine {
    private String fuelType;
    private String priceoffuel;

    @Override
    public void askInfo() {
        fuelType = Asker.askString("Fuel type");
        priceoffuel = Asker.askString("Price");
        super.askInfo();
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "fuelType='" + fuelType + '\'' +
                ", priceoffuel='" + priceoffuel + '\'' +
                "typeOfEngine='" + getTypeOfEngine() + '\'' +
                "carBrand='" + getCarBrand() + '\'' +
                ", carType='" + getCarType() + '\'' +
                '}';
    }



    public String getPriceoffuel() {
        return priceoffuel;
    }

    public void setPriceoffuel(String priceoffuel) {
        this.priceoffuel = priceoffuel;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
