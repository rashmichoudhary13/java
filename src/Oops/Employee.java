package Oops;

public class Employee {
    private String name;
    private int age;
    private float salary;

    Employee(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return age;
    }

    public float getSalary(){
        return salary;
    }

    void displayDetails(){
        System.out.printf("The Employee name is: %s \nThe age is: %d \nThe salary is: %.1f",name,age,salary);
    }
}
