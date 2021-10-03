package entities.exercise26;

public class Employee {
    
    public String name;
    public double salary;
    public double tax;

    public double netSalary() {
        
    }

    public void increaseSalary(double percentage) {
        
    }

    public String toString() {
        return name
            + ", $ "
            + String.format("%.2f", salary);
    }
}
