public class Pizza
{
  private Topping[] toppings;
  private int count;

  public Pizza()
  {
    this.toppings = new Topping[20];
    this.count = 0;
  }

  public Topping[] getToppings()
  {
    return toppings;
  }

  public void addTopping(String t)
  {
    if (count < 20)
    {
      Topping newTopping = new Topping(t);
      toppings[count] = newTopping;
      count ++;
    }
  }

  public String toString()
  {
    String out = "";
    for (int i = 0; i < (this.count - 1); i++)
    {
      out += toppings[i].toString() + "\n";
    }
    return out;
  }
}
