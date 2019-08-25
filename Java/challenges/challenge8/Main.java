package challenge_8;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person[] p =new Person[15]; 
		for(int i =0; i<15;i++) { 
			Person c=new Person();
			c.setName(""); 
			c.setMonth(0); 
			c.setDay(0);
			p[i]=c;
		}
		for(int f=0;true;f++) {  
			int choice; 
			Scanner let =  new Scanner(System.in);
			System.out.println("Escolha uma das opcoes:");
			System.out.println("1-Cadastrar pessoa na agenda de aniversariante "); 
			System.out.println("2-Excluir pessoa a partir do nome");
			System.out.println("3-Alterar dia ou mes a partir do nome");
			System.out.println("4-Consultar aniversariantes de uma data (dia e mes)");
			System.out.println("5-Consultar aniversariantes por mes");
			System.out.println("6-Consultar aniversariantes pela letra inicial do nome");
			System.out.println("7-Mostrar toda a agenda ordenada pelo nome");
			System.out.println("8-Mostrar toda a agenda ordenada por mês");
			System.out.println("9-Sair");
			choice=let.nextInt(); 
			if(choice == 1) { 
				for(int i=0;i < 15;i++) {
					Person c= new Person();
					String test;
					System.out.println("digite o nome do aniversariante, digite stop para para parar de cadastrar");
					test=let.next(); 
					if(test.equals("stop") ) { 
						break;
					}
					else { 
						c.setName(test);
						System.out.println("digite o dia do aniversario de " + test + "(apenas o dia,sem o mes)"); 
						c.setDay(let.nextInt()); 
						System.out.println("digite o mes do aniversario de " + test + "(digite o valor numerico do mes ex:01,08)");
						c.setMonth(let.nextInt()); 
						p[i]=c;
					}
				}
			}
			if(choice == 2) { 
				String nameex;  
				int counter=0;
				System.out.println("digite o nome de uma pessoa para excluir da lista de anversariantes "); 
				nameex=let.next(); 
				for(int i =0; i < 15;i++) { 
					if(p[i].getName().equals(nameex)) { 
						p[i].setDay(0);
						p[i].setMonth(0);
						p[i].setName(""); 
						counter++;
					}  
				} 
				if(counter ==0) { 
					System.out.println("nome nao encontrado por favor registre-o na opcao 1 do menu");
				}
			}
			if(choice == 3) { 
				String nameex;
				int counter=0;
				int choicetwo;
				System.out.println("digite o nome da pessoa que voce gostaria de mudar o dia ou o mes");
				nameex=let.next();
				System.out.println("digite 1-se  quer mudar apenas o dia 2-apenas o mes 3-os dois"); 
				choicetwo=let.nextInt();  
				for(int i =0;i < 15;i++) {
					if(p[i].getName().equals(nameex)) { 
						if(choicetwo == 1) { 
							System.out.println("digite o novo valor do numerico do dia do aniversario de " + p[i].getName());
							p[i].setDay(let.nextInt());
							counter++;
						}
						if(choicetwo == 2) { 
							System.out.println("digite o novo valor do numerico do mes do aniversario de " + p[i].getName());
							p[i].setMonth(let.nextInt());
							counter++;
						}
						if(choicetwo == 3) { 
							System.out.println("digite o novo valor do numerico do dia do aniversario de " + p[i].getName());
							p[i].setDay(let.nextInt()); 
							System.out.println("digite o novo valor do numerico do mes do aniversario de " + p[i].getName());
							p[i].setMonth(let.nextInt());
							counter++;
						}
					}
				} 
				if(counter == 0) { 
					System.out.println("nome nao encontrado por favor registre-o na opcao 1 do menu");
				
				}
			}
			if(choice == 4) { 
				int daych;
				int monch;
				int counter=0;
				System.out.println("digite o dia que voce gostaria de checar os aniversariantes");
				daych=let.nextInt();
				System.out.println("agora didite o mes que voce gostaria  de checar os aniversariantes");
				monch=let.nextInt(); 
				System.out.println("aniversariantes de " + daych + "/" + monch + ":"); 
				for(int i =0 ;i < 15;i++) { 
					if(p[i].getDay() == daych && p[i].getMonth() == monch) { 
						p[i].status(); 
						System.out.println("");
						counter++;
					} 
				}
				if(counter == 0) { 
					System.out.println("nenhum,tente outra data ou registre pessoas com essa data na opcao 1 do menu");
				}
			} 
			if(choice == 5) { 
				int monch;  
				int counter=0;
				String namem="error";
				System.out.println("digite o mes que voce gostaria de checar os aniversariantes");
				monch=let.nextInt(); 
				if(monch > 0 && monch < 13) {
					if(monch == 1) { 
						namem="janeiro";
					} 
					if(monch == 2) { 
						namem="fevereiro";
					} 
					if(monch == 3) { 
						namem="marco";
					} 
					if(monch == 4) { 
						namem="abril";
					} 
					if(monch == 5) { 
						namem="maio";
					} 
					if(monch == 6) { 
						namem="junho";
					} 
					if(monch == 7) { 
						namem="julho";
					} 
					if(monch == 8) { 
						namem="agosto";
					} 
					if(monch == 9) { 
						namem="setembro";
					} 
					if(monch == 10) { 
						namem="outubro";
					} 
					if(monch == 11) { 
						namem="novembro";
					} 
					if(monch == 12) { 
						namem="dezembro";
					}  
				} 
				System.out.println("aniversariantes de " + namem); 
				for(int i=0;i< 15;i++) { 
					if(p[i].getMonth() == monch) { 
						p[i].status(); 
						counter++;
					}
				}   
				if(counter == 0) { 
					System.out.println("nenhum,por favor tente outro mes ou registre mais pessoas na opcao 1 do menu");
				}
				
				
			}
			if(choice == 6) { 
				String test;
				int counter=0; 
				int uncounter=0;
				System.out.println("digite a letra incial dos aniversariantes que voce procura(digite exatamente,como foi informado,nao faca da letra maiuscula se essa nao foi a tal)");
				test=let.next(); 
				for(int i=0 ;i< 15;i++) { 
					if(p[i].getName().contentEquals("")) {  
						uncounter++;
					} 
					else {
						if(p[i].getName().substring(0,1).equals(test)) { 
							p[i].status(); 
							System.out.println("");
							counter++;
						} 
					}
				} 
				if(counter == 0) { 
					System.out.println("nenhum,digite outra letra ou cadastre mais pessoas na opcao 1 do menu");
				}
			}
			if(choice == 7) { 
				String temp1;
				int temp2;
				int temp3; 
				int uncounter=0;
				Person[] y=new Person[15]; 
				for(int i =0;i< 15;i++) { 
					y[i]=p[i];
				}
				for (int i = 0; i < 15; i++) {
		            for (int j = i + 1; j < 15; j++) {
		                if (y[i].getName().compareTo(y[j].getName())>0) {
		                    temp1 = y[i].getName(); 
		                    temp2=y[i].getDay();
		                    temp3=y[i].getMonth();
		                    y[i].setName(y[j].getName()); 
		                    y[i].setDay(y[j].getDay());
		                    y[i].setMonth(y[j].getMonth());
		                    y[j].setName(temp1); 
		                    y[j].setDay(temp2);
		                    y[j].setMonth(temp3);
		                }
		            }
		        } 
				for(int i =0 ;i < 15;i++) { 
					if(y[i].getMonth() == 0 || y[i].getDay() == 0 || y[i].getName().contentEquals("")) { 
						uncounter++;
					} 
					else { 
						y[i].status(); 
						System.out.println("");
					}
				}
				
			}
			if(choice == 8) { 
				Person[] y=new Person[15]; 
				for(int i=0;i<15;i++) { 
					y[i]=p[i];
				}  
				int uncounter=0;
				int b; 
				int c; 
				int d;
				int e;
				String h;
				String j;
				for(int g =1;g <= p.length-1;g++) { 
					for(int i =0; i < p.length-g;i++) { 
						b=y[i].getMonth(); 
						d=y[i].getDay(); 
						h=y[i].getName();
						c=y[i+1].getMonth(); 
						e=y[i+1].getDay(); 
						j=y[i+1].getName();
						if(y[i].getMonth() > y[i+1].getMonth()) { 
								y[i].setMonth(c);
								y[i].setDay(e);
								y[i].setName(j);
								y[i+1].setMonth(b); 
								y[i+1].setDay(d); 
								y[i+1].setName(h);
						} 
					} 
				} 
				for(int i =0 ;i < 15;i++) { 
					if(y[i].getMonth() == 0 || y[i].getDay() == 0 || y[i].getName().contentEquals("")) { 
						uncounter++;
					} 
					else { 
						y[i].status(); 
						System.out.println("");
					}
				}
			}
			if(choice == 9) { 
				break;
			} 
							
		} 
		System.out.println("the end");
	}

}
