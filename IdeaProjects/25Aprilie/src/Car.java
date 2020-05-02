public class Car {

    //obiectele au 2 caracteristici
    //stari (state)---> rep de prin atribute

    protected String model;
    protected String color;
    protected int motor;
    protected String fullType;
    protected int yearMake;
    protected int pret;

    //incapsularea se face folosindu-ne de MODIFICATORII DE ACESS
    //1.public-->vizibil pentru toata lumea
    //2.protected-->vizibil doar pentru celelalte clase din acelasi pachet SI in clasele copil
    //3.private-->vizibil doar in interiorul clasei curente
    // acestul pentru citirea atributelor se face prin intermediul metodelor get //GETTER
    // acesul pentru a modifica atributele unei clase se face prin intermediul metodelor set SETTER----->foarte important permite de a modifica acestul de a modifica doar la atributele care e nevoie
    //4.defaut=protected


    //comportamente(behaviors)---> rep prin metode

    //constructo--> fo;osit pentru instantierea oviectelor
    //constructorul este folosit pentru a instantia obiecte pe baza unei clase
    public Car(String model, String color, int motor, String fullType, int yearMake, int pret) {
        this.model = model;
        this.color = color;
        this.motor = motor;
        this.yearMake = yearMake;
        this.pret = pret;
        this.fullType = fullType;


    }
    public Car(){

    }

      public void start() {
        System.out.println("Car started");
    }

     public void stop() {
        System.out.println("car stopped");
    }

    public final void acelerare() {
        System.out.println("Car accelerates");
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getMotor(){
        return motor;
    }
    public String getFullType(){
        return fullType;
    }
    public int getYearMake(){
        return yearMake;
    }
    public int getPret(){
        return pret;
    }
    public void setPret(int pretNou){
        this.pret=pretNou;
    }
}
