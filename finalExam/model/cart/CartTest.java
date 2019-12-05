package model.cart;
import model.store.Item;

import org.junit.*;
import static org.junit.Assert.*;

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
}
