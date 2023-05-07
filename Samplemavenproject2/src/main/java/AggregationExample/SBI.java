package AggregationExample;

public class SBI extends Bank {
	
	int interest(int amount)
	{
		int i=(amount*10)/100;
		System.out.println("SBI");
		return i;
	}

}
