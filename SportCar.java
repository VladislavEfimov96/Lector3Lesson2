package Lector3.lesson2;

public class SportCar extends Car{
    double maxSpeed;
    public SportCar(String mark,double weight, Engine engine, double maxSpeed){
        this.mark=mark;
        this.weight=weight;
        this.engine=engine;
        this.kind="Sport Car";
        this.maxSpeed=maxSpeed;
    }
    public void printInfo(){
        System.out.println("Mark: " + mark + "Class: " + kind + "Weight(kg): " + weight + "Engine power(hp): " + engine.power
                + "Engine manufacturer: " + engine.manufacturer + "Max speed(km/h): " + maxSpeed);
    }
}
