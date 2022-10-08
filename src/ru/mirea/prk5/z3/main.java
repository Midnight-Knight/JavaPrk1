package ru.mirea.prk5.z3;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class main extends JFrame{

    public main (String a) throws IOException{
        super("Image");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BufferedImage img = ImageIO.read(new File(a));
        JLabel label = new JLabel(new ImageIcon(img));
        add(label);
    }

    public static void main(String[] args) throws IOException {
        new main(args[0]).setVisible(true);
    }
}
