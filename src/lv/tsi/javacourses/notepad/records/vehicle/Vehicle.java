package lv.tsi.javacourses.notepad.records.vehicle;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.records.AbstractRecord;

public class Vehicle extends AbstractRecord {
    private String vehicleType;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehiclePassengersCount;
    private String vehicleWheelCount;
    private String vehicleYear;
    private String vehicleColor;


    @Override
    public void askInfo() {
        vehicleBrand = Asker.askString("Enter car brand");
        vehicleType = Asker.askString("Enter car type");
        vehicleBrand = Asker.askString("Enter car brand");
        vehicleType = Asker.askString("Enter car type");
        vehicleType = Asker.askString("Enter car type");
        vehicleType = Asker.askString("Enter car type");
        vehicleType = Asker.askString("Enter car type");
    }

    @Override
    protected String type() {
        return null;
    }




    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehiclePassengersCount() {
        return vehiclePassengersCount;
    }

    public void setVehiclePassengersCount(String vehiclePassengersCount) {
        this.vehiclePassengersCount = vehiclePassengersCount;
    }

    public String getVehicleWheelCount() {
        return vehicleWheelCount;
    }

    public void setVehicleWheelCount(String vehicleWheelCount) {
        this.vehicleWheelCount = vehicleWheelCount;
    }

    public String getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
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
