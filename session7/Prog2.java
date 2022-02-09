//import java.util.Scanner;
class Prog2{
	public static void main(String[] args){
		
		int i = 0; //initialization
		while(i<5){ //condition
			System.out.println(i);
			i++;//increment / decrement
		}

		System.out.println("End of While");
		//int number;
		//Scanner sc = new Scanner(System.in);
		
		for(int j=0; j<10; j++){
			System.out.println(j);
		}
		System.out.println("End of For");

		int k = 0;
		for(;k<3;){
			System.out.println("*");
			k++;
		}
	}
}

