package carProgram;

import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet;

    public FleetOfCars() {
        fleet = new ArrayList<>();
    }

    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int sum = 0;
        for (Car c : fleet) {
            sum += c.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString() {
        String sum = "";
        for (Car c : fleet) {
            sum += c;
        }
        return ("<<Welcome to Ahmads Garage>> " + "\n" + "\n" + "Cars available: " + fleet.size() + sum + "\n" + "The total registraion fee for our cars is: ")
                + getTotalRegistrationFeeForFleet();
    }

}
