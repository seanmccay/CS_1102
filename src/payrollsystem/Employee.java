package payrollsystem;

/**
 * Created by Sean McCay on 10/5/2016.
 */

public abstract class Employee {
    //Define class state
    private int employeeId;
    private String name;
    private Vehicle  vehicle;

    public Employee(){
        System.out.print("... inside default constructor");
        employeeId = 0;
        name = "";
    }

    public Employee(int tempEmployeeId, String tempName, Vehicle tempVehicle){
        System.out.println("... inside of non-default Employee constructor.");
        employeeId = tempEmployeeId;
        name = tempName;
        vehicle = tempVehicle;
    }

    public Employee(int tempEmployeeId, String tempName, String tempPlate, String tempColor){
        System.out.println("... inside of non-default Employee constructor.");
        employeeId = tempEmployeeId;
        name = tempName;
        this.vehicle = new Vehicle(tempPlate, tempColor);
    }

    public abstract double calculatePay();



    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
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
