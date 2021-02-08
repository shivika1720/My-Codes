public class Arithmetic {
	
	void calculation(int a, int b)
	{
	 int i = a;
	 int n = b;
	 int m=i+n;
	 System.out.println("The addition of " +i+ " and " +n+" is "+m);
	}

    void calculation(float p, int q)
    {
    	float x= p;
    	int y= q;
    	float z= p*q;
    	System.out.println("The multiplication of " +x+ " and " +y+" is "+z);
    }

  public static void main(String[] args)
  {
	Arithmetic hey=new Arithmetic();
	hey.calculation(14,17);
	hey.calculation(3.5f,10);
  }
}
	
