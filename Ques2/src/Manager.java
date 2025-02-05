public class Manager extends Employee {
    private double bonus;

    public Manager(double monthlySalary, double bonus) {
        super(monthlySalary);
        this.bonus = bonus;
    }

    @Override
    public double payAmount() {
        return monthlySalary + bonus;
    }
}
