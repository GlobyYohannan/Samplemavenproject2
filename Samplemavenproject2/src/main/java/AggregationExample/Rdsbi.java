package AggregationExample;

public class Rdsbi implements RBI{
	
	public  int RD(int amt,int duration)
	{
		int interest=(amt*duration*6)/100;
		int totalamount=amt+interest;
		return totalamount;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rdsbi ob1=new Rdsbi();
		System.out.println("Recurring Deposit balance:"+" "+ob1.RD(1000, 10));
		
	}

}
