package lv.tsi.javacourses.notepad.records.vehicle;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.records.AbstractRecord;

public class Vehicle extends AbstractRecord {
    private String vehicleType;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehiclePassengersCount;
    private int vehicleWheelCount;
    private int vehicleYear;
    private String vehicleColor;


    @Override
    public void askInfo() {
        vehicleBrand = Asker.askString("Enter vehicle brand");
        vehicleType = Asker.askString("Enter vehicle type");
        vehicleModel = Asker.askString("Enter vehicle model");
        vehiclePassengersCount = Asker.askString("Enter passenger capacity ");
        vehicleWheelCount = Asker.askInt("Enter number of wheels");
        vehicleYear = Asker.askInt("Enter production year");
        vehicleColor = Asker.askString("Enter color");
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", vehicle Brand='" + vehicleBrand + '\'' +
                ", vehicle type='" + vehicleType + '\'' +
                ", vehicle model='" + vehicleModel + '\'' +
                ", vehicle passenger capacity='" + vehiclePassengersCount + '\'' +
                ", vehicle number of wheels='" + vehicleWheelCount + '\'' +
                ", vehicle production year='" + vehicleYear + '\'' +
                ", vehicle color='" + vehicleColor + '\'';

    }

    @Override
    protected String type() {
        return "Vehicle";
    }


    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setVehiclePassengersCount(String vehiclePassengersCount) {
        this.vehiclePassengersCount = vehiclePassengersCount;
    }

    public void setVehicleWheelCount(int vehicleWheelCount) {
        this.vehicleWheelCount = vehicleWheelCount;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}
