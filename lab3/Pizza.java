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
    Topping newTopping = new Topping(t);
    toppings[count] = newTopping;
    count ++;
  }

  public String toString()
  {
    String out = "";
    for (int i = 0; i < this.count; i++)
    {
      out += toppings[i].toString() + "\n";
    }
    return out;
  }
}
