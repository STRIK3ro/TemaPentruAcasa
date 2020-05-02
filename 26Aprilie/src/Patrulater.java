public class Patrulater extends Shapes {
    protected int latura1;
    protected int latura2;
    protected int latura3;
    protected int latura4;

    public Patrulater(){

    }
    public Patrulater(int nrEdges,int latura1,int latura2,int latura3,int latura4){
        this.latura1=latura1;
        this.latura2=latura2;
        this.latura3=latura3;
        this.latura4=latura4;
        this.nrEdges=nrEdges;
    }
    public String draw(){
        return "Ma desenez sub forma unui patrat ";
    }
    public  double perimetru(){
        return latura1+latura2+latura3+latura4;
    }
    public double arie(){
        return latura1*latura2;
    }
}
