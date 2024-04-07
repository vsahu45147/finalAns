package java_problems_datastructures;
import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private int modalNo;
    private String name;
    private int stock;

    public Car(int modalNo, String name, int stock) {
        this.modalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }

    public String toString() {
        return modalNo + " " + name + " " + stock;
    }
}

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        
        carList.add(new Car(2013, "Creta", 10));
        carList.add(new Car(2020, "MG", 13));
        carList.add(new Car(2018, "Kia", 20));
        carList.add(new Car(2017, "Audi", 45));
        carList.add(new Car(2015, "BMW", 55));

        System.out.println("Before sorting:");
        printCarList(carList);

        Collections.sort(carList);

        System.out.println("\nAfter sorting by stock:");
        printCarList(carList);
    }

    public static void printCarList(ArrayList<Car> carList) {
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
