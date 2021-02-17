class Car
{

   int priceofcar()
  {
   return 0;
  }
}

class Lamborghini extends Car
{
   int priceofcar()
   {
	   return 30000000;
   }
}

class RangeRover extends Car
{
    int priceofcar()
    { 
    	return 6000000;
    }
}
class Jaguar extends Car
{
     int priceofcar()
    {
	return 8000000;
	}
}

class TestOverriding
{
  public static void main(String args[])
 {
Lamborghini l=new Lamborghini();
RangeRover r=new RangeRover();
Jaguar j=new Jaguar();
System.out.println("Lamborghini prices start at: Rs."+l.priceofcar());
System.out.println("Range Rover prices start at: Rs."+r.priceofcar());
System.out.println("Jaguar prices start at: Rs."+j.priceofcar());
 }
}
