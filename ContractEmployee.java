public class ContractEmployee extends Employee {
    double wage;
    float hoursWorked;
    public ContractEmployee(int employeeid, String name) {
        super(employeeid, name);
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public float getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    void calculateSalary(){
        System.out.println(wage*hoursWorked);
    }
    
}
