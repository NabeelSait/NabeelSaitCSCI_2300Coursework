/*
 * Fix compiler and run-timme errors of this code.
 */
import java.io.FileWriter;

public class WriteToFileDriver
{
   public static void write(ArrayList<Integer> data, String fileName)
   {
       FileWriter writer = null;
       writer = new FileWriter(fileName);
       for (int i = 0; i < data.size(); i++)
       {
          writer.write(data.get(i));
       }

   }
   public static void main(String []args)
   {
      ArrayList<Integer> myNumbers = null;
      for(int i = 0; i < 10; i++)
      {
          myNumbers.add(i);
      }
       
      write(myNumbers, "./results.txt");
   }
}
