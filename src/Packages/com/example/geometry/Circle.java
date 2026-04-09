//Syntax to create a package
package Packages.com.example.geometry;

public class Circle {
    private int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public void area() {
        int result = (int) Math.PI * radius * radius;
        System.out.printf("Area of circle is: %d sq.km \n", result);
    }
}