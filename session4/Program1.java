import java.util.Scanner;

class Program1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even or odd");
		int x =	sc.nextInt();
		int mod = x % 2;
		if(mod == 0){
			System.out.println("Entered an even number");
		}else{
			System.out.println("Entered an odd number");
		}
		
		boolean result = ( x % 2 ) == 0;
		if(result){
			System.out.println("even number");
		}else{
			System.out.println("odd number");
		}
	}
}