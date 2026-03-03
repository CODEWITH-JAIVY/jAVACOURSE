public class vehicleSpot {

    private int spotId;
    private VehicleType vehicleType;
    private Vehicle vehicle;
    private boolean isfree;

    public boolean assignVehicle(Vehicle vehicle) {
        if (isfree && vehicle.getVehicleType() == vehicleType) {
            isfree = false;
            this.vehicle = vehicle;
            return true;
        }
        return false;
    }

    public void freeSpot() {
        isfree = true;
        this.vehicle = null;
    }
}