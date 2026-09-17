package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

// Priority queue based on grade
public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });
        queue.offer(new Student("Rashmi", 'C'));
        queue.offer(new Student("Shyam", 'B'));
        queue.offer(new Student("Ram", 'A'));
        queue.offer(new Student("Reena", 'D'));
        queue.offer(new Student("Priti", 'A'));

        System.out.println("Queue is: " + queue);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static class Student{
        private final String name;
        private final char grade;

        public Student(String s, char g){
            this.name = s;
            this.grade = g;
        }

        public char getGrade(){
            return this.grade;
        }

        @Override
        public String toString(){
            return name + " : " + grade;
        }
    }
}
