public class Problem1 {
	
	public static void main(String[] args) {
		
	double a = 10;
	double b = 5;
	String op = "substract";
	
	if(op.equals("add"))
	System.out.println(a+b);
	else if(op.equals("substract"))
		System.out.println(a-b);
	else if(op.equals("multiply"))
	  System.out.println(a*b);
	else if(op.equals("divide"))
		System.out.println(b != 0 ? a / b : "cannot dived by zero");
	else 
		System.out.println("Invalid opperation");
		
	}
}
		

