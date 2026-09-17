package Oops.Abstract;

public abstract class Bird implements Flyable{
    private String birdName;

    public Bird(String birdName) {
        this.birdName = birdName;
    }
}

class Eagle extends Bird{

    public Eagle(String birdName) {
        super(birdName);
    }

    public void fly(){
        System.out.println("The bird is flying freely in the sky");
    }
}

class TestBird{
    public static void main(String[] args) {
        Eagle obj = new Eagle("Parrot");
        obj.fly();
    }
}
