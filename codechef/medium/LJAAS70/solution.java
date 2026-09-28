import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		int c= scanner.nextInt();
		
		if (a<b && b < c){
		    System.out.println("Increasing");
		    
		}
	else if (a < b && b > c) {
	    System.out.println("Decreasing");
	}
	else {
	    System.out.println("Neither");
	}
	// your code goes here
	
scanner.close();
	}
}
