package by.bsuir.components;

public class VectorNormal implements Component{
    private double i;
    private double j;
    private double k;
    private int index;
    private final String componentName = "vn";
    //TODO добавить индексы

    public VectorNormal(double i, double j, double k, int index){
        this.i = i;
        this.j = j;
        this.k = k;
        this.index = index;
    }

    @Override
    public String toString(){
        return this.componentName+" i="+this.i+" j="+this.j+" k="+this.k+" index="+this.index+"\n";
    }
}
