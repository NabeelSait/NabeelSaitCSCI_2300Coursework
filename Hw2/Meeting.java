import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.ArrayList;

public class Meeting extends Event
{
  private ArrayList<String> attendees;
  private int endBuffer;

  public Meeting(Contact c, GregorianCalendar gc, String d)
  {
    organizer = c;
    dateTime = gc;
    description = d;
    attendees = new ArrayList<String>();
  }

  public GregorianCalendar getStartTime()
  {
    return dateTime;
  }

  public GregorianCalendar getEndTime()
  {
    GregorianCalendar endTime = new GregorianCalendar(dateTime.get(Calendar.YEAR), dateTime.get(Calendar.MONTH), dateTime.get(Calendar.DAY_OF_MONTH), dateTime.get(Calendar.HOUR_OF_DAY), dateTime.get(Calendar.MINUTE));
    endTime.add(Calendar.HOUR_OF_DAY, 1);
    endTime.add(Calendar.MINUTE, endBuffer);
    return endTime;
  }

  public ArrayList<String> getAttendees()
  {
    return attendees;
  }

  public void setEndBuffer(int b)
  {
    this.endBuffer = b;
  }

  public void addAttendee(String a)
  {
    this.attendees.add(a);
  }
}
