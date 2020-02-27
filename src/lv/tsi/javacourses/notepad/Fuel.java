package lv.tsi.javacourses.notepad;

public class Fuel extends TypeOfEngine {
    private String fuelType;
    private String countryF;
    private String octaneRating;
    private String winter1summer;
    private String fuelPrice;

    @Override
    public void askInfo() {
        fuelType = Asker.askString("Fuel type");
        countryF = Asker.askString("Country of fuel");
        if (fuelType.equalsIgnoreCase("Petrol") || fuelType.equalsIgnoreCase("gasoline ")) {
            octaneRating = Asker.askString("Octane rating");
        }
        winter1summer = Asker.askString("Winter or summer fuel");
        fuelPrice = Asker.askString("Price");
        super.askInfo();
    }



    public String getCountryF() {
        return countryF;
    }

    public void setCountryF(String countryF) {
        this.countryF = countryF;
    }

    public String getOctaneRating() {
        return octaneRating;
    }

    public void setOctaneRating(String octaneRating) {
        this.octaneRating = octaneRating;
    }

    public String getWinterORsummer() {
        return winter1summer;
    }

    public void setWinterORsummer(String winterORsummer) {
        this.winter1summer = winterORsummer;
    }

    public String getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(String fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
