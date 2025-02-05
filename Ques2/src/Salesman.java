public class Salesman extends Employee {
    private double commission;

    public Salesman(double monthlySalary, double commission) {
        super(monthlySalary);
        this.commission = commission;
    }

    @Override
    public double payAmount() {
        return monthlySalary + commission;
    }
}
