package Oops.Abstract;

public abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    void calculateArea(){
        double result = Math.PI * radius * radius;
        System.out.println("Result: " + result);
    }
}

class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    void calculateArea(){
        double result = side * side;
        System.out.println("Result: " + result);
    }
}

class Test{
    public static void main(String[] args) {
        Circle obj = new Circle(5);
        obj.calculateArea();

        Square obj2 = new Square(5);
        obj2.calculateArea();
    }
}
