public class Circle2D
{
   private int radius;
   private Point2D center;

   public Circle2D()
   {
     this.radius = 5;
     center = new Point2D();
   }

   public Circle2D(int r, Point2D c)
   {
     center = new Point2D(c.getX(),c.getY());
     this.radius = r;
   }

   public String toString()
   {
     String val = "Radius: " + this.radius + " Center: " + center.toString();
     return val;
   }
}
