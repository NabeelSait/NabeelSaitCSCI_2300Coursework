import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.ArrayList;

public class Appointment extends Event
{
  private int startBuffer;

  public Appointment(Contact c, GregorianCalendar st, String s)
  {
    this.organizer = c;
    this.dateTime = st;
    this.description = s;
  }

  public GregorianCalendar getStartTime()
  {
    GregorianCalendar startTime = new GregorianCalendar(dateTime.get(Calendar.YEAR), dateTime.get(Calendar.MONTH), dateTime.get(Calendar.DAY_OF_MONTH), dateTime.get(Calendar.HOUR_OF_DAY), dateTime.get(Calendar.MINUTE));
    startTime.add(Calendar.MINUTE, startBuffer);
    return startTime;
  }

  public GregorianCalendar getEndTime()
  {
    GregorianCalendar endTime = new GregorianCalendar(dateTime.get(Calendar.YEAR), dateTime.get(Calendar.MONTH), dateTime.get(Calendar.DAY_OF_MONTH), dateTime.get(Calendar.HOUR_OF_DAY), dateTime.get(Calendar.MINUTE));
    endTime.add(Calendar.HOUR_OF_DAY, 1);
    return endTime;
  }

  public void setStartBuffer(int b)
  {
    this.startBuffer = -b;
  }

}
