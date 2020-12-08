package plm.Test;

import java.io.IOException;

public interface Fisiere {

    void print() throws IOException;
    void accept(VisitorSpace visitor);
}
