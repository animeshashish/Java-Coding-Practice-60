package JavaCodingPractice60;

public class Main {
    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();

        myVehicle.move();
        myCar.move();

        Person p = new Person("Animesh", 28);
        p.displayDetails();

        Employee emp = new Employee("Ashish", 28, 123, "Java");
        emp.displayDetails();

        Manager m = new Manager("Ankit", 29, 321, "Java", 10);
        m.displayDetails();

        BankAccount bankAcc = new BankAccount(1234567890, 50000.60);
        

        SavingAccount SvnAcc = new SavingAccount(1234567890, 30000.50, 3.5);

    }


}