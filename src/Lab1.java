import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Lab1 {

        public static void main(String[] args) throws Exception {
            Command cmd1 = new OpenCommand("book.json");
            cmd1.execute();
            Command cmd2 = new StatisticsCommand();
            cmd2.execute();
            DocumentManager.getBook().print();

        }


    }

