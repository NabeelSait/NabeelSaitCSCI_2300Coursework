/*
 * Circle class
 */

public class Circle extends Geometry {
   // private instance variables
   private double radius;
   private String color;

   // Constructors
   public Circle() {
      this.radius = 1.0;
      this.color = "red";
   }
   public Circle(double radius) {
      this.radius = radius;
      this.color = "red";
   }
   public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
   }

   // Getters and Setters
   public double getRadius() {
      return this.radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }


   // Describle itself
   public String toString() {
      return "Circle[radius=" + radius + ",color=" + color + "]";
   }

   // Return the area of this Circle
   public double getArea() {
      return radius * radius * Math.PI;
   }
}
