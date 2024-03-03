package DagestanJava.lesson11;

public class Car {
String color;
String engine;
int doorNum;

Car(String color, String engine, int doorNum){
    this.color=color;
    this.engine=engine;
    this.doorNum=doorNum;
}
}

class CarTest{
    static Car car1 = new Car("White", "V60", 4);
    static Car car2 = new Car("Black", "V8", 2);

    static void doorChanger(int door){
    car1.doorNum=door;
    car2.doorNum=door;
    }
    static void colorChanger(Car carN1, Car carN2){
            Car tempCar = new Car(car1.color, "",0);
            car1.color = car2.color;
            car2.color = tempCar.color;
    }

    public static void main(String[] args) {
        System.out.println(car1.color);
        System.out.println(car2.color);
            colorChanger(car1, car2);
        System.out.println(car1.color);
        System.out.println(car2.color);
            colorChanger(car1, car2);
        System.out.println(car1.color);
        System.out.println(car2.color);

    }
}
