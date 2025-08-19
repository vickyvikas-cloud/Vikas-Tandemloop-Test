import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		int count = 0;
		int num = 1;
		System.out.print("output: ");
		
		while(count < a) {
			System.out.print(num);
			count ++;
			num += 2;
		
		if(count < a) {
			System.out.print(", ");
		}
		sc.close();
	
}
}
}

