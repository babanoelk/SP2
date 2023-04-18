package carProgram;

public class Main {
    public static void main(String[] args) {


        DieselCar Touran = new DieselCar("AJ 22 394", "Volkswagen", "Touran", 5, 6, "Disel", false);
        GasolinCar SyvSerie = new GasolinCar("KJ 01 002", "BMW", "7-series", 5, 5, "Benzin");
        ElectricCar Tesla = new ElectricCar("NX 23 392", "Tesla", "Serie X", 5, 103, 350);


        FleetOfCars carList = new FleetOfCars();

        carList.addCar(Touran);
        carList.addCar(SyvSerie);
        carList.addCar(Tesla);

        System.out.println(carList.toString());
    }
}
