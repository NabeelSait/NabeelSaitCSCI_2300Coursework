import java.util.ArrayList;

public abstract class Card implements IPaymentMethod
{
   private ArrayList<Integer> number;

   public boolean pay(double amount)
   {
      return true;
   }
}
