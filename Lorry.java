package Lector3.lesson2;

public class Lorry extends Car{
    double maxWeight;
    public Lorry(String mark,double weight, Engine engine, double maxWeight){
        this.mark=mark;
        this.weight=weight;
        this.engine=engine;
        this.kind="Lorry";
        this.maxWeight=maxWeight;
    }
    public void printInfo(){
        System.out.println("Mark: " + mark + "Class: " + kind + "Weight(kg): " + weight + "Engine power(hp): " + engine.power
                + "Engine manufacturer: " + engine.manufacturer + "Max weight(kg): " + maxWeight);
    }
}
