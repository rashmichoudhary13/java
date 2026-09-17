package Oops;

// PolyMorphism
// Demonstrates Method Overriding
public class Vehicle {
    public void service(){
        System.out.println("This is vehicle servicing area");
    }
}

class Car extends Vehicle{
    @Override
    public void service(){
        super.service();
        System.out.println("This is car servicing area");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.service();
    }
}


