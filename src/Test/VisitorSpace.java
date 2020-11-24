package Test;

public interface VisitorSpace {
    public abstract void visit(txt t);
    public abstract void visit(svg svg);
    public abstract void visit(mp3 mp3);
    public abstract void visit(Director dir);
}
