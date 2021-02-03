class Hello
{
  static int a=11;
  double b=5.0;

  void one()
    {
      System.out.println("studying");
    }
 
  static void two()
    {
      System.out.println("sleeping");
    }
   
  public static void main(String[] args)
 {
    
    System.out.println("test the code");
    two();
    Hello r1=new Hello();
    r1.one();
    System.out.println(a);
    System.out.println(r1.b);
 }

}