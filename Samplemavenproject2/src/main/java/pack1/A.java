package pack1;

public class A {
	
	
	private void sum()
	{
		System.out.println("private method");
	}

	void msg()
	{
		System.out.println("default method");
	}
	
	protected void eat()
	{
		System.out.println("protected method");
	}
	public void add()
	{
		System.out.println("public method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A ob1=new A();

ob1.sum();
ob1.msg();
ob1.eat();
ob1.add();
	}
}
