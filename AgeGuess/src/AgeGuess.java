import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message;
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your name?");
		message = scan.nextLine();
		System.out.println("Age Guess");
		message = scan.nextLine();
		System.out.print("You entered:\""+message+"\"");	
	}

}
