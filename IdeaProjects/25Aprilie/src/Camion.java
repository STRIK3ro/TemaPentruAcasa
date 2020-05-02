public class Camion extends Car {

    private String traller; // --->variabile globale--->le pot folosi oriunde in clasa
    private int shiftGear;

    private static String sofer="Sofer cu permis categoria C si D";

    public Camion(){

    }

    public Camion(String model,String color,int motor, String fullType, int yearMake,int pret, String traller,int shiftGear){
        this.model=model;
        this.color=color;
        this.motor=motor;
        this.fullType=fullType;
        this.yearMake=yearMake;
        this.pret=pret;
        this.traller=traller;
        this.shiftGear=shiftGear;
    }

    //suprascriu metoda star
    //nu am schimbat tipul ,numele , parametri
    public void start(){
        int currentGear=2;//variabila locala pentru metoda start---->nu poate fi folosita in afara metodei start , nu este vizibila in afara metodei start
        System.out.println("nuamrul de viteze este : " +shiftGear);
        System.out.println("Camion started");
    }
    public void stop(){
        System.out.println("viteza curenta este :");
        System.out.println("Camion stoped");
    }
    public static String getSofer(){
        return sofer;
    }


}
