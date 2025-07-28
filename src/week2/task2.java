package week2;

public class task2 {
	 
	public static void main(String[] args) {
		double a=10;
		double b=10;
		Operation add = new add();
	    System.out.println("Addition is : " + add.calculate(a, b));

	    Operation sub = new sub();
	    System.out.println("Subtraction is : " + sub.calculate(a, b));

	    Operation mul = new mul();
	    System.out.println("Multiplication is : " + mul.calculate(a, b));

	    Operation div = new div();
	     System.out.println("Division is : " + div.calculate(a, b));	
	}
	
}
interface Operation{
	double calculate(double a, double b) ;
}

//addition
class add implements Operation{
	@Override
	public double calculate(double a, double b) {
		return a+b;
	}	
}
//subtraction
class sub implements Operation{
	@Override
	public double calculate(double a, double b) {
		return a-b;
	}	
}
//addition
class mul implements Operation{
	@Override
	public double calculate(double a, double b) {
		return a*b;
	}	
}
//addition
class div implements Operation{
	@Override
	public double calculate(double a, double b) {
		return a/b;
	}	
}