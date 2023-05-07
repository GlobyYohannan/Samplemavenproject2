package AggregationExample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int amount=100;
		SBI s1=new SBI();
		System.out.println("SBI Interest="+s1.interest(amount));
		
		Axis s2=new Axis();
		System.out.println("Axis Interest="+s2.interest(amount));
		

		ICIC s3=new ICIC();
		System.out.println("ICIC Interest="+s3.interest(amount));
		
		
		
	}
	
	

}
