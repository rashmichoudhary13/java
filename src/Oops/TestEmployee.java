package Oops;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rashmi",23,50000);

        emp1.displayDetails();
        emp1.setAge(25);
        emp1.displayDetails();
    }
}
