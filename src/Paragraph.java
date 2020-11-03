public class Paragraph implements Element {
    public String name;
    public AlignStrategy align;
    Paragraph(String n)
    {
        name=n;
    }

    public String getName()
    {
        return this.name;
    }
    public void print()
    {
        if(align==null)
        {
            System.out.println(this.name);
        }
        else{
            align.render(this);
        }
    }

    public void setAlignStrategy(AlignStrategy c)
    {
        this.align=c;
    }

}
