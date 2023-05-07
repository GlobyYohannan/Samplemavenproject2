package AggregationExample;

public class ICIC extends Bank{


	int interest(int amount)
	{
		int i=(amount*3)/100;
		System.out.println("ICIC");
		return i;
	}
}
