package myProject21;
import java.util.Scanner;

public class CalculatingExponentNumbers {
	public static void main(String[]args) {
		int num1,num2,result=1;
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter base of exponent number:");
		num1=input.nextInt();
		System.out.print("Please enter power of exponent number:");
		num2=input.nextInt();
		for(int counter=1;counter<=num2;counter++) {
			result*=num1;
		}
		System.out.println("Result:"+result);
		
		
		
	}

}
