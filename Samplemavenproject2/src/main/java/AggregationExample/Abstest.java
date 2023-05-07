package AggregationExample;

public class Abstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount=100;
		
		Absbank s1=new Absaxis();//upcasting
		System.out.println("Axis Interest="+s1.interest(amount));
		
		Absbank s2=new Absicic();
		System.out.println("Axis Interest="+s2.interest(amount));
		

		Absbank s3=new Abssouth();
		System.out.println("ICIC Interest="+s3.interest(amount));
		
	}

}
