/**
 * Created by ioa on 19.04.17.
 */

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int passengers, int fuelcap, int mpg){
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
    int range(){
        return fuelcap * mpg;
    }
    double fuelneeded(int miles){
        return miles / mpg;
    }
}
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(60,60,6);
        Vehicle sportscar = new Vehicle(2,30,8);
        int range1, range2;
        double gallons;
        int dist = 252;
        //В результате создается объект minivan, представляющий собой экземпляр класса
        //Vehicle. Иными словами, абстрактная оболочка класса обретает физическую форму.
//        minivan.fuelcap = 60;
//        minivan.passengers = 13;
//        minivan.mpg = 6;

//        sportscar.passengers = 2;
//        sportscar.fuelcap = 30;
//        sportscar.mpg = 9;

        gallons = minivan.fuelneeded(dist);
        range1 = minivan.range();
        System.out.println("минивен может провести " + minivan.passengers +
                " пассажиров на расстояие " + range1 + " миль. для преодоления " +
                dist + " миль нужно " + gallons + " галлонов топлива.");

        gallons = sportscar.fuelneeded(dist);
        range2 = sportscar.range();
        System.out.println("спорткар может провести " + sportscar.passengers +
                " пассажиров на расстояие " + range2 + " миль. для преодоления " +
                dist + " миль нужно " + gallons + " галлонов топлива.");
    }
}

