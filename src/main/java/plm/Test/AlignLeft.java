package plm.Test;

public class AlignLeft implements AlignStrategy {

    public void print(String name) {
        System.out.println("Paragraph " +name);
    }



    public void render(txt t) {
        System.out.println("_____"+t.getName() +".txt" );
    }
}
