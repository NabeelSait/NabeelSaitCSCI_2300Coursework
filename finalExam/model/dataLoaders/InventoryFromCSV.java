package model.dataLoaders;

import model.store.Inventory;
import model.store.Item;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

public class InventoryFromCSV extends InventoryFromFile
{

   public InventoryFromCSV(String fileName)
   {
       super(fileName);
   }
   public Inventory readFromFile() throws IOException
   {
      Inventory result = new Inventory();
      try
      {
         String row;
         BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
         while ((row = csvReader.readLine()) != null)
         {
             String[] data = row.split(",");
             int itemID = Integer.valueOf(data[0]);
             float price = Float.valueOf(data[2]);
             result.add(new Item(itemID, data[1], price));
         }
         csvReader.close();
      }
      catch (IOException e)
      {
         System.out.println("File not found");
      }
      return result;
   }
}
