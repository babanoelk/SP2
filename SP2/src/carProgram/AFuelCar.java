package carProgram;

abstract class AFuelCar extends ACar{
    int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int doors, int kmPrLitre) {
        super(registrationNumber, make, model, doors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();
    public int getKmPrLitre(){
        return this.kmPrLitre;
    }
    @Override
    public String toString(){
        return null;
    }
}
