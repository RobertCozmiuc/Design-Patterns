import java.util.ArrayList;

public class SubChapter extends Chapter {
    public ArrayList<Paragraph> pharagraphs=new ArrayList<>();
    public ArrayList<Image> images=new ArrayList<>();
    public ArrayList<Table> tables=new ArrayList<>();
    public int subchapterNR=0;
    SubChapter(String n) {
        super(n);
        subchapterNR++;
    }

    public void createNewParagraph(String s) {
        Paragraph paragraph = new Paragraph(s);
        pharagraphs.add(paragraph);
    }

    public void createNewImage(String s) {
        Image image=new Image(s);
        images.add(image);
    }

    public void createNewTable(String s) {
        Table table=new Table(s);
        tables.add(table);
    }

    public void print() {
        for (Paragraph p: pharagraphs
             ) {System.out.println(p.name);}
        for (Image i: images
        ) {System.out.println(i.name);}
        for (Table t: tables
        ) {System.out.println(t.name);}
    }
}
