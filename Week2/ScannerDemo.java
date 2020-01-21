import java.util.Scanner;

/**
 * Demo the Scanner class
 * @author Charlie MacFadyen
 *
 */
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scan.nextLine();
		
		System.out.println(name);
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Welcome, " + name+ ".  You are "+ age +" years old");

	}

}
