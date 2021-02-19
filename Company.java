
class Employee
{
	String Name;
	int Salary;
}
 class Emp1 extends Employee
{
	String Address;
	public void details()
	{
		 Name= "John";
		 Salary= 1000000;
		 Address= "India";
		 
		 System.out.println("Name- "+Name+" Salary- "+Salary+" Address- "+Address);
	}
}

	class Emp2 extends Employee
{
		String Address;
		public void details()
		{
			 Name= "Sam";
			 Salary= 1500000;
			 Address= "India";
			 
			 System.out.println("Name- "+Name+" Salary- "+Salary+" Address- "+Address);
		}
	
}

 public class Company
 {
	 public static void main(String[] args)
	 {
       Emp1 e=new Emp1();
       e.details();
       Emp2 em=new Emp2();
       em.details();

	 }
 }
 
