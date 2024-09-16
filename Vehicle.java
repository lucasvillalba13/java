package d;

import java.time.LocalDateTime;
import java.time.Duration;

public class Vehicle{
    private String licensePlate;
    private String vehicleType;
    private LocalDateTime entryTime;

    public Vehicle(String licencePlate, String vehicleType){
        this.licensePlate = licencePlate;
        this.vehicleType = vehicleType;
        this.entryTime = LocalDateTime.now();
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public long calculateStoredTime(){
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(entryTime, now);
        return duration.toMinutes();
    }
}
