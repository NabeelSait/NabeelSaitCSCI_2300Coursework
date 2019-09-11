import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Phonebook
{
  private ArrayList<Person> people;

  Phonebook()
  {
    people = new ArrayList<Person>();
  }

  public Person[] list()
  {
    Person []p = {};
    return people.toArray(p);
  }

  private void addPerson(Person p)
  {
    people.add(p);
  }

  public Person[] searchByNumber(String pN)
  {
    ArrayList<Person> matches = new ArrayList<Person>();
    for (int i = 0; i < people.size(); i++)
    {
      System.out.println(s);
      if (people.get(i).getPhoneNumber().equals(pN))
      {
        matches.add(people.get(i));
      }
    }
    Person []p = {};
    return matches.toArray(p);
  }

  public Person[] searchByFirstName(String fn)
  {
    ArrayList<Person> matches = new ArrayList<Person>();
    for (int i = 0; i <people.size(); i++)
    {
      if (people.get(i).getFirstName().equals(fn))
      {
        matches.add(people.get(i));
      }
    }
    Person []p = {};
    return matches.toArray(p);
  }

  public Person[] searchByLastName(String ln)
  {
    ArrayList<Person> matches = new ArrayList<Person>();
    for (int i = 0; i <people.size(); i++)
    {
      if (people.get(i).getLastName().equals(ln))
      {
        matches.add(people.get(i));
      }
    }
    Person []p = {};
    return matches.toArray(p);
  }

  public void fromCSV(String file)
  {
     try
     {
        Scanner s = new Scanner(new BufferedReader(new FileReader(file)));
        fromScanner(s);
     }
     catch(Exception e)
     {
       System.out.println("File did not load \n");
     }
  }

  private void fromScanner(Scanner s)
  {
    while (s.hasNext())
    {
       String line = s.nextLine();
       String []values = line.split(",");
       String fN = values[0].trim();
       String lN = values[1].trim();
       String pN= values[2].trim();
       Person person = new Person(fN, lN, pN);
       addPerson(person);
    }
  }
}
