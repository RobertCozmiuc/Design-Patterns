package plm.Test;

import java.io.IOException;
import java.util.ArrayList;

public class Director {
    String nume;
    public ArrayList<Fisiere> content=new ArrayList<>();
    public Director(String n){
        nume=n;
    }
    public void add(Fisiere f)
    {
        content.add(f);
    }
    public void accept(VisitorSpace visitor){
        visitor.visit(this);
        for(Fisiere elem : content){
            elem.accept(visitor);
        }
    }
    public void print() throws IOException {
        System.out.println("Director " + nume);
        for (Fisiere e : content) {

            e.print();
        }
    }
}
