package Java.syntax;

interface Vehicle {

    void start();   // abstract method
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class InterMain {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}
