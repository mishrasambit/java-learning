import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		System.out.println("START");
		Scanner sc= new Scanner(System.in);
		int a = 0;
		while(a<100){
			System.out.println(a);
			System.out.println("Enter a number:");
			a = sc.nextInt();		
		}
		System.out.println("END");
		
	}
}