package d;
import java.util.ArrayList;

public class Garage {
    private int capacity;
    private ArrayList<Vehicle> vehicles;

    public Garage (int capacity){
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public boolean addVehicle(Vehicle vehicle) {
        if (vehicles.size() < capacity) {
            vehicles.add(vehicle);
            System.out.println("vehicle added " + vehicle.getLicensePlate());
            return true;
        } else {
            System.out.println("garage is full");
            return false;
        }
    }

    public boolean removeVehicle(String licensePlate) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getLicensePlate().equals(licensePlate)) {
                    vehicles.remove(vehicle);
                    System.out.println("Vehicle removed: " + licensePlate);
                    return true;
                }
            }
            System.out.println("Vehicle not found.");
            return false;
    }

    public long calculateStoredTime(String licensePlate){
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicensePlate().equals(licensePlate)){
                return vehicle.calculateStoredTime();
            }
        }
        System.out.println("Vehicle not found");
        return -1;
    }
}
