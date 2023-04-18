package carProgram;

public class ElectricCar extends ACar {

    private int batteryCapacityInWh;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int doors, int batteryCapacityInWh, int maxRange) {
        super(registrationNumber, make, model, doors);
        this.batteryCapacityInWh = batteryCapacityInWh;
        this.maxRange = maxRange;
    }

    int getBatteryCapacitykWt() {
        return this.batteryCapacityInWh;
    }

    int getMaxRangeKm() {
        return maxRange;
    }

    int getKhPrKm() {
        return (int) ((batteryCapacityInWh / 91.25) / 100);
    }

    public int getRegistrationFee() {
        if (getKhPrKm() < 5) {
            return 10470;
        } else if (getKhPrKm() < 10) {
            return 5500;
        } else if (getKhPrKm() < 15) {
            return 2340;
        } else if (getKhPrKm() < 20) {
            return 1050;
        } else {
            return 330;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Brand: "+getMake()+", Model: "+getModel()+", Number of Doors: "+getNumberOfDoors()
                +", Km/Liter: "+getKhPrKm()+", Number Plate: "+getRegistrationNumber()
                +", Fuel Type: Electric"+"\n"+"Registration Fee: "+getRegistrationFee()+"\n";
    }
}
