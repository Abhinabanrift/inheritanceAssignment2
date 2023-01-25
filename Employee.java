/**
 * Employee
 */
public class Employee {

    private int employeeid;
    private String name;
    private double salary;
    public Employee(int employeeid, String name) {
        this.employeeid = employeeid;
        this.name = name;
    }
    public int getEmployeeid() {
        return employeeid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}