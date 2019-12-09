package model.dataLoaders;

import model.store.Inventory;
import model.store.Item;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

public abstract class InventoryFromFile
{
   protected String fileName;

   public InventoryFromFile(String fileName)
   {
      this.fileName = fileName;
   }

   public abstract Inventory readFromFile() throws IOException;
}
