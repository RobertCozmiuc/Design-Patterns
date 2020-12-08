package plm;

import java.io.IOException;

public interface Element {


    void print() throws IOException;

    void accept(Visitor visitor);
}

