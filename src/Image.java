public class Image implements Element {
    public String name;
    Image(String n)
    {
        name=n;
    }
    public void print()
    {
        System.out.println("Image with name: "+name);
    }
}
