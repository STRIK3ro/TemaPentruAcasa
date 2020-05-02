public class Excavator extends Car {


    private String cupa;

    public Excavator(){

    }

    public Excavator(String model,String color,int motor, String fullType, int yearMake,int pret,String cupa){
        this.model = model;
        this.color = color;
        this.motor = motor;
        this.yearMake = yearMake;
        this.pret = pret;
        this.fullType = fullType;
        this.cupa=cupa;
    }
}
