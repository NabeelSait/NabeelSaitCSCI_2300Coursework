package model.dataLoaders;

import model.store.Inventory;

public class InventoryFromJSON
{
   protected String fileName;
   public InventoryFromJSON(String fileName)
   {
      this.fileName = fileName;
   }
   public Inventory readFromJSON()
   {
      return new Inventory();
   }
}

