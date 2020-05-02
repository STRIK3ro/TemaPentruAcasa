public class TriunghiEchilaterar extends Triangles {
    public TriunghiEchilaterar(int nrEdges,int latura1){
        this.latura1=latura1;
        this.nrEdges=nrEdges;
    }

    public String draw(){
        return "Desenez un triunghi echilateral";

    }
    public double perimetru(){
        return 3*latura1;
    }
    public double arie(){
        return height*latura1;
    }
}
