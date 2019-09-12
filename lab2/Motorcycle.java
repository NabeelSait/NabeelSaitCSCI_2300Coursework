public class Motorcycle extends Vehicle
{
  String type;
  boolean sidecar;

  public Motorcycle(String mak, String mod, int y, String t, boolean sc)
  {
    super(mak, mod, y);
    this.type = t;
    this.sidecar = sc;
  }

  public String toString()
  {
    String out = super.toString();
    out += " Type: " + type;
    if (sidecar)
    {
      out += " Has sidecar" + "\n";
    }
    else
    {
      out += " Does not have sidecar" + "\n";
    }
    return out;
  }
}
