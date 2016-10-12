package payrollsystem;

/**
 * Created by Sean McCay on 10/5/2016.
 */
public class Vehicle {
    private String plateNumber;
    private String color;

    public Vehicle(String tempPlate, String tempColor){
        setPlateNumber(tempPlate);
        setColor(tempColor);
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
