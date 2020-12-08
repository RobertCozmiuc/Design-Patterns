package plm.Test;

import java.io.IOException;

public class txt implements Fisiere{
    public String nume;
    public AlignStrategy align;

    public txt(String n){
        nume=n;
    }

    public String getName()
    {
        return nume;
    }
    public void print() {

        if(align==null)
        {
            System.out.println("Fisier "+ nume +".txt");
        }
        else{
            align.render(this);
        }
    }

    public void setAlignStratagy(AlignStrategy a)
    {
        align=a;
    }
    public void accept(VisitorSpace visitor) {
        visitor.visit(this);
    }
}
