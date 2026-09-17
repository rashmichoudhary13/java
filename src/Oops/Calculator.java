package Oops;

//PolyMorphism:
//Demonstrates Method Overloading
public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public void diplay(String name, int age){
        System.out.printf("I'm first \nName is %s \nThe age is: %d\n",name,age);
    }

    public void diplay(int age, String name){
        System.out.printf("I'm Second \nName is %s \nThe age is: %d",name,age);
    }

    public double add(double a, double b){
        return a+b;
    }
}

class Test{
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(5,3));
        System.out.println(obj.add(4,5,3));
        System.out.println(obj.add(2.5,4.7));
        obj.diplay("Rashmi",23);
        obj.diplay(29,"Jungkook");
    }
}
