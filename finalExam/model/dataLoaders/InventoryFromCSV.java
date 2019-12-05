package model.dataLoaders;

import model.store.Inventory;
import model.store.Item;

import java.io.IOException;

public class InventoryFromCSV
{
   protected String fileName;
   public InventoryFromCSV(String fileName)
   {
       this.fileName = fileName;
   }
   public Inventory readFromCSV() throws IOException
   {
      Inventory result = new Inventory();
      // TODO: add code that reads from CSV file and populates inventory
      return result;
   }
}
