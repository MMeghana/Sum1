package Pack1;
import java.util.Scanner;
public class Sum1 {
public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number1");
		int a = obj.nextInt();
		System.out.println("enter number2");
		int b = obj.nextInt();
		int c = a+b;
		System.out.println("sum ="+c);
	}
}