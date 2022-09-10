package by.bsuir.components;

public class VertexTexture implements Component {
    private double u;
    private double v = 0;
    private double w = 0;
    private final String componentName = "vt";
    private int index;
    //TODO добавить индексы

    public VertexTexture(double u, int index){
        this.u = u;
        this.index = index;
    }

    public VertexTexture(double u, double v, int index){
        this.u = u;
        this.v = v;
        this.index = index;
    }

    public VertexTexture(double u, double v, double w, int index){
        this.u = u;
        this.v = v;
        this.w = w;
        this.index = index;
    }

    @Override
    public String toString(){
        return this.componentName+" v="+this.v+" u="+this.u+" w="+this.w+" index="+this.index+"\n";
    }
}
