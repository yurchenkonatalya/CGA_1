package by.bsuir.components;

public class Vertex implements Component{
    private double x;
    private double y;
    private double z;
    private double w = 1;
    private int index;
    private final String componentName = "v";

    public Vertex(double x, double y, double z, int index){
        this.x = x;
        this.y = y;
        this.z = z;
        this.index = index;
    }

    public Vertex(double x, double y, double z, double w, int index){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.index = index;
    }

    @Override
    public String toString(){
        return this.componentName+" x="+this.x+" y="+this.y+" z="+this.z+" w="+this.w+" index="+this.index+"\n";
    }
}
