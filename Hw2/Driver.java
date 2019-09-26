import java.util.ArrayList;
import java.util.GregorianCalendar;
public class Driver
{

/* This program checks the syntax of your constructors and methods.
 * Your classes MUST compile with this program, with no errors.
 * I will use this program to test your solutions.
 */
public static void main(String[] args)
{


   // check constructor
   Contact kate = new Contact("Kate", 9777004);
   GregorianCalendar today = new GregorianCalendar(2019, 9, 20, 12, 0);
   Meeting csci2300 = new Meeting(kate, today, "meet with the CSCI2300 students");
   csci2300.setEndBuffer(10);

   GregorianCalendar laterToday = new GregorianCalendar(2019, 9, 20, 14, 30);
   Appointment oilChange = new Appointment (kate, laterToday, "oil change");
   oilChange.setStartBuffer(20); //it will take me 20 minutes to drive there
   AppointmentBook book = new AppointmentBook();

   Appointment soccer = new Appointment(kate, new GregorianCalendar(2019, 9, 21, 10, 0), "soccer");
   book.addEvent(soccer);

   // check Contact methods
   String name = kate.getName();
   int phoneNum = kate.getPhone();

   // check Appointment methods
   System.out.println(csci2300.getDescription());
   System.out.println(oilChange);

   // check Meeting methods
   csci2300.addAttendee("Joe");
   ArrayList<String> people = csci2300.getAttendees();
   System.out.println(csci2300);


   // Check AppointmentBook methods
   book.addEvent(csci2300);

   Appointment officeHours = new Appointment(kate, new GregorianCalendar(2019, 9, 20, 13, 0), "office hours");
   System.out.println(officeHours);
   boolean added = book.addEvent(officeHours);
   if (added)
   {
      System.out.println("Error: office hours should not have been added");
   }

   Appointment lunch = new Appointment(kate, new GregorianCalendar(2019, 9, 20, 13, 15), "lunch");
   lunch.setStartBuffer(5);
   System.out.println(lunch);
   added = book.addEvent(lunch);
   if (!added)
   {
      System.out.println("Error: lunch should have been added");
   }

   added = book.addEvent(oilChange);
   if (added)
   {
      System.out.println("Error: oil change should not have been added");
   }
   ArrayList<Event> todaysEvents = book.getEventsForDate(today);
   if (todaysEvents.size() != 2)
   {
      System.out.println("Error, 2 events should be scheduled for today");
   }

}

}
