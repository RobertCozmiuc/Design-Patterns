package Test;

public class AppMain {
    public static void main(String[] args) throws Exception {
        Director dir = new Director("Fisiere");
        txt txtp = new txt("parole");
        txt txtf = new txt("fructe");
        txt txtl = new txt("legume");
        mp3 muzica = new mp3("muzica");
        svg svg = new svg("svgCeva");

        dir.add(txtp);
        dir.add(txtf);
        dir.add(txtl);
        dir.add(muzica);
        dir.add(svg);

        txtp.setAlignStratagy(new AlignLeft());
        txtf.setAlignStratagy(new AlignRight());
        txtl.setAlignStratagy(new AlignCenter());

        dir.print();

        SpatiuStatistics status = new SpatiuStatistics();
        dir.accept(status);
        status.printStatistics();
    }
}
