package carProgram;

public class Main {
    public static void main(String[] args) {


        Car Touran = new DieselCar("AJ 22 394", "Volkswagen", "Touran", 5, 6, "Diesel", false);
        Car SyvSerie = new GasolinCar("KJ 01 002", "BMW", "7-series", 5, 5, "Benzin");
        Car Tesla = new ElectricCar("NX 23 392", "Tesla", "Serie X", 5, 103000, 350);
        Car Ferrari488 = new GasolinCar("IS 92 102", "Ferrari","488",3,2,"Benzin");

        FleetOfCars carList = new FleetOfCars();

        carList.addCar(Touran);
        carList.addCar(SyvSerie);
        carList.addCar(Tesla);
        carList.addCar(Ferrari488);

        System.out.println(carList.toString());

    }
}
