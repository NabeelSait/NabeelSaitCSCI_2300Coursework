public class Driver
{
  public static void main(String []args)
  {
    Circle2D cir1 = new Circle2D();
    Point2D c = new Point2D(2,3);
    Circle2D cir2 = new Circle2D(3, c);

    System.out.println("Cirlce 1: ");
    System.out.println(cir1);
    System.out.println("\nCircle 2: ");
    System.out.println(cir2);
  }
}
