package challenge17;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		call c=new call();
		double minuteb; 
		double minutef; 
		double timeb;
		double timef;
		Scanner let=new Scanner(System.in);
		System.out.println("qual a hora incial do horario");	
		c.setBhour(let.nextInt()); 
		System.out.println("qual o minuto incial do horario");	
		minuteb=let.nextDouble();
		c.setBmin(minuteb/100); 
		System.out.println( "horario inicial: "+ c.getBhour() + ":" + minuteb);
		System.out.println("qual a hora final do horario");	
		c.setFhour(let.nextInt());  
		System.out.println("qual o minuto final do horario");	
		minutef=let.nextDouble();
		c.setBmin(minuteb/100); 
		System.out.println( "horario final: "+ c.getFhour() + ":" + minutef); 
		System.out.println("qual o valor de cobrado por minuto na ligação"); 
		c.setMinvalue(let.nextDouble());
		c.setTimeTotalb(c.getBhour(), c.getBmin()); 
		c.setTimeTotalf(c.getFhour(), c.getFmin()); 
		double value=c.getMinvalue();
		timeb=c.getTotaltimeb();
		timef=c.getTotaltimef(); 
		double sumd=0;
		double sumn=0;
		for(double i=timeb; i <= timef;i=i+0.01) { 
			double discount;
			if(i == 24.0) { 
				i=0.0;
			}
			if(i >= 0.0 && i <= 9.0) { 
				discount=1.5; 
				sumd += value * discount;
			} 
			if(i >= 9.01 && i <= 18) { 
				discount=0;
				sumd += value; 
			} 
			if(i >= 18.01 && i <= 21) { 
				discount=1.3;
				sumd += value * discount;
			} 
			if(i >= 21.01 && i <= 23.59) { 
				discount=1.4; 
				sumd += value *discount; 
			} 
			sumn += value;
			System.out.println(i);
			if(i-0.59 == Math.floor(i)) { 
				i=(i-0.59) +1; 
				sumd += value *1.5;
			} 
		} 
		System.out.println("valor com desconto aplicado "  + sumd + " R$");	
		System.out.println("valor sem desconto aplicado "  + sumn + " R$");	
	}
}
