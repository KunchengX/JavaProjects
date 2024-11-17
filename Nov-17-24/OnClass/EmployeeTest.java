public class EmployeeTest {
    public static void main(String[] args) {
        Employee Tom = new Employee("Tom", "Cat", 100);
        Employee Jerry = new Employee("Jerry", "Mouse", 50);
        double yearSalaryTom, yearSalaryJerry;
        yearSalaryTom = Tom.getsalary();
        yearSalaryJerry = Jerry.getsalary();
        System.out.println(yearSalaryTom * 12 + " " + yearSalaryJerry * 12);

        yearSalaryTom = yearSalaryTom * 1.1;
        yearSalaryJerry = yearSalaryJerry * 1.1;
        System.out.println(yearSalaryTom * 12 + " " + yearSalaryJerry * 12);
    }
}

class Employee {
    String firstName;
    String lastName;
    double salary;

    public Employee(String first, String last, double sal){
        firstName = first;
        lastName = last;
        salary = sal;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public void setsalary(double salary){
        this.salary = salary;
    }

    public String getfirstName(){
        return firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public double getsalary(){
        if (salary <= 0){
            salary = 0;
        }
        return salary;
    }

}
