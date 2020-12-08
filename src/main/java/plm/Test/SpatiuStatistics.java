package plm.Test;

public class SpatiuStatistics implements VisitorSpace{
    int spatiutxt=0;
    int spatiusvg=0;
    int spatiump3=0;
    @Override
    public void visit(txt t) {
        this.spatiutxt=spatiutxt +5;
    }

    @Override
    public void visit(svg svg) {
        this.spatiusvg=spatiusvg+45;
    }

    @Override
    public void visit(mp3 mp3) {
        this.spatiump3=spatiump3+3;
    }

    @Override
    public void visit(Director dir) {

    }
    public void printStatistics(){
        System.out.println("Director Statistics: ");
        System.out.println("*** Spatiu txt: " + spatiutxt +" Kb");
        System.out.println("*** Spatiu svg: " + spatiusvg +" Kb");
        System.out.println("*** Spatiu mp3: " + spatiump3 +" Mb");
    }
}
