package JavaCodingPractice60;

public class Manager  extends Employee{
    int teamSize;

    public Manager(String name, int age, int employeeId, String department, int teamSize) { // Create constructor
        super(name, age, employeeId, department);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team size:" + " " + teamSize);
    }
}
