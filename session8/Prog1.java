import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		int i = 0;
		/*do{				
			System.out.println(i++);
		}while(i<5);*/

		while(i<5){
			System.out.println(i++);
		}
		int number;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a number to even or odd:");
			number = sc.nextInt();
			if(number == -1){
				System.out.println("Program end");
			}else if (number % 2==0){
				System.out.println(number+" is even");
			}else{
				System.out.println(number+" is odd");
			}
		}while(number != -1);
			
	}
}