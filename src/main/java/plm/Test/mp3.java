package plm.Test;

public class mp3 implements Fisiere{
    String nume;

    public mp3(String n){
        nume=n;
    }

    public void print()
    {
        System.out.println(nume+".mp3");
    }
    public void accept(VisitorSpace visitor) {
        visitor.visit(this);
    }
}
