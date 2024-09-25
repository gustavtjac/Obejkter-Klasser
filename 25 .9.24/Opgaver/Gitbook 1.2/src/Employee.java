public class Employee {
    private double salary;
    private String firstname;
    private String lastName;

    public Employee(double salary, String firstname, String lastName) {
        if (salary < 0){
            this.salary = 0;
        }
        this.salary = salary;
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void raiseSalaryPercent(double raise) {
        this.salary = this.salary + this.salary * (raise/100);
    }

}
