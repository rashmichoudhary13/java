package Packages.com.example.geometry;

public class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public void area(){
        int result = length * breadth;
        System.out.printf("Area of Rectangle is: %d sq.km", result);
    }
}