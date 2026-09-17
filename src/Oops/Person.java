package Oops;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Person)){
            return false;
        }
        Person ref = (Person) obj;
        return ref.age == this.age && Objects.equals(ref.name, name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(age,name);
    }
}
