package payrollsystem;

/**
 * Created by Sean McCay on 10/5/2016.
 */
public class FullTime extends Employee{
    private double salary;
    private double overtime;

    public FullTime(int id, String name, double salary, double hourAndHalf, Vehicle vehicle) {
        super(id, name, vehicle);
        this.overtime = hourAndHalf;
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        System.out.println("Full time employee.");
        return (this.getSalary() + this.getOvertime());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
