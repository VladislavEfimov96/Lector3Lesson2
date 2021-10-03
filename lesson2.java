package Lector3.lesson2;

public class lesson2 {
    public static void main(String args[]){
        Engine mazEngine = new Engine(600.0, "MAZ");
        Car car2 = new Lorry("MAZ", 9000.0, mazEngine, 100000.0);
        car2.start();
        car2.turnLeft();
        car2.turnRight();
        car2.stop();
        car2.printInfo();
        Engine ferrariEngine = new Engine(247.0, "Ferrari");
        Car car3 = new SportCar("Ferrari", 1250.0, ferrariEngine, 240.0);
        car3.start();
        car3.turnLeft();
        car3.turnRight();
        car3.stop();
        car3.printInfo();
    }
}
