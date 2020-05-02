public class Train extends Car {
    private String wheelsType;
    private int numberOfPlace;

    public Train(){

    }

    public Train(String model,String color, int motor, String fullType,int pret,String wheelsType, int numberOfPlace ){
        this.model = model;
        this.color = color;
        this.motor = motor;
        this.yearMake = yearMake;
        this.pret = pret;
        this.fullType = fullType;
        this.wheelsType=wheelsType;
        this.numberOfPlace=numberOfPlace;
    }
}
