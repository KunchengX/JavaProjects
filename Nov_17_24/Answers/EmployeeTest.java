/**
 * The EmployeeTest class demonstrates the creation and manipulation of Employee objects.
 * It creates two Employee objects, Andy and Judy, and prints their annual salaries.
 * It then increases their salaries by 10% and updates the salary values.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee Andy = new Employee("Andy", 50000);
        Employee Judy = new Employee("Judy", 60000);

        System.out.println("Andy's annual salary: " + Andy.getSalary());
        System.out.println("Judy's annual salary: " + Judy.getSalary());

        Andy.setSalary(Andy.getSalary() * 1.1);
        Judy.setSalary(Judy.getSalary() * 1.1);

        System.out.println("Andy's updated annual salary: " + Andy.getSalary());
        System.out.println("Judy's updated annual salary: " + Judy.getSalary());
    }
}

/**
 * The Employee class represents an employee with a name and a salary.
 * It provides methods to set and get the name and salary of the employee.
 */
class Employee {
    String name;
    double salary;

    /**
     * Constructs an Employee object with the specified name and salary.
     *
     * @param name   the name of the employee
     * @param salary the salary of the employee
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Sets the name of the employee.
     *
     * @param name the new name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the employee.
     *
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary the new salary of the employee
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Returns the salary of the employee. If the salary is less than 0, it returns 0.
     *
     * @return the salary of the employee, or 0 if the salary is less than 0
     */
    public double getSalary() {
        if (salary < 0) {
            return 0;
        }
        return salary;
    }
}
