package JavaCodingPractice60;
// Sub-Class / Child class
public class Employee extends Person{
    int employeeId;
    String department;

    public Employee(String name, int age, int employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Id:" + " " + employeeId + " " + "Department:" + " "+ department);
    }
}
