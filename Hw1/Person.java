public class Person
{
  public String lastname, firstname, phoneNumber;
  Person(String f, String l, String p)
  {
    this.firstname = f;
    this.lastname = l;
    this.phoneNumber = p;
  }

  public String toString()
  {
    String person = firstname + " " + lastname + " Phone Number: " + phoneNumber;
    return person;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getFirstName()
  {
    return firstname;
  }

  public String getLastName()
  {
    return lastname;
  }
}
