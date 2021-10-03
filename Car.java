package Lector3.lesson2;

public abstract class Car {
    String mark, kind;
    double weight;
    Engine engine;
    public void start(){
        System.out.println(kind + " " + mark + " was started");
    }
    public void stop(){
        System.out.println(kind + " " + mark + " was stopped");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
    public void printInfo(){
        System.out.println("Mark: " + mark + "Class: " + kind + "Weight(kg): " + weight + "Engine power(hp): " + engine.power
                + "Engine manufacturer: " + engine.manufacturer);
    }
}
