public class Patrat extends Patrulater {
    public Patrat(int nrEdges,int latura1){
        this.nrEdges=nrEdges;
        this.latura1=latura1;
    }

    public  String draw(){
        return "Desenez un patrat";
    }
    public  double perimetru(){
        return latura1*4;
    }
    public double arie(){
        return latura1*latura1;
    }
}
