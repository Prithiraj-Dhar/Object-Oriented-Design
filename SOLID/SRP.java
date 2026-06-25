// Single Responsibility Principle (SRP)
// A class should have only one reason to change, meaning it should have a single and well defined responsibility.


// Violation of SRP -> 
class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double calculateSalary() {
        return salary * 12; // Annual salary
    }
    public void generatePayrollReport() {
        System.out.println("Payroll Report for " + name + ": $" + salary * 12);
    }
}

// Apply SRP
class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double calculateAnnualSalary() {
        return salary * 12;
    }
    public String getName() {
        return name;
    }
}
class PayrollReportGenerator {
    public void generate(Employee employee) {
        System.out.println(
            "Payroll Report for " +
            employee.getName() +
            ": $" +
            employee.calculateAnnualSalary()
        );
    }
}