package payrollsystem;

/**
 * Created by Sean McCay on 10/5/2016.
 */

public abstract class Employee {
    //Define class state
    private String employeeId;
    private String name;
    private Vehicle  vehicle;

    //getters and setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


}
