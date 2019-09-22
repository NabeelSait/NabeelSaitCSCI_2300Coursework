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

   // TODO: implement all methods of IMovable interrface
 
}
