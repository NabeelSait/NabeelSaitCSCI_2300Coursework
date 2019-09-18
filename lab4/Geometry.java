public abstract class Geometry
{
  protected String color;

  public String getColor()
  {
    return this.color;
  }

  public abstract String toString();

  public void setColor(String color)
  {
     this.color = color;
  }

  public abstract double getArea();
}
