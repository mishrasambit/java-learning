import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		if(a==1){
			
			System.out.println("Mon");
		}else if(a==2){
			System.out.println("Tue");
		}else if(a==3){
			System.out.println("Wed");
		}else if(a==4){
			System.out.println("Thu");
		}else if(a==5){
			System.out.println("Fri");
		}else if(a==6){
			System.out.println("Sat");
		}else if(a==7){
			System.out.println("Sun");
		}else{
			System.out.println("Choose a number from 1 to 7!");
		}
	}
}