

public class MethodDemo 
{

	public static void main(String[] args) 
	{
		
		displayMessage();
		
		
		//Store two integers
		int num1 = 40;
		int num2 = 13;
		
		addNumbers(num1, -8);
		
		//find and display the difference of the integers
		int difference = subtractNumbers(num1, num2);
		System.out.println(difference);
				
		//find and display the product of the integers
		int prod = num1 * num2;
		System.out.println(prod);
		
		displayExitMessage();
		
}
	
	public static int subtractNumbers(int a, int b)
	{
		int diff = b - a;
		return diff;
	}
	public static void addNumbers(int x, int y)
	{
		//find and display the sum of the integers
				int sum = x + y;
				System.out.println(sum);
	}
	public static void displayMessage()
	{
		//Print explanation
				System.out.println("This program displays the sum, difference");
				System.out.println("and product of two stored numbers");
	}

	public static void displayExitMessage()
	{
		//Print exit message
				System.out.println("Execution complete");
	}
}
