package carProgram;

abstract class AFuelCar extends ACar{
    int kmPrLitre;
    private int carCounter = 0;
    private static int i = 0;

    public AFuelCar(String registrationNumber, String make, String model, int doors, int kmPrLitre) {
        super(registrationNumber, make, model, doors);
        this.kmPrLitre = kmPrLitre;
        i++;
        carCounter = i;
    }

    abstract String getFuelType();
    public int getKmPrLitre(){
        return this.kmPrLitre;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+"-----------------------------------------"+"\n";
    }
}
