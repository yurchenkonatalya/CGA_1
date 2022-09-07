package by.bsuir.components;

public class VectorNormal implements Component{
    private double i;
    private double j;
    private double k;
    private final String componentName = "vn";

    public VectorNormal(double i, double j, double k){
        this.i = i;
        this.j = j;
        this.k = k;
    }

    @Override
    public String toString(){
        return this.componentName+" i="+this.i+" j="+this.j+" k="+this.k+"\n";
    }
}
