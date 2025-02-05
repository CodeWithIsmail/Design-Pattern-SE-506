public class Engineer extends Employee {
    public Engineer(double monthlySalary) {
        super(monthlySalary);
    }

    @Override
    public double payAmount() {
        return monthlySalary;
    }
}