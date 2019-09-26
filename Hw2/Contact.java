public class Contact
{
  private String name;
  private int phoneNumber;

  public Contact(String n, int pn)
  {
    this.name = n;
    this.phoneNumber = pn;
  }

  public String getName()
  {
    return this.name;
  }

  public int getPhone()
  {
    return this.phoneNumber;
  }
}
