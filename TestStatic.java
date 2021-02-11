public class TestStatic 
 {
	    static int x, y;
	    TestStatic()
	   {   
	      System.out.println("This will print on second line");
	   }
	        static
	   { 
	         x= 14;
	         y= 17;
	         System.out.println("This will print on first line"); 
	   }
 }       
	
public class Main
	  {
	   public static void main(String[] args)
	 
	    {
	   TestStatic obj = new TestStatic();
	   System.out.println("Welcome to the main class");
	   System.out.println("The static members are: "+obj.x+" and "+obj.y);
	  
	    }
	  }