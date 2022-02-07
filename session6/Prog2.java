import java.util.Scanner;
class Prog2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a = 0;
		while(a!=-1){
			System.out.println("Enter a number:");
			a = sc.nextInt();
			switch(a){
				case 1: 
					System.out.println("Mon"); 
					break;
				case 2: 
					System.out.println("Tue"); 
					break;
				case 3: 
					System.out.println("Wed");
					break;
				case 4: System.out.println("Thu");
					break;
				case 5: System.out.println("Fri");
					break;
				case 6: System.out.println("Sat");
					break;
				case 7: System.out.println("Sun");
					break;
				default : System.out.println("Choose a number from 1 to 7!");
				//break;
			}
		}
		System.out.println("End of program!");	
	}
}