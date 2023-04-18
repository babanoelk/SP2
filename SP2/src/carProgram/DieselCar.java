package carProgram;

public class DieselCar extends AFuelCar {

    private String fuelType;
    public boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int doors, int kmPrLitre, String fuelType, boolean particleFilter) {
        super(registrationNumber, make, model, doors, kmPrLitre);
        this.fuelType = fuelType;
        this.particleFilter = particleFilter;
    }

    String getFuelType() {
        return this.fuelType;
    }

    public int getRegistrationFee() {

        if (kmPrLitre < 5 && particleFilter) {
            return 15260+1000;
        } else if (kmPrLitre < 10 && particleFilter) {
            return 2770+1000;
        } else if (kmPrLitre < 15 && particleFilter) {
            return 1850+1000;
        } else if (kmPrLitre < 20 && particleFilter) {
            return 1390+1000;
        } else if (kmPrLitre < 50 && particleFilter) {
            return 130+1000;
        }

        if (kmPrLitre < 5) {
            return 15260;
        } else if (kmPrLitre < 10) {
            return 2770;
        } else if (kmPrLitre < 15) {
            return 1850;
        } else if (kmPrLitre < 20) {
            return 1390;
        } else {
            return 130;
        }
    }

    @Override
    public String toString() {
        return "This is a: "+getMake()+"⧵n Model: "+getModel()+"⧵n Doors: "+getNumberOfDoors()+"⧵n kmPrLitre: "+kmPrLitre+"⧵n Nummerplate: "+getRegistrationNumber()+"⧵n FuelType: "+getFuelType()+"⧵n ParticleFilter: "+particleFilter;
    }
}
