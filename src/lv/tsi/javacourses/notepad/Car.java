package lv.tsi.javacourses.notepad;

public class Car extends Record {
    private String vehicleType;
    private String vehicleBrand;


    @Override
    public void askInfo() {
        vehicleBrand = Asker.askString("Enter car brand");
        vehicleType = Asker.askString("Enter car type");
    }


    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + vehicleBrand + '\'' +
                ", carType='" + vehicleType + '\'' +
                '}';
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }
}
