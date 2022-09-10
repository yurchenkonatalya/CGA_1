package by.bsuir;

import by.bsuir.components.Component;
import by.bsuir.components.VectorNormal;
import by.bsuir.components.Vertex;
import by.bsuir.components.VertexTexture;

public class Parser {
    public static int index_v = 1;
    public static int index_vt = 1;
    public static int index_vn = 1;

    public Component parseLine(String line){
        String[] words = line.trim().replaceAll(" +", " ").split(" ");
        int countWords = words.length;
        if(countWords >= 2){
            switch (words[0]){
                case ("v"):
                    if(countWords == 4){
                        try {
                            Vertex v = new Vertex(
                                    Double.parseDouble(words[1]),
                                    Double.parseDouble(words[2]),
                                    Double.parseDouble(words[3]),
                                    index_v);
                            index_v++;
                            return v;
                        }catch (NumberFormatException e){
                            System.out.println("Exc: Vertex x y z");
                            return null;
                        }
                    }
                    if(countWords == 5){
                        try {
                            Vertex v = new Vertex(
                                    Double.parseDouble(words[1]),
                                    Double.parseDouble(words[2]),
                                    Double.parseDouble(words[3]),
                                    Double.parseDouble(words[4]),
                                    index_v);
                            index_v++;
                            return v;
                        }catch (NumberFormatException e){
                            System.out.println("Exc: Vertex x y z w");
                            return null;
                        }
                    }
                    break;
                case ("vt"):
                    if(countWords == 2){
                        try {
                            VertexTexture vt = new VertexTexture(
                                    Double.parseDouble(words[1]),
                                    index_vt);
                            index_vt++;
                            return vt;
                        }catch (NumberFormatException e){
                            System.out.println("Exc: VertexTexture u");
                            return null;
                        }
                    }
                    if(countWords == 3){
                        try {
                            VertexTexture vt = new VertexTexture(
                                    Double.parseDouble(words[1]),
                                    Double.parseDouble(words[2]),
                                    index_vt);
                            index_vt++;
                            return vt;
                        }catch (NumberFormatException e){
                            System.out.println("Exc: VertexTexture u v");
                            return null;
                        }
                    }
                    if(countWords == 4){
                        try {
                            VertexTexture vt = new VertexTexture(
                                    Double.parseDouble(words[1]),
                                    Double.parseDouble(words[2]),
                                    Double.parseDouble(words[3]),
                                    index_vt);
                            index_vt++;
                            return vt;
                        }catch (NumberFormatException e){
                            System.out.println("Exc: VertexTexture u v w");
                            return null;
                        }
                    }
                    break;
                case ("vn"):
                    if(countWords == 4){
                        try {
                            VectorNormal vn = new VectorNormal(
                                    Double.parseDouble(words[1]),
                                    Double.parseDouble(words[2]),
                                    Double.parseDouble(words[3]),
                                    index_vn);
                            index_vn++;
                            return vn;
                        }catch (NumberFormatException e){
                            System.out.println("Exc: VectorNormal i j k");
                            return null;
                        }
                    }
                    break;
                case ("f"):
                    break;
                default:
                    break;
            }
        }
        return null;
     }
}
