package model.cart;

import model.store.Item;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.Iterator;

public class CartTest
{
   @Test
   public void addItem_AddOneItem()
   {
      Cart cart = new Cart();
      Item item = new Item(12345, "X", 0);
      cart.addItem(item);
      assertEquals("Mismatch on number of cart items", 1, cart.items.size());
   }

   @Test
   public void addItem_AddTwoItems()
   {
      Cart cart = new Cart();
      Item item1 = new Item(12345, "X", 0);
      Item item2 = new Item(12435, "Y", 0);
      cart.addItem(item1);
      cart.addItem(item2);

      assertEquals("Expected two items", 2, cart.items.size());
   }

   @Test
   public void testDuplicate()
   {
      Cart cart = new Cart();
      Item item = new Item(12345, "X", 0);
      cart.addItem(item);
      cart.addItem(item);
      assertEquals("Duplicate Item Added", 1, cart.items.size());
   }

   @Test
   public void checkisEmpty()
   {
      Cart cart = new Cart();
      assertTrue("Expected cart to be empty", cart.isEmpty());
   }

   @Test
   public void checkIterator()
   {
      Cart cart = new Cart();
      Item item = new Item(12345, "X", 0);
      cart.addItem(item);
      Iterator<CartItem> it = cart.itemIterator();
      assertTrue("Iterator not properly assigned", it.hasNext());
   }

   @Test
   public void testEmptyTotal()
   {
      Cart cart = new Cart();
      assertEquals("Total is not equal to 0", 0, cart.getTotal(), 0);
   }

   @Test
   public void testgetTotal_oneItem()
   {
      Cart cart = new Cart();
      Item item = new Item(12345, "X", 1);
      cart.addItem(item);

      assertEquals("Total is not equal to $1.00", 1, cart.getTotal(), 0);
   }

   @Test
   public void testgetTotal_twoItems()
   {
      Cart cart = new Cart();
      Item item1 = new Item(12345, "X", 1);
      Item item2 = new Item(12435, "Y", 2);
      cart.addItem(item1);
      cart.addItem(item2);

      assertEquals("Total is not equal to $3.00", 3, cart.getTotal(), 0);
   }

   @Test
   public void testgetTotal_floats()
   {
      Cart cart = new Cart();
      Item item1 = new Item(12345, "X", 1.73f);
      Item item2 = new Item(12435, "Y", 2.60f);
      Item item3 = new Item(1234, "Z", 3.45f);
      cart.addItem(item1);
      cart.addItem(item2);
      cart.addItem(item3);

      assertEquals("Total is not equal to $7.78", 7.78, cart.getTotal(), 0);
   }
}
