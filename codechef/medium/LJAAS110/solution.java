import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long factorial =1;
		int i =1;
		
		do {
		    factorial *= i;
		    i++;
		}while (i <= n);
		
		System.out.println(factorial);
		
		scanner.close();
		// your code goes here

	}
}
