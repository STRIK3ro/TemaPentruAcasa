import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Main {
    //data de azi
    Date dataDeAzi = new Date();

    //luna curenta

    //anul curent

    //un obiect care tine un text

    //ultima aparitie a lui A

    //un obiect care sa tina numarul 126

    //creem un obiect care tine caracterul S

    //pentru fiecare obiect cate 2 comportamente noi
    public static void main(String[] args) {
        int lunaCurenta = Calendar.getInstance().get(Calendar.MONTH);
        Date dataDeAzi = new Date();
        System.out.println(dataDeAzi);
        System.out.println("luna de azi este " + lunaCurenta);
        switch (lunaCurenta) {
            case 0:
                System.out.println("Ianuarie");
                break;
            case 1:
                System.out.println("Februarie");
                break;
            case 2:
                System.out.println("Martie");
                break;
            case 3:
                System.out.println("Aprilie");
                break;
            case 4:
                System.out.println("Mai");
                break;
            case 5:
                System.out.println("Iunie");
                break;
            case 6:
                System.out.println("Iulie");
                break;
            case 7:
                System.out.println("August");
                break;
            case 8:
                System.out.println("Septembrie");
                break;
            case 9:
                System.out.println("Octombrie");
                break;
            case 10:
                System.out.println("Noiembrie");
                break;
            case 11:
                System.out.println("Decembrie");
                break;
            default:
                System.out.println("Luna gresita");

        }
        int anulCurent=Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(anulCurent);

        String text=new String("Ana are mere si nu da la nimeni");
        System.out.println("Ultima aparitia a lui A este : "+text.lastIndexOf('a'));

        Integer numar=Integer.valueOf(126);
        System.out.println("numarul este "+numar);

        Character litera=Character.valueOf('s');
        System.out.println("Caracterul este "+litera);

        char[] caractere=new char[5];
        caractere[0]='m';
        caractere[1]='l';
        caractere[2]='g';
        caractere[3]='r';
        caractere[4]='a';

        String textRezultat=String.copyValueOf(caractere);
        System.out.println(textRezultat);

        String text2=" Ana are mere ";
        if(text2.startsWith(" ")||text2.endsWith(" ")){
            System.out.println("textul incepe sau se termina cu pauza");
        }
        String textFaraSpatii=text2.trim();

        if(textFaraSpatii.startsWith(" ")||textFaraSpatii.endsWith(" ")){
            System.out.println("Textul incepe cu pauza");
        }else{
            System.out.println("Textul nu se termina cu pauza");
        }
        System.out.println("Textul fara spatii este : "+textFaraSpatii);
    }

}
