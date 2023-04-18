package carProgram;

import java.util.ArrayList;

public class FleetOfCars{
    private ArrayList<Car> fleet;

    public FleetOfCars(){
        fleet = new ArrayList<>();
    }

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int sum = 0;
        for(Car c : fleet){
            sum += c.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString(){
        String sum = "";
        for(Car c: fleet){
            sum += c+", "+"⧵n";
        }
        return ("Vi ejer følgende biler: "+sum);
    }
}
