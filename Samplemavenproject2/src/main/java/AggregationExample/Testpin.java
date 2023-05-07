package AggregationExample;

import java.util.Scanner;

public class Testpin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
System.out.println("Enter your pin number");
int pinnumber=s1.nextInt();
Pin p1=new Pin();
int a1=p1.setPin(pinnumber);

p1.validPin(a1);
	}

}
