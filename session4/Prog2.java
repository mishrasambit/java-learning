import java.util.Scanner;

class Prog2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers::");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("enter a for addition \n enter s for subtraction");
		System.out.println("enter d for divison\n enter m for multiplication");
		char operator = sc.next().charAt(0);
		System.out.println("You have entered following::");
		System.out.println(a);
		System.out.println(b);
		System.out.println(operator);
		boolean condition = (operator == 'a');
		System.out.println( condition );
		if(operator == 'a'){
			int result = a + b;
			System.out.println( "Addition is ::" );
			System.out.println( result );
		}else if(operator == 's'){
			int result = a - b;
			System.out.println( "Subtraction is ::" );
			System.out.println( result );
		}else if(operator == 'm'){
			int result = a * b;
			System.out.println( "Multiplication is ::" );
			System.out.println( result );
		}else if(operator == 'd'){
			int result = a / b;
			System.out.println( "Division is ::" );
			System.out.println( result );
		}else{
			System.out.println( "Operator did not match. Try again." );
		}

		


/*else {
			System.out.println( "ELSE part" );
			if(operator == 's'){
				int result = a - b;
				System.out.println( "Subtraction is ::" );
				System.out.println( result );
			}
		}*/
			
	}
}

