package model.dataLoaders;

import model.store.Inventory;

public class InventoryFromJSON extends InventoryFromFile
{
   public InventoryFromJSON(String fileName)
   {
      super(fileName);
   }
   public Inventory readFromFile()
   {
      return new Inventory();
   }
}
