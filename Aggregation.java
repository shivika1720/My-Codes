class Address{

   private String city;
   private String state;
   private String country;

Address(String city,String state, String country){
  this.city = city;
  this.state = state;
  this.country = country;
 }

public String getAddress(){
   return ""+city+", "+state+", "+country+"";
 }
}

class Employee{

    private String name;
    private int age;
    private int salary;
    private Address address; //aggregation

Employee(String name,int age, int salary, Address address){
   this.name = name;
   this.age = age;
   this.salary = salary;
   this.address = address;
 }

public void showEmp() {
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Salary: "+salary);
System.out.println("Address: "+address.getAddress());
 }
}

public class Aggregation {
public static void main(String[] args){

Address ad1 = new Address("city1","state1","country1");
Employee ep1 = new Employee("emp1",20,200000,ad1);

Address ad2 = new Address("city2","state2","country2");
Employee ep2 = new Employee("emp2",22,400000,ad2);


Address ad3 = new Address("city3","state3","country3");
Employee ep3 = new Employee("emp3",24,600000,ad3);

ep1.showEmp();
System.out.println();
ep2.showEmp();
System.out.println();
ep3.showEmp();
}
}









 