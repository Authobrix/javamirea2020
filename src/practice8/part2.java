package practice8;

import javax.swing.*;
import java.awt.*;

class ShowImage extends JPanel
{
    private Image img;

    ShowImage()
    {
        img = getToolkit().getImage("D:\\Downloads\\bayern.jpg");
        setPreferredSize(new Dimension(820, 620));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, 10, 10, this);
    }
}



class part2 extends JFrame
{
    part2()
    {
        setContentPane(new ShowImage());
    }
    public static void main(String[] argv)
    {
        part2 mypart2 = new part2();
        mypart2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Graphics gr = mypart2.getGraphics();
        mypart2.paintComponents(gr);
        mypart2.pack();
        mypart2.setVisible(true);
    }
}