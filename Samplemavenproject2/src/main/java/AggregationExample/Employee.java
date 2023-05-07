package AggregationExample;

public class Employee {
	int id;
	String name;
    Address address;
    
    public Employee(int id,String name, Address address)
    {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    }
    
    public void display()
    {
    	System.out.println(id+" "+name);
    	System.out.println(address.city+" "+address.state+" "+address.country);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address a1=new Address("pathanamthitta","kerala","india");
		Address a2=new Address("kollam","kerala","india");
		
		Employee e1=new Employee(1,"Globy",a1);
		Employee e2=new Employee(2,"jithin",a2);
		
		e1.display();
		e2.display();
	}

}
