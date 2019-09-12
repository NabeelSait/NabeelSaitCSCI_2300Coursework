public class Driver
{
  public static void main(String []args)
  {
    Vehicle v = new Vehicle("Toyota", "Rav4", 2012);
    Truck t = new Truck("RAM", "1500", 2019, 10, 2, 1500);
    Motorcycle m = new Motorcycle("Harley", "Low Rider", 2018, "dual purpose", false);
    Car c = new Car("Honda", "Civic", 2010, 4, "sedan");

    String out = v.toString() + "\n" + t.toString() + m.toString() + c.toString();
    System.out.println(out);
  }
}
