package interfaces;
interface Vehicle
{
    void start();
    void stop();
}
interface LandVehicle extends Vehicle {
    void drive();
}
interface SeaVehicle extends Vehicle {
    void floatOnWater();
}
class Car implements LandVehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void drive() {
        System.out.println("Car is being driven.");
    }
}
class Bicycle implements LandVehicle {
    @Override
    public void start() {
        System.out.println("Bicycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped.");
    }

    @Override
    public void drive() {
        System.out.println("Bicycle is being pedaled.");
    }
}
class Ship implements SeaVehicle {
    @Override
    public void start() {
        System.out.println("Ship engines started.");
    }

    @Override
    public void stop() {
        System.out.println("Ship engines stopped.");
    }

    @Override
    public void floatOnWater() {
        System.out.println("Ship is floating on water.");
    }
}
class Submarine implements SeaVehicle {
    @Override
    public void start() {
        System.out.println("Submarine engines started.");
    }

    @Override
    public void stop() {
        System.out.println("Submarine engines stopped.");
    }

    @Override
    public void floatOnWater() {
        System.out.println("Submarine is floating underwater.");
    }
}
public class VehicleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Ship ship = new Ship();
        Submarine submarine = new Submarine();

        System.out.println("Testing Car:");
        car.start();
        car.drive();
        car.stop();
        System.out.println();

        System.out.println("Testing Bicycle:");
        bicycle.start();
        bicycle.drive();
        bicycle.stop();
        System.out.println();

        System.out.println("Testing Ship:");
        ship.start();
        ship.floatOnWater();
        ship.stop();
        System.out.println();

        System.out.println("Testing Submarine:");
        submarine.start();
        submarine.floatOnWater();
        submarine.stop();
	}
}
