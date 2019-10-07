import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.lang.Math.*;

public class CheckerBoard extends JPanel
{
   private int size;

   public CheckerBoard(int s)
   {
      this.size = s;
      setPreferredSize(new Dimension(this.size, this.size));
   }

   protected void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setColor(Color.RED);
      boolean isRed = true;
      for (int i = 0; i < this.size; i+= this.size/5)
      {
         for (int j = 0; j < this.size; j += this.size/5)
         {
            if (isRed)
            {
               g.setColor(Color.RED);
               isRed = false;
            }
            else
            {
               g.setColor(Color.BLACK);
               isRed = true;
            }
            g.fillRect(i, j, this.size/5, this.size/5);
         }
      }
   }
}
