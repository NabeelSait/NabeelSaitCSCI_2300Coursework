import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.BorderLayout;
public class Driver
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("CheckerBoard");

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      CheckerBoard mainPanel = new CheckerBoard(500);
      mainPanel.setLayout(new BorderLayout());

      frame.add(mainPanel);

      frame.pack();
      frame.setVisible(true);
   }
}
