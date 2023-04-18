package carProgram;

public abstract class ACar implements Car {

    private String registratonNumber;
    private final String make;
    private final String model;
    private final int getNumberOfDoors;

    public ACar(String registrationNumber, String make, String model, int doors){
        this.registratonNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.getNumberOfDoors = doors;
    }
    public String getRegistrationNumber(){
        return this.registratonNumber;
    }
    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getNumberOfDoors(){
        return this.getNumberOfDoors;
    }

    @Override
    public String toString(){
        return null;
    }

}
