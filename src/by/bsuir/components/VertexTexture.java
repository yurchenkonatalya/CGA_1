package by.bsuir.components;

public class VertexTexture implements Component {
    private double u;
    private double v = 0;
    private double w = 0;
    private final String componentName = "vt";

    public VertexTexture(double u){
        this.u = u;
    }

    public VertexTexture(double u, double v){
        this.u = u;
        this.v = v;
    }

    public VertexTexture(double u, double v, double w){
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @Override
    public String toString(){
        return this.componentName+" v="+this.v+" u="+this.u+" w="+this.w+"\n";
    }
}
