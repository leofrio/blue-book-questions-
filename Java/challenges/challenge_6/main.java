package challenge_6;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner let=new Scanner(System.in);
		System.out.println("type the number you want to see typed in words"); 
		long number=let.nextLong();
		long le=String.valueOf(number).length(); 
		long[] in= new long[(int) le];  
		long u=0;  
		long h=0;
		long t=-344; 
		String testing="";
		String aux="";
		String[] phrase=new String[(int) le]; 
		for(long i =0 ;i < le;i++) { 
			phrase[(int) i]="";
		}
		for(long c =number;c > 0;c=(long) Math.floor(c/10)) { 
			long rest= c%10; 
			in[(int) u]=rest;
			u++;
		}   
		u=(le-1);
		for(long i=0;i< le;i++) { 
			String numu="";
			String numd="";
			String scale=""; 
			String secondaryscale=""; 
			if((i+1) >= 3) {  
				if((i+1) == 3 && in[(int) i] != 0) { 
					scale= " hundred";
				} 
				else {   
					if((i+1) >= 4 && (i+1) <= 6 && h == 0 && in[(int) i] != 0) { 
						h=in[(int) i];
						scale=" thousand"; 
					} 
					if((i+1)==6 && in[(int) i] != 0) { 
						secondaryscale=" hundred"; 
						h=0;
					}
					if((i+1) >= 7 && (i+1) <= 9 && h == 0 && in[(int) i] != 0) { 
						h=in[(int) i];
						scale=" milion ";
					}
					if((i+1)==9 && in[(int) i] != 0 ) { 
						secondaryscale=" hundred";
						h=0;
					}
					if((i+1) >= 10 && (i+1) <= 12 && h == 0 && in[(int) i] != 0 ) { 
						h=in[(int) i];
						scale=" bilion ";
					}
					if((i+1)==12 && in[(int) i] != 0) { 
						secondaryscale=" hundred";
						h=0;
					}
					if((i+1) >= 13 && (i+1) <= 15 && h == 0 && in[(int) i] != 0) { 
						h=in[(int) i];
						scale=" trilion ";
					}
					if((i+1)== 15&& in[(int) i] != 0 ) { 
						secondaryscale=" hundred";
						h=0;
					}
				}
			} 
			else { 
				scale="";
			}
			if(in[(int) i] == 0) { 
				if(i==1 || i==4 || i==7 || i==10 || i==13) { 
					t=i;
				}
				numd=""; 
				numu="";
			} 
			else {   
				if(in[(int) i] == 1) { 
					numu=" one";
				}
				if(in[(int) i] == 2) { 
					numu=" two";
				}
				if(in[(int) i] == 3) { 
					numu=" three";
				}
				if(in[(int) i] == 4) { 
					numu=" four";
				}
				if(in[(int) i] == 5) { 
					numu=" five";
				}
				if(in[(int) i] == 6) { 
					numu=" six";
				}
				if(in[(int) i] == 7) { 
					numu=" seven";
				}
				if(in[(int) i] == 8) { 
					numu=" eight";
				}
				if(in[(int) i] == 9) { 
					numu=" nine";
				} 
				if(le != 1 &&  i != (le-1)) { 
					if(in[(int) i+1] == 1) { 
						aux=numu;
					}
				}
				
				if((i-3)==t || i ==1|| i==4|| i==7 || i==10 || i==13) { 
					t=i;
					if(in[(int) i] == 1) { 
						if(in[(int) i-1] >= 0 && in[(int) i-1] <= 2) {
							if(in[(int) i-1] == 0) { 
								numd=" ten";
							} 
							if(in[(int) i-1] == 1) { 
								numd=" eleven";
							}
							if(in[(int) i-1] == 2) { 
								numd=" twelve";
							}  
							numu="";
						} 
						else { 
							if(in[(int) i-1]== 5 || in[(int) i-1] == 8 || in[(int) i-1] == 3 ) { 
								if(in[(int) i-1] == 5) { 
									numd="fifteen";
								}	
								if(in[(int) i-1] == 8) { 
									numd="eighteen";
								} 
								if(in[(int) i-1] == 3) { 
									numd="thirteen";
								} 
								numu="";
							}
							else {
								numd=aux + "-teen "; 
								numu=""; 
							}
						}
						
					} 
					else { 
						if(in[(int) i] == 2) { 
							numd="twenty ";
						}
						if(in[(int) i] == 3) { 
							numd=" thirty ";
						}
						if(in[(int) i] == 4) { 
							numd=" forty ";
						}
						if(in[(int) i] == 5) { 
							numd=" fifty ";
						}
						if(in[(int) i] == 6) { 
							numd=" sixty ";
						}
						if(in[(int) i] == 7) { 
							numd=" seventy ";
						}
						if(in[(int) i] == 8) { 
							numd=" eighty ";
						}
						if(in[(int) i] == 9) { 
							numd=" ninety ";
						} 
						numu="";
					}
				}
			}  
			if((i+3)%3 == 0) { 
				if(le  == 1 || i == (le-1)) { 
					if(le==1) {
						if(in[(int) i]==0) { 
							phrase[(int) u]="zero";
						}
					}
					phrase[(int) u]  += numd + numu + secondaryscale + scale; 
					testing += phrase[(int) u]; 
				}
				else { 
					if(in[(int) i+1] ==1 ) {  
						
						phrase[(int) u] += scale;
						testing += phrase[(int) u]; 
					} 
					else { 
						phrase[(int) u]  += numd + numu + secondaryscale + scale; 
						testing += phrase[(int) u]; 
					}
				}
			}
			else {  
				phrase[(int) u]  += numd + numu + secondaryscale + scale;
				testing += phrase[(int) u];
			}
			u--;
		}  
		for(long i=0;i <le;i++) {
			System.out.print(phrase[(int) i]); 
		}
	}

}
