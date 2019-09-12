public class Car extends Vehicle
{
  int doorNumber;
  String bodyStyle;

  public Car(String mak, String mod, int y, int dN, String bS)
  {
    super(mak, mod, y);
    this.doorNumber = dN;
    this.bodyStyle = bS;
  }

  public String toString()
  {
    String out = super.toString();
    out += " Number of Doors: " + doorNumber + " Body Style: " + bodyStyle + "\n";
    return out;
  }
}
