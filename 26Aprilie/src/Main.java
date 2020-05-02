import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Circle A=new Circle(1,3);
        Triangles B=new Triangles(3,4,2,8,7);
        Patrulater C=new Patrulater(4,8,3,6,2);
        System.out.println(A.draw());
        System.out.println("Perimetrul triughiului: "+A.perimetru());
        System.out.println("Aria triunghiului: "+A.arie());
        System.out.println(B.draw());
        System.out.println("Perimetrul patrulaterului este: "+B.perimetru());
        System.out.println("Aria patrulaterului este: "+B.arie());
        System.out.println(C.draw());
        System.out.println("Perimetrul cercului este: "+C.perimetru());
        System.out.println("Aria cercului este: "+C.arie());
    }
}
