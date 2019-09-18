/*
 * A Cylinder is a Circle plus a height.
 */

public class Cylinder extends Geometry {
   // private instance variable
   private double height;
   private Circle c;

   // Constructors
   public Cylinder() {
      this.c = new Circle();
      this.height = 1.0;
   }
   public Cylinder(double height) {
      this.c = new Circle();
      this.height = height;
   }

   public Cylinder(double height, double radius) {
      this.c = new Circle(radius);
      this.height = height;
   }
   public Cylinder(double height, double radius, String color) {
      this.c = new Circle(radius);
      this.height = height;
      this.color = color;
   }

   // Getter and Setter
   public double getHeight() {
      return this.height;
   }
   public void setHeight(double height) {
      this.height = height;
   }

   public double getRadius()
   {
     return c.getRadius();
   }

   public double getVolume() {
      return c.getArea()*height;   // use Cirlce's getArea times height
   }

   public double getArea() {
      return 2*Math.PI*c.getRadius()*height + 2*c.getArea();
   }

   public String toString() {
      return "Cylinder[" + c.toString() + ",height=" + height + "]";
   }
}
