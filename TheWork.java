
public class TheWork 
{

	public static void main(String[] args) 
	{
		Work t = new Work(30);
		System.out.println("Before object updation i = "+t.i);
		t = t.updateobj();
		System.out.println("After object updation i = "+t.i);
	}

}
