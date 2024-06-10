package JavaCodingPractice60;
 // Super class / Parent class
public class Person {

    String name;
    int age;

     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public void displayDetails() {
        System.out.println("Person Name:" + " "+ name + " & " + "Person Age:" + " " + age);

    }

}
