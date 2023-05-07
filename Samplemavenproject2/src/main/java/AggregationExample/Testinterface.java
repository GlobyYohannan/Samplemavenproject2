package AggregationExample;

public class Testinterface implements printable,showable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testinterface ob1=new Testinterface();
		ob1.print();
		ob1.show();
	}

	public void print()
	{
		System.out.println("print");
	}
	public void show()
	{
		System.out.println("show");
	}
}
