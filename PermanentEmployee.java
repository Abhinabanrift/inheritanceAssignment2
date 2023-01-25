public class PermanentEmployee extends Employee {

    double basicPay;
    double hra;
    float experience;
    public PermanentEmployee(int employeeid, String name,  double basicPay, double hra, float experience) {
        super(employeeid, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience; 
    }
    private double calCulateVarriablePay(){
        double xtra=.12;
        if(experience<3) xtra=0;
        else if (experience < 5)
            xtra = .05;
        else if(experience < 10) xtra=.07;
        return  xtra;
    }
    public double getBasicPay() {
        return basicPay;
    }
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
    public double getHra() {
        return hra;
    }
    public void setHra(double hra) {
        this.hra = hra;
    }
    public float getExperience() {
        return experience;
    }
    public void setExperience(float experience) {
        this.experience = experience;
    }
    void calculateMonthlySalary() {
        System.out.println( basicPay + hra + (basicPay * calCulateVarriablePay()));
    }
}
