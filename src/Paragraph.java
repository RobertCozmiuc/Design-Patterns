public class Paragraph implements Element {
    public String name;
    Paragraph(String n)
    {
        name=n;
    }
    public void print()
    {
        System.out.println("Paragraph: "+name);
    }
}
