import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalseconds;
		double hours, minutes,seconds, hms;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of seconds: ");
		totalseconds = scan.nextInt();
		hours= (totalseconds/3600);
		minutes = (totalseconds%3600)/60;
		seconds = (totalseconds%60);
		System.out.println("Hours, minutes, seconds:" + hours + minutes+ seconds);
		
		
		}

}
