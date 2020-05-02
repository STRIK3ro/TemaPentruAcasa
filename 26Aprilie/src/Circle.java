public class Circle extends Shapes {
    private int raza;
    public Circle(){

    }
    public Circle(int nrEdges,int raza){
        this.raza=raza;
        this.nrEdges=nrEdges;
    }
    public String draw(){
        return "Desenez un cer ";
    }
    public double perimetru(){
        return 2*3.14*raza;
    }
    public double arie(){
        return 3.14*(raza^2);
    }
}
