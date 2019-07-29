
import java.util.Random;

public class race {
	
	public static int Hare_position=0;
	public static int Tortoise_position=0;
	
	public static void tortoise(char[] position, int number){
		if(number==0 || number==1 || number==2 || number==3 || number==4){
			position[Hare_position]=' ';
			Hare_position+=3;

		}
		else if(number==5 || number==6){
			position[Hare_position]=' ';
			Hare_position-=6;
		}
		else{
			position[Hare_position]=' ';
			Hare_position+=1;
		}	
		
	}
	
	public static void Hare(char[] position, int number){
		if(number==0 || number==1 ){
		}
		else if(number==2 || number==3){
			position[Tortoise_position]=' ';
			Tortoise_position+=9;
		}
		else if(number==4){
			position[Tortoise_position]=' ';
			Tortoise_position-=12;
		}
		else if(number==5 || number==6 || number==7){
			position[Tortoise_position]=' ';
			Tortoise_position+=1;
		}
		else{
			position[Tortoise_position]=' ';
			Tortoise_position-=2;
		}
	
		
	}
	
	public static void display(char[] position,int iteration){
		int length=position.length;
		System.out.printf("%n%n");
		System.out.printf("Time: %d%n%n",iteration);
		if(Hare_position<0) {Hare_position=0; position[Hare_position]='H';}
		else{
			position[Hare_position]='H';	
		}
		
		if(Tortoise_position<0) {Tortoise_position=0; position[Tortoise_position]='T';}
		else{
			position[Tortoise_position]='T';
		}
		
		if(Hare_position==Tortoise_position) position[Hare_position]='B';
		for(int i=0;i<length;i++){
			System.out.print(position[i]);
			
		}
		System.out.printf("%n");
		for(int i=0;i<70;i++){
			System.out.print("-");
			
		}		
	}
	
	
	public static void main(String[] args) {
		int time=80;
		
		System.out.printf("ON YOUR MARK, GET SET%nBANG !!!!!%nAND THEY′RE OFF !!!!! %n");
		Random r= new Random();
		char[] position= new char[70];
		

		for(int i=0;i<70;i++){
			position[i]=' ';
		}
		display(position,0);
	/*	System.out.printf("%n");
		for(int i=0;i<70;i++){
			System.out.print("-");
			
		}*/
		int iteration=0;
		while(true){
			while(Hare_position<70 && Tortoise_position<70 && iteration<time){
				iteration+=1;
				int hare_number=(r.nextInt(10));
				int tor_number=(r.nextInt(10));
			
				Hare(position, hare_number);
				if(Hare_position>=70){
					System.out.printf("%nHare wins. Yuch.");
					System.out.printf("%nTime elapsed= %d seconds",iteration);
					break;
				}
				tortoise(position,tor_number);
				if(Tortoise_position>=70){
					System.out.printf("%nTORTOISE WINS!!! YAY!!!");
					System.out.printf("%nTime elapsed= %d seconds",iteration);
					break;
				}
				display(position,iteration);		
			}
			if(Hare_position>=70 || Tortoise_position>=70){
		
				break;
		
			}
			
			else if(Hare_position>=70 && Tortoise_position>=70){
				System.out.printf("%nIT'S A TIE!!!");
				System.out.printf("%nTime elapsed= %d seconds",iteration);
				break;	
			}
			if(Hare_position<70 && Tortoise_position<70){
				time=time*2;
				continue;		
			}
		
		}
		
	}

}
