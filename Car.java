package d;

public class Car extends Vehicle{

    String model;
    int year;
    String color;
    double price;

    Car(){
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Car [model= " + model + " year = " + year + " color = " + color + " price = " + price;

    }

    @Override
    void go(){
        System.out.println("the car is going dea");
    }

    void drive(){
        System.out.println("you drive the "+ model);
    }
    void brake(){
        System.out.println("you step on the brake");
    }
}
