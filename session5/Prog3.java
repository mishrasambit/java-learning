import java.util.Scanner;
class Prog3{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		char color = sc.next().charAt(0);
		switch(color){
			case 'v': 
			case 'V': 
				System.out.println("Violet"); 
				break;
			case 'i': 
			case 'I': 
				System.out.println("Indigo"); 
				break;
			case 'b': System.out.println("Blue");
				break;
			default : System.out.println("Choose an alphabet from VIGBYOR!");
				//break;
		}
	}
}