public abstract class Employee {
    protected double monthlySalary;

    public Employee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public abstract double payAmount();
}



