/*
 * Fix compiler and run-timme errors of this code.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Driver
{
   public static void write(ArrayList<Integer> data, String fileName)
   {
       FileWriter writer = null;
       try
       {
         writer = new FileWriter(fileName);
       }
       catch(IOException e)
       {
          System.out.println("IOException Error");
       }

       for (int i = 0; i < data.size(); i++)
       {
          try
          {
             writer.write(data.get(i));
          }
          catch(IOException e)
          {
             System.out.println("IOException Error");
          }
       }

   }
   public static void main(String []args)
   {
      ArrayList<Integer> myNumbers = new ArrayList<Integer>();
      for(int i = 0; i < 10; i++)
      {
          myNumbers.add(i);
      }
      write(myNumbers, "./results.txt");
   }
}
