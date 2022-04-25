import java.util.Scanner;
public class Average {
	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
int a,b,c;

	System.out.println("Enter the first number and hit enter: ");
	 a = input.nextInt();
	 System.out.println("Enter the second number and hit enter: ");
	 b = input.nextInt();
	 System.out.println("Enter the third number and hit enter: ");
	 c = input.nextInt();
	 int sum= a+b+c;
	 double average = (double) sum / 3;
		// YOUR CODE HERE

		// Edit the following lines to include the result numbers
		System.out.println("The numbers entered are: "+a+", "+b+", and "  + c);
		System.out.println("The sum of the numbers is: " + sum );
		System.out.println("The average of the numbers is: "+ average);

		input.close();
	}
}
