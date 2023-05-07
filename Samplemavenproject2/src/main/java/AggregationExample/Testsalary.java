package AggregationExample;

public class Testsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empsalary e1=new Fulltime();
		System.out.println("Full time employee salary"+" "+e1.salarycalc(8f, 100f));
		
		Empsalary e2=new Parttime();
		System.out.println("Part time employee salary"+" "+e2.salarycalc(3.5f, 50f));
	}

}
