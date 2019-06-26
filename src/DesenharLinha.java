import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenharLinha extends JPanel{

    @Override 
    public void paint(Graphics g)
    {
        //Get the current size of this component
        Dimension d = this.getSize();

        //draw in black
        g.setColor(Color.RED);
        //draw a centered horizontal line
        g.drawLine(0, 0, 600, 0);
    }
}
