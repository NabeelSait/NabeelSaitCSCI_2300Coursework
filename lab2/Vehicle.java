public class Vehicle
{
   String make, model;
   int year;

   public Vehicle(String mak, String mod, int y)
   {
     this.make = mak;
     this.model = mod;
     this.year = y;
   }

   public String toString()
   {
     String out = year + " " + make + " " + model;
     return out;
   }
}
