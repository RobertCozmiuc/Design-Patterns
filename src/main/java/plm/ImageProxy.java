package plm;

import java.io.IOException;

public class ImageProxy implements Element{

    private String name;
    plm.Image realImage=null;

    ImageProxy(String name){
        this.name=name;
    }

    public void print() throws IOException {
        if(realImage==null){
            realImage = new Image(this.name);
        }

        realImage.print();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
