package challenge_13;
import java.util.Scanner;
public class main {
	public static void main(String[] args ) {
		Scanner let=new Scanner(System.in);
		System.out.println("type a number to see if it is a narcisssitic number");
		int number=let.nextInt();
		int i=0;
		int sum=0;
		int le=String.valueOf(number).length();  
		for(int c=number;c > 0;c=(int) Math.floor(c/10)) { 
			int rest=c%10;
			rest = (int) Math.pow(rest,le);  
			sum +=rest;
		} 
		if(sum == number) { 
			System.out.println("the number " + number + " is a narcissisistic number");
		}
		else { 
			System.out.println("the number " + number + " is not a narcissisistic number"); 
		}
	}
}
