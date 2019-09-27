import java.security.InvalidParameterException;

public class Driver
{
   public static void main(String []argv)
   {
      try
      {
        Card tenDiamonds = new Card(10, 'D');
        System.out.println("Card is "+tenDiamonds);

        Card aceSpades = new Card(15, 'r');
        System.out.println("Card is " + aceSpades);
      }
      catch(InvalidParameterException e)
      {
        System.out.println("InvalidParameterException: " + e.getMessage());
      }
   }
}
