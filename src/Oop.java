// this is use to refer current object in java
class Student {
  String name;
  String gender;
  Integer marks;
  public void studentInfo(){
  System.out.println("Student name is "+this.name+"  gender is "+this.gender+"  marks obtain is "+this.marks);
  }
}
class Pen{
  String color;
  String type;
  public void write(){
    System.out.println("writing something ...");
  }
  public void printColor(){
    System.out.println(this.color);
  }
}
public class Oop{
  public static void main(String args[]){
      Pen pen1=new Pen();
      pen1.color="Blue";
      pen1.type="ball";
      pen1.printColor();
      
      System.out.println();

      Pen pen2=new Pen();
      pen2.color="red";
      pen2.type="gel";
      pen2.printColor();

      System.out.println();

      Student stu1 = new Student();
      stu1.name="pranav";
      stu1.gender="male";
      stu1.marks=90;
      stu1.studentInfo();

      System.out.println();
      
      Student stu2 = new Student();
      stu2.name="utkarsh";
      stu2.gender="male";
      stu2.marks=80;
      stu2.studentInfo();
  }
}
