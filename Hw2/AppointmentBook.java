import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.ArrayList;

public class AppointmentBook
{
  private ArrayList<Event> events;

  public AppointmentBook()
  {
    events = new ArrayList<Event>();
  }
  public boolean addEvent(Event e)
  {
    for (int i = 0; i < events.size(); i++)
    {
      if ((e.getStartTime().compareTo(events.get(i).getStartTime()) > 0) & (e.getStartTime().compareTo(events.get(i).getEndTime()) < 0))
      {
        return false;
      }
      else if((e.getEndTime().compareTo(events.get(i).getStartTime()) < 0) & (e.getEndTime().compareTo(events.get(i).getEndTime()) > 0))
      {
        return false;
      }
    }
    this.events.add(e);

    return true;
  }

  public ArrayList<Event> getEventsForDate(GregorianCalendar gc)
  {
    ArrayList<Event> e = new ArrayList<Event>();

    for (int i = 0; i < events.size(); i++)
    {
      if ((events.get(i).getStartTime().get(Calendar.YEAR) == gc.get(Calendar.YEAR)) & (events.get(i).getStartTime().get(Calendar.MONTH) == gc.get(Calendar.MONTH)) & (events.get(i).getStartTime().get(Calendar.DAY_OF_MONTH) == gc.get(Calendar.DAY_OF_MONTH)))
      {
        e.add(events.get(i));
      }
    }
    return e;
  }

}
