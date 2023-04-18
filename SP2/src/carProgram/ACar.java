package carProgram;

public abstract class ACar implements Car {

    private String registrationNumber;
    private final String brand;
    private final String model;
    private final int getNumberOfDoors;
    public int i = 0;
    public static int k = 0;


    public ACar(String registrationNumber, String brand, String model, int doors) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.getNumberOfDoors = doors;
        k++;
        this.i = k;

    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public String getMake() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getNumberOfDoors() {
        return this.getNumberOfDoors;
    }

    @Override
    public String toString() {
        return  "\n" + "\n" + "Car number: "+i;
    }

}
