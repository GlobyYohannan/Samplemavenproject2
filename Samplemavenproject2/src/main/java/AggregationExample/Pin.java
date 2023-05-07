package AggregationExample;

public class Pin {
	
	private int pinnumber;
	
	public int setPin(int pinnumber)
	{
		this.pinnumber=pinnumber;
		return pinnumber;
	}
	public void validPin(int pin)
	{
		switch(pin)
		{
		case 3241: System.out.println("Valid pin");
		break;
		case 4567: System.out.println("Valid pin");
		break;
		case 1242: System.out.println("Valid pin");
		break;
		case 7890: System.out.println("Valid pin");
		break;
		default: System.out.println("Invalid pin");
		}
	}

}
