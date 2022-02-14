import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x =	sc.nextInt();
		int y = sc.nextInt();
		int result = Math.max(x, y);
		System.out.println("Max between " +x +" and "+ y +" is "+result);
		result = Math.min(x, y);
		System.out.println("Min between " +x +" and "+ y +" is "+result);
		double sqrtresult = Math.sqrt(x);
		System.out.println("SQRT of " +x +" is "+sqrtresult );
	}	
}