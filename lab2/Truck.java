public class Truck extends Vehicle
{
  int blength, doorNumber, tCapacity;

  public Truck(String mak, String mod, int y, int bl, int dN, int tC)
  {
    super(mak, mod, y);
    this.blength = bl;
    this.doorNumber = dN;
    this.tCapacity = tC;
  }

  public String toString()
  {
    String out = super.toString();
    out += " Body Length: " + blength + " feet Number of Doors: " + doorNumber + " Towing Capacity: " + tCapacity + " lbs \n";
    return out;
  }
}
