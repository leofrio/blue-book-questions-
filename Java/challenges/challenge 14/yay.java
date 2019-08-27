package challenge_14;
import java.util.Scanner;
public class yay {	
		public static void main(String[] args) { 
			Scanner let=new Scanner(System.in); 
			System.out.println("type the first  number to see if they are friendly numbers");
			double n1 = let.nextDouble();
			System.out.println("the the second number to see if it is friendly with the first one");
			double n2=let.nextDouble(); 
			int sum1=0;
			int sum2=0;
			for(int i =1;i < n1;i++) { 
				if(n1/i == Math.round(n1/i)) { 
					sum1 += i;
				}
			} 
			for(int i =1;i < n2;i++) { 
				if(n2/i == Math.round(n2/i)) { 
					sum2 += i;
				}
			}
			if(sum1 == n2 || sum2 == n1 ) { 
				System.out.println(n1 + " and "+ n2 + " are friendly numbers");
			}
			else { 
				System.out.println(n1 + " and "+ n2 + " are NOT friendly numbers");
			}
		}
}
