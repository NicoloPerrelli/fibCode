import java.util.Scanner;

public class fibCodeRec {
	
	//made static to hold same value across the whole class
	static long n1=0, n2=1, n3=0;
	static long count = -1;

	public static void main(String[] args) {

		//scanner for user input
		Scanner scan = new Scanner(System.in);

		//will loop till a positive number is placed
		//no decimal/character check yet. will crash out if user inputs bad input
		do{
			System.out.print("Enter any number: ");
			count = scan.nextInt();
		}while(count < 0);

		// close scanner after use
		scan.close();

		//for number selects bellow 2
		if (count == 1){System.out.println(0);}
		else{System.out.println(0 + "\n" + 1);}

		//checks if we even need to enter the funtion b/c count may be too small
		if(count > 2 ){
			fibonacci(count-2);
		}
	}

	static void fibonacci(long count){
		if(count > 0){
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			//calls itself till it fails the "if" statment at the top of the function.
			fibonacci(count-1);
		}
	}
}
