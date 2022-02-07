import java.util.Scanner;

class MyProgram{
	public static void main(String[] args){
		//	int x = 5;
		//		x += 3; //x = x+3;
		//		x -= 3; //x = x-3;
		//		System.out.println(x);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number::");
		int x = sc.nextInt();
		System.out.println("Enter 2nd number::");
		int y = sc.nextInt();
		boolean result = x <= y;
		System.out.println("Result::");
		System.out.println(result);
	}
}


A   	B	A AND B		A OR B  NOT A	NOT B
0	0	0		0	1	1
0	1	0		1	1	0
1	0	0		1	0	1
1	1	1		1	0	0