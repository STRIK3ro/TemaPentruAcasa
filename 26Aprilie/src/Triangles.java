public class Triangles extends Shapes {
    protected int latura1;
    protected int latura2;
    protected int latura3;
    protected int height;

    public Triangles(){

    }

    public Triangles(int nrEdges,int latura1,int latura2,int latura3,int height){
        this.latura1=latura1;
        this.height=height;
        this.latura2=latura2;
        this.latura3=latura3;
        this.nrEdges=nrEdges;
    }
    public String draw(){
        return "Ma desenez ca un triunghi . ";
    }
    public  double perimetru(){
        return latura1+latura2+latura3;
    }
    public double arie(){
        return (latura3*height)/2;
    }

}
