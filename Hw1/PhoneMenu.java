import java.util.Scanner;

public class PhoneMenu
{
  public static void printMenu()
  {
      System.out.println("1. Search by phone number");
      System.out.println("2. Search by first name");
      System.out.println("3. Search by last name");
      System.out.println("4. List entries in phonebook");
      System.out.println("5. Load entries into phonebook");
      System.out.println("6. Exit");
  }

  public static int selectFromMenu()
   {
      Scanner scanner = new Scanner(System.in);
      int option = scanner.nextInt();
      return option;
   }

   public static void searchByNumber(Phonebook Pbook)
   {
      Scanner scanner = new Scanner(System.in);
      String number;
      System.out.println("Enter Phone Number: ");
      number = scanner.nextLine();
      Person[] matchedPeople = Pbook.searchByNumber(number);
      if (matchedPeople.length == 0)
      {
         System.out.println("No matches found");
      }

      for (int i = 0; i < matchedPeople.length; i++)
      {
         System.out.println(matchedPeople[i]);
      }
   }

   public static void searchByFirstName(Phonebook Pbook)
   {
      Scanner scanner = new Scanner(System.in);
      String name;
      System.out.println("Enter First Name: ");
      name = scanner.nextLine();
      Person[] matchedPeople = Pbook.searchByFirstName(name);
      if (matchedPeople.length == 0)
      {
         System.out.println("No matches found");
      }

      for (int i = 0; i < matchedPeople.length; i++)
      {
         System.out.println(matchedPeople[i]);
      }
   }

   public static void searchByLastName(Phonebook Pbook)
   {
      Scanner scanner = new Scanner(System.in);
      String name;
      System.out.println("Enter Last Name: ");
      name = scanner.nextLine();
      Person[] matchedPeople = Pbook.searchByLastName(name);
      if (matchedPeople.length == 0)
      {
         System.out.println("No matches found");
      }

      for (int i = 0; i < matchedPeople.length; i++)
      {
         System.out.println(matchedPeople[i]);
      }
   }

   public static void listPeople(Phonebook Pbook)
   {
      Person[] people = Pbook.list();
      for (int i = 0; i < people.length; i++)
      {
         System.out.println(people[i]);
      }
   }

   public static void loadPeople(Phonebook Pbook)
   {
      System.out.println("Enter file name:");
      Scanner in = new Scanner(System.in);
      String fileName = in.nextLine();
      Pbook.fromCSV(fileName);
   }

   public static void main(String []args)
   {
     Phonebook phonebook = new Phonebook();

     boolean quit = false;
     while (!quit)
     {
         printMenu();
         int option = selectFromMenu();
         switch (option)
         {
            case 1:
               searchByNumber(phonebook);
               break;
            case 2:
               searchByFirstName(phonebook);
               break;
            case 3:
               searchByLastName(phonebook);
               break;
            case 4:
               listPeople(phonebook);
               break;
            case 5:
               loadPeople(phonebook);
               break;
            case 6:
               quit = true;
               break;
        }
      }
    }
}
