package Functional;

import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,4,5,3,2,1,4);

        List<Integer> result = list.stream()
                                    .distinct()
                                    .collect(Collectors.toList());

        System.out.println(result);

        List<Employee> emp = List.of(
                new Employee("Rashmi",40000),
                new Employee("Ram",32000),
                new Employee("Sam",5000),
                new Employee("Geeta",8000)
        );

        emp.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);



    }
}
