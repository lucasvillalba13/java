package d;

public class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate, "Car");
    }



/*
    private String model;
    private int year;
    private String color;
    private double price;

    Car(String model, int year, String color, double price) {
        this.setModel(model);
        this.setYear(year);
        this.setColor(color);
        this.setPrice(price);
    }

    public Car(Car car) {
        this.copy(car);
    }

    @Override
    public String toString() {
        return "Car [model= " + model + " year = " + year + " color = " + color + " price = " + price;

    }


    void drive() {
        System.out.println("you drive the " + model);
    }

    void brake() {
        System.out.println("you step on the brake");
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void copy(Car car) {
        this.setModel(car.getModel());
        this.setColor(car.getColor());
        this.setYear(car.getYear());
        this.setPrice(car.getPrice());
    }
*/

}
