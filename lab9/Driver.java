import java.util.Enumeration;
import java.util.ArrayList;
import java.util.List;

public class Driver
{
   public static void main(String args[])
   {
      List<String> groceries = new ArrayList<String>();

      groceries.add("bread");
      groceries.add("milk");
      groceries.add("pasta sauce");
      groceries.add("potatoes");

      for (String g: groceries)
      {
         System.out.println(g.toString());
      }
   }
}
