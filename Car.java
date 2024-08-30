package d;

public class Car {

    String model;
    int year;
    String color;
    double price;

    Car(int year, String model, String color, int price){
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString(){
        String s = "Car [model= " + model + " year = " + year + " color = " + color + " price = " + price;
        return s;
    }


    void drive(){
        System.out.println("you drive the "+ model);
    }
    void brake(){
        System.out.println("you step on the brake");
    }
}
