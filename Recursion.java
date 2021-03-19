  public class Recursion     // Find the factorial of a number using recursion
 { 
	
	public static int factorial(int n)  // method function
	{ 
	
	   if(n<=1)   //defining conditions
		return 1;
	   else 
		 return n*factorial(n-1);
	}
   
        public static void main(String[] args)   // Main
        {   
	   System.out.println("The factorial is " +factorial(6));
	}

}

