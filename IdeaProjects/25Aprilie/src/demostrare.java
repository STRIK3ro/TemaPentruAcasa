import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Date;

public class demostrare {
    public static void main(String[] args){
        System.out.println("tema orientata obiec : ");

        //instantierea unui obiect de tip Car

        //am instatian  un obiect de tipul Car-->folosindu-ne de constructor
        Car masinaVanzare1=new Car("VW Jetta","blue",2000,"disel",2012,7200);
        Car masinaVaznare2=new Car("audi a3","black",1800,"gas",2001,1800);
        Car masinaVanzare3=new Car("Hyunday i40","balck",1700,"gas",2014,9000);

      masinaVanzare1.start();
      masinaVanzare1.acelerare();
      masinaVanzare1.stop();
      masinaVaznare2.start();



        System.out.println("culoarea masinii de vanzare 2 este : "+masinaVaznare2.getColor() );
        System.out.println("pretul masinii de vanzare 3 este : " +masinaVanzare3.getPret());
        System.out.println("anul masinii de vanzare 1 este : "+masinaVanzare1.getYearMake());

        //exemplu ne-incapsulare
       masinaVaznare2.setPret(1600);

        //System.out.println("noua culoarea a masinii de vazare 1 este "+masinaVanzare1.color);
        System.out.println("noul pret al masinii de vanzare 2 este "+masinaVaznare2.getPret());


        Camion camionVanzare1=new Camion("Scania","blue",5000,"disel",2007,50000,"lungime medie ",10);
        camionVanzare1.start();
        camionVanzare1.acelerare();
        camionVanzare1.stop();

        Excavator excavatorVanzare1=new Excavator("bobcast","yellow",2000,"disel",2010,5000,"cupa pentru excavare" );


        Train linia22=new Train("elvetian","blue",6000,"electric",8000,"rotunde",30);
        linia22.start();

        System.out.println("Sofer de camion :"+Camion.getSofer());



        //clase si obiecte predefinite in java
        //String
        String nume=new String("Matei");
        String prenume=new String("Alexandru");
        String numeComplet=nume.concat(prenume);

        //int-->Integer
        Integer age=new Integer(31);
        //atunci cand o metoda sau un sonstructor pe care vrem sa il folosim apara taiat ---> Deprecated---->nu este recomandat sa-l mai folosim
        Integer age2=Integer.valueOf(31);
        //CLASELE INCEP INTOTDEAUNA CU LITERA MARE !!!!!!!!!!!!!!!!!

        //data
        Date dataDeAzi=new Date();
        System.out.println("data de azi este: " +dataDeAzi);

        //aceasi clasa poate face parte din pachete diferite in java
        //un pachet este un mod de organizare a claselor si oviectelor in functie de scopul si utilizarea lor
        //atunci cand folosim o clasa --->java automat importa pahetul
        //daca lipsesc importurile clasele nu pot fi folosite---> eroare
        //diferitele clase din pachete pot fi consultate to in documentatia oficiala (cand si unde verm sa le folosim)
    }

}
