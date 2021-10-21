import java.util.Scanner;

public class fibCodeItt {
	public static void main(String[] args) {
		
		long n1=0, n2=1, n3=0;
		long count = -1;

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

		//itterative form runs in for loop within the main
		if(count > 2 ){
			for(int i = 2; i < count; ++i){
				n3 = n1 + n2;
				System.out.println(n3);
				n1 = n2;
				n2 = n3;
			}
		}
	}
}
