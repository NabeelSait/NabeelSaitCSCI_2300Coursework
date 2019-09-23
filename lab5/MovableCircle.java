/*
 * A circle in 2D that is movable
 */

//TODO: implement IMovable interface
public class MovableCircle
{
   private int radius;
   private MovablePoint center;

   public MovableCircle(MovablePoint center, int radius)
   {
      this.center = center;
      this.radius = radius;
   }

   public String toString()
   {
      String value = "circle centered at "+center+" with radius "+radius;
      return value;
   }

   public void moveUp(int distance)
   {
     center.moveUp(distance);
   }

   public void moveDown(int distance)
   {
     center.moveDown(distance);
   }

   public void moveRight(int distance)
   {
     center.moveRight(distance);
   }

   public void moveLeft(int distance)
   {
     center.moveLeft(distance);
   }

}
