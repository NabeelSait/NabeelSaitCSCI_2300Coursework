package ui;

import model.store.*;
import model.cart.Cart;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.util.Iterator;
import java.util.ArrayList;

public class StoreView extends JPanel
{
   StoreModel store;
   Cart       cart;
   ArrayList<JButton> buttons;

   public StoreView(StoreModel store, Cart cart)
   {
      super();
      this.store = store;
      this.cart = cart;
      buttons = new ArrayList<JButton>();
      redraw();
   }

   public void redraw()
   {
      removeAll();
      BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
      setLayout(boxLayout);

      Iterator<Item> itemIterator = store.inventoryIterator();
      while (itemIterator.hasNext())
      {
         JPanel itemPanel = new JPanel();

         itemPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
         Item item = itemIterator.next();
         JLabel itemLabel = new JLabel(item.getDescription());
         itemLabel.setBorder(new EmptyBorder(0, 0, 0, 10));
         JLabel priceLabel = new JLabel("$"+item.getPrice());
         JButton itemButton = new JButton("ADD TO CART");
         itemButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               cart.addItem(item);
            }
         });
         itemPanel.add(itemLabel);
         itemPanel.add(priceLabel);
         itemPanel.add(itemButton);
         buttons.add(itemButton);
         add(itemPanel);
      }
   }

   /**
    * Keep this method: I'll use it to test your solution
    */
   public Iterator<JButton> addItemButtonIterator()
   {
      return buttons.iterator();
   }
}
