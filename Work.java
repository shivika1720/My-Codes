
public class Work 
{
	int i;
	
	public Work(int variable)
  {
	 i=variable;
  }
	
    Work updateobj()
  {
	 Work temp=new Work(i+25);
	 return temp;
  }


}









