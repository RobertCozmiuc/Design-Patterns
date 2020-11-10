import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Lab1 {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());
        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();

        //Image picture = new Image("resources/heart.png");
        Image picture2 = new Image("no_no_he's_got_a_point.jpg");
        //Image picture3 = new Image("resources/w3c.bmp");


    }
}
