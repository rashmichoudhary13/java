package Packages.com.example.utils;

//Syntax to use the package
import Packages.com.example.geometry.Circle;    //package + class name
import Packages.com.example.geometry.Rectangle;

public class Calculator{
    public static void main(String[] args) {
        Circle obj = new Circle(5);
        obj.area();

        Rectangle obj2 = new Rectangle(5,3);
        obj2.area();
    }
}