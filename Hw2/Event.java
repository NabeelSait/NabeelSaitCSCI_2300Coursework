import java.util.GregorianCalendar;
import java.util.Calendar;

public abstract class Event
{
  protected GregorianCalendar dateTime;
  protected Contact organizer;
  protected String description;

  public String getDescription()
  {
    return description;
  }

  public String toString()
  {
    String em = "";
    String sm = "";

    if (this.getStartTime().get(Calendar.MINUTE) == 0)
    {
      sm = "0";
    }
    if (this.getEndTime().get(Calendar.MINUTE) == 0)
    {
      em = "0";
    }

    String out = description + "\nDate: " + this.getStartTime().get(Calendar.MONTH) + "/" + this.getStartTime().get(Calendar.DAY_OF_MONTH) + "/" + this.getStartTime().get(Calendar.YEAR)
     + "\nStart Time: " + this.getStartTime().get(Calendar.HOUR_OF_DAY) + ":" + this.getStartTime().get(Calendar.MINUTE) + sm
     + "\nEnd Time: " + this.getEndTime().get(Calendar.HOUR_OF_DAY) + ":" + this.getEndTime().get(Calendar.MINUTE) + em
      + "\nOrganized by: " + organizer.getName();
    return out;
  }

  public abstract GregorianCalendar getStartTime();

  public abstract GregorianCalendar getEndTime();
}
