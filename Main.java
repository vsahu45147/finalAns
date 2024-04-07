package java_problems_datastructures;


interface Vehicle {
    void accelerate();
    void brake();
}


class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking...");
    }

  
    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " km/h...");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to " + speed + " km/h for " + duration + " seconds...");
    }
}


class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is padeling...");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking...");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is pedaling to " + speed + " km/h...");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is pedaling to " + speed + " km/h for " + duration + " seconds...");
    }
}


public class Main {
   
    public static void main(String[] args) {
       
        Car c = new Car();

        
        c.accelerate();
        c.brake();

        
        c.accelerate(100);
        c.accelerate(100, 5);

      
        Bicycle b = new Bicycle();

       
        b.accelerate();
        b.brake();

        
        b.accelerate(20);
        b.accelerate(20, 10);
    }

    
}